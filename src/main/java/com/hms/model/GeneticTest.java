/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author BIJOY
 */
public class GeneticTest extends LabTest implements CostCalculation, TestReport {

    public String reagent1;
    
    public GeneticTest (String title, double cost, boolean isAvailable, String reagent1){
        this.title = title;
        this.cost = cost;
        this.reagent1 = reagent1;
        this.isAvailable = isAvailable;               
    }
    public String show(){
        String output = "Test name: "+this.title+"\n"
                + "Cost: "+this.cost+"\n"
                +"Plate Dimention: "+ this.reagent1+"\n" 
                + "Availability: "+this.isAvailable;
        return output;
    }
    
    @Override
    public double calcCost() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    @Override
    public boolean deliverReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}