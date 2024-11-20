/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author THINKPAD
 */
public class CareerChart implements Comparable<CareerChart>{
    String career;
    String displayName;
    Integer quantity;

    public CareerChart(String career, Integer quantity) {
        this.career = career;
        this.quantity = quantity;
    }

    public CareerChart() {
    }
    

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

   

    @Override
    public int compareTo(CareerChart t) {
        return this.getCareer().compareTo(t.getCareer());
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
    
    
}
