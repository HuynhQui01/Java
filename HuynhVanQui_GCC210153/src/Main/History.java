/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.io.Serializable;

/**
 *
 * @author MY LAPTOP
 */
public class History implements Serializable{
    private int ID;
    private String name;
    private Double quantity;
    private int total;
    private String status;
    private String Date;

    public History(int ID, String name, Double quantity, int total, String status, String Date) {
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.total = total;
        this.status = status;
        this.Date = Date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = (total>=0)?total:0;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
}
