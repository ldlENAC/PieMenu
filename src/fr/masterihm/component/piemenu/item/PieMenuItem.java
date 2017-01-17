/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.masterihm.component.piemenu.item;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
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
import java.beans.EventHandler;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Geekette
 */
public class PieMenuItem extends JPanel {

    private String text;
    private EventHandler handler;

    private int originAngle;
    private int slipAngle;
    private double cosOrigin;
    private double sinOrigin;
    private double cosTarget;
    private double sinTarget;
    
    private Color color;

    private List<ActionListener> listeners;

    public PieMenuItem(String text) {
        this.text = text;
        this.listeners = new ArrayList<>();
        this.originAngle = 0;
        this.slipAngle = 0;
        this.color = Color.LIGHT_GRAY;
        this.setBounds(0, 0, 200, 200);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                raiseEvent(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                color = Color.DARK_GRAY;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                color = Color.LIGHT_GRAY;
                repaint();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public void setOringinAngle(int angle) {
        this.originAngle = angle;
        computeCosSin();
    }

    public void setSlipAngle(int angle) {
        this.slipAngle = angle;
    }

    private void computeCosSin() {
        this.cosOrigin = Math.cos(Math.toRadians(originAngle));
        this.sinOrigin = Math.sin(Math.toRadians(originAngle));
    }

    @Override
    public void paint(Graphics g) {
        //super.paintComponent(g);
        System.out.println("paint SlipAngle: " + slipAngle + " OriginAngle: " + originAngle );
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(new Color(0, 0, 0, 0));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(this.color);
        g2d.fillArc(0, 0, getParent().getWidth(), getParent().getHeight(), originAngle, slipAngle);
        g2d.setColor(Color.BLACK);
        g2d.drawArc(0, 0, getWidth(), getHeight(), originAngle, slipAngle);
        g2d.drawLine(100, 100, (int) (100 + 100 * cosOrigin), (int) (100 + 100 * sinOrigin));
        g2d.drawString(text, (int) (100 + 10 * cosOrigin), (int) (100 + 10 * sinOrigin));
        //g2d.drawString("String", 15, 15);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(199, 199);
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
    public boolean contains(int x, int y) {
        boolean contain = false;
        float angle = (float) Math.toDegrees(Math.atan2(100 - y, x - 100));
        if (angle < 0) {
            angle += 360;
        }
        System.out.println("angle : " + angle);
        if (angle > originAngle && angle < originAngle + slipAngle) {
            if (Point2D.distance(100, 100, x, y) < 100) {
                contain = true;
            }
        }
        return contain;
    }

    @Override
    public boolean contains(Point p) {
        return contains(p.x, p.y);
    }

}
