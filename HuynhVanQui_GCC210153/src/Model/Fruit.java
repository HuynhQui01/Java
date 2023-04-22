/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author MY LAPTOP
 */
public class Fruit implements Serializable{
    private String name;
    private Double quantity;
    private int inPrice;
    private int outPrice;

    public Fruit(String name, Double quantity, int inPrice, int outPrice) {
        this.name = name;
        this.quantity = quantity;
        this.inPrice = inPrice;
        this.outPrice = outPrice;
    }

    public Fruit() {
    }
    

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = (quantity>=0)?quantity:0;
    }

    public int getInPrice() {
        return inPrice;
    }

    public void setInPrice(int inPrice) {
        this.inPrice = (inPrice>=0)?inPrice:0;
    }

    public int getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(int outPrice) {
        this.outPrice = (outPrice>=0)?outPrice:0;
    }
    
}
