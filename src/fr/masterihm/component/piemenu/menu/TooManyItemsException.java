/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.masterihm.component.piemenu.menu;

/**
 *
 * @author Geekette
 */
public class TooManyItemsException extends Exception{

    public TooManyItemsException() {
        super("JPieMenu cannot contains more than 8 (eight) items.");
    }
       
    
}
