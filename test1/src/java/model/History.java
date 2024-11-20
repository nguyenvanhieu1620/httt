/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.util.Date;

/**
 *
 * @author OS
 */
public class History {
    
    Integer id;
    Date history;
    Float hollandIndex;
    String result;

    public History(Integer id, Date history, Float hollandIndex, String result) {
        this.id = id;
        this.history = history;
        this.hollandIndex = hollandIndex;
        this.result = result;
    }

    public History() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHistory() {
        return history;
    }

    public void setHistory(Date history) {
        this.history = history;
    }

    public Float getHollandIndex() {
        return hollandIndex;
    }

    public void setHollandIndex(Float hollandIndex) {
        this.hollandIndex = hollandIndex;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
}
