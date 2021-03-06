/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.masterihm.component.piemenu.menu;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLayeredPane;
import javax.swing.Popup;
import javax.swing.PopupFactory;

/**
 *
 * @author Geekette
 */
public class JPieMenu extends JLayeredPane {

    private int nbItem;
    private int slipAngle;

    private boolean autoClose;
    private int radius;
    private Component parent;
    private enum States {VISIBLE, HIDDEN };
    
    private States state;

    Popup popup;

    ParentListener parentListener;

    public JPieMenu() {
        super();
        autoClose = true;
        state = States.HIDDEN;
        radius = 100;
        this.parentListener = new ParentListener(this);
    }

    public JPieMenu(int radius) {
        super();
        this.radius = radius;
    }

    public JPieMenu(boolean autoClose) {
        this.autoClose = autoClose;
    }

    public JPieMenu(boolean autoClose, int radius) {
        this.autoClose = autoClose;
        this.radius = radius;
    }

    public void show(Component parent, int x, int y) {
        if (this.parent != null) {
            this.parent.removeMouseListener(parentListener);
        }
        this.parent = parent;
        this.parent.addMouseListener(parentListener);
        
        switch (state){
            case VISIBLE:
                popup.hide();
                popup = new PopupFactory().getPopup(parent, this, x - radius, y - radius);
                popup.show();                
                break;
            case HIDDEN:
                state = States.VISIBLE;
                popup = new PopupFactory().getPopup(parent, this, x - radius, y - radius);
                popup.show();
                break;            
        }
    }

    public void hide() {
        switch (state){
            case VISIBLE:
                state = States.HIDDEN;
                popup.hide();
                break;
            case HIDDEN:
                state = States.HIDDEN;
                break;            
        }
    }

    public void addPieMenuItem(JPieMenuItem item) throws TooManyItemsException {
        if (getComponentCount() == 8) {
            throw new TooManyItemsException();
        }
        item.setRadius(this.radius);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (autoClose) {
                    hide();
                }
            }
        });
        this.add(item);
        computeAngles();
    }

    public void removePieMenuItem(JPieMenuItem item) {
        this.remove(item);
        computeAngles();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(new Color(0, 0, 0, 0));
        super.paint(g2d);
    }

    private void computeAngles() {
        nbItem = getComponentCount();
        slipAngle = 360 / nbItem;
        Component item;
        JPieMenuItem pieMenuItem;
        for (int i = 0; i < nbItem; i++) {
            item = getComponent(i);
            if (item instanceof JPieMenuItem) {
                pieMenuItem = (JPieMenuItem) item;
                pieMenuItem.setOringinAngle(slipAngle * i);
                pieMenuItem.setSlipAngle(slipAngle);
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(2 * radius, 2 * radius);
    }

    public boolean isAutoClose() {
        return autoClose;
    }

    public void setAutoClose(boolean autoClose) {
        this.autoClose = autoClose;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        for (int i = 0; i < getComponentCount(); i++) {
            if (getComponent(i) instanceof JPieMenuItem) {
                ((JPieMenuItem) getComponent(i)).setRadius(this.radius);
            }
        }
    }

    @Override
    public boolean contains(int x, int y) {
        boolean itContains = false;
        if (Math.sqrt(Math.pow(x - radius, 2) + Math.pow(y - radius, 2)) < radius) {
            itContains = true;
        }
        return itContains;
    }

    @Override
    public boolean contains(Point p) {
        return contains(p.x, p.y);
    }

}

class ParentListener implements MouseListener {

    JPieMenu myMenu;

    public ParentListener(JPieMenu menu) {
        this.myMenu = menu;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //rien
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        myMenu.hide();

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //rien
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //rien
    }

}
