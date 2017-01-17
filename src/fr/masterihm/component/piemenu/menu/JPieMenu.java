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
import javax.swing.JButton;
import javax.swing.JLayeredPane;

/**
 *
 * @author Geekette
 */
public class JPieMenu extends JLayeredPane{

    private int nbItem;
    private int slipAngle;
    
    public JPieMenu(){
        super();
    }

    
    public void addPieMenuItem(PieMenuItem item) throws TooManyItemsException{
        if(getComponentCount() == 8) throw new TooManyItemsException();
        this.add(item, getComponentCount());
        computeAngles();
    }
    
    public void removePieMenuItem(PieMenuItem item){
        this.remove(item);
        computeAngles();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(new Color(0,0,0,0));
        super.paint(g2d);               
    }
    
    
    
    private void computeAngles(){
        nbItem = getComponentCount();
        slipAngle = 360/nbItem;
        Component item;
        PieMenuItem pieMenuItem;
        for(int i = 0; i<nbItem; i++){
            item = getComponent(i);
            if(item instanceof PieMenuItem){
               pieMenuItem = (PieMenuItem) item;
               pieMenuItem.setOringinAngle(slipAngle*i);
               pieMenuItem.setSlipAngle(slipAngle);
            }
        }
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
    
    
    
}
