/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.masterihm.component.piemenu.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Geekette
 */
public class JPieMenuItem extends JPanel {

    private enum STATE {
        IDLE, HIGHLIGHTED
    }

    private STATE state;

    private String text;

    private int radius;
    
    private int originAngle;
    private int slipAngle;
    private double cosOrigin;
    private double sinOrigin;
    private double cosTarget;
    private double sinTarget;
    private double cosMiddle;
    private double sinMiddle;

    private Color backgroundColor;
    private Color highlightColor;

    private List<ActionListener> listeners;

    public JPieMenuItem() {
        this("PieMenuItem");
    }

    public JPieMenuItem(String text) {
        this.text = text;
        this.listeners = new ArrayList<>();
        this.originAngle = 0;
        this.slipAngle = 0;
        this.backgroundColor = Color.LIGHT_GRAY;
        this.highlightColor = Color.DARK_GRAY;
        this.setBounds(0, 0, 200, 200);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switch (state) {
                    case IDLE:
                        //impossible
                        break;
                    case HIGHLIGHTED:
                        //rien
                        break;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                switch (state) {
                    case IDLE:
                        //impossible
                        break;
                    case HIGHLIGHTED:
                        //rien
                        break;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                switch (state) {
                    case IDLE:
                        //impossible
                        break;
                    case HIGHLIGHTED:
                        state = STATE.IDLE;
                        raiseEvent(e);
                        repaint();
                        break;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                switch (state) {
                    case IDLE:
                        state = STATE.HIGHLIGHTED;
                        repaint();
                        break;
                    case HIGHLIGHTED:
                        //impossible
                        break;
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                switch (state) {
                    case IDLE:
                        //impossible
                        break;
                    case HIGHLIGHTED:
                        state = STATE.IDLE;
                        repaint();
                        break;
                }
            }
        });
        init();
    }

    private void init() {
        this.state = STATE.IDLE;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getHighlightColor() {
        return highlightColor;
    }

    public void setHighlightColor(Color highlightColor) {
        this.highlightColor = highlightColor;
    }

    protected void setOringinAngle(int angle) {
        this.originAngle = angle;
        computeCosSin();
    }

    protected void setSlipAngle(int angle) {
        this.slipAngle = angle;
        computeCosSin();
    }

    protected int getRadius() {
        return radius;
    }

    protected void setRadius(int radius) {
        this.radius = radius;
    }
    
    

    private void computeCosSin() {
        this.cosOrigin = Math.cos(Math.toRadians(originAngle));
        this.sinOrigin = Math.sin(Math.toRadians(originAngle));
        this.cosTarget = Math.cos(Math.toRadians(originAngle+slipAngle));
        this.sinTarget = Math.sin(Math.toRadians(originAngle+slipAngle));
        this.cosMiddle = Math.cos(Math.toRadians(originAngle+slipAngle/2));
        this.sinMiddle = Math.sin(Math.toRadians(originAngle+slipAngle/2));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(radius*2, radius*2);
    }

    public void addActionListener(ActionListener listener) {
        this.listeners.add(listener);
    }

    public void removeActionListener(ActionListener listener) {
        this.listeners.remove(listener);
    }

    private void raiseEvent(MouseEvent e) {
        for (ActionListener al : listeners) {
            al.actionPerformed(new ActionEvent(this, 0, null));
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(new Color(0, 0, 0, 0));
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        switch (state) {
            case IDLE:
                g.setColor(this.backgroundColor);
                break;
            case HIGHLIGHTED:
                g.setColor(this.highlightColor);
                break;
        }
        g.fillArc(0, 0, getParent().getWidth(), getParent().getHeight(), originAngle, slipAngle);
        g.setColor(Color.BLACK);
        g.drawArc(0, 0, getWidth(), getHeight(), originAngle, slipAngle);
        g.drawLine(radius, radius, (int) (radius + radius * cosOrigin), (int) (radius + radius * sinOrigin));
        g.drawLine(radius, radius, (int) (radius + radius * cosTarget), (int) (radius + radius * sinTarget));
        g.drawString(text, (int) (radius + ((2*radius/3) * cosMiddle) - (text.length()*3)), (int) (radius - (2*radius/3) * sinMiddle));
        //System.out.println("Origin Angle : " + originAngle + " Slip ANgle : " + slipAngle);
    }

    @Override
    public boolean contains(int x, int y) {
        boolean contains = false;
        float angle = (float) Math.toDegrees(Math.atan2(radius - y, x - radius));
        if (angle < 0) {
            angle += 360;
        }
        if (angle > originAngle && angle < originAngle + slipAngle) {
            if (Point2D.distance(radius, radius, x, y) < radius) {
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public boolean contains(Point p) {
        return contains(p.x, p.y);
    }

}
