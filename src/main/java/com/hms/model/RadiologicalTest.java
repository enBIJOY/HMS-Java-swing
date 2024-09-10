/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Bijoy
 */


public class RadiologicalTest extends LabTest implements CostCalculation , TestReport {
    private String plateDimention;
    
    public RadiologicalTest(String title, double cost, boolean isAvailable, String plateDimention){
        this.title = title;

        this.cost = cost;
        this.isAvailable = isAvailable;
        this.plateDimention = plateDimention;
    }
    public String retunLabTestInfo(){
        String output = "Test name: "+this.title+"\n"
                + "Cost: "+this.cost+"\n"
                +"Plate Dimention: "+ this.plateDimention+"\n" 
                + "Availability: "+this.isAvailable;
        return output;
    }


    @Override
    public double calcCost() {
        double totalCost=this.cost-this.cost;
        return totalCost;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    @Override
    public boolean deliverReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

//    private String title;
//    private double cost;
//    private boolean isAvailable;
    
