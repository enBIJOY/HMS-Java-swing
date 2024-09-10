package com.hms.model;

/**
 *
 * @author Bijoy
 */
public class PathologicalTest extends LabTest implements CostCalculation , TestReport {
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
     /**
     * @return the cost
     */
    
    public String getreagent() {
        return reagent;
    }
    
    public double getCost() {
        return cost;
    }
    /**
     * @return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @param cost the cost to set
     */
//    public void setTitle(String reagent) {
//        this.reagent = reagent;
//    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    String reagent;
    
    public PathologicalTest(String title, double cost, boolean isAvailable, String reagent){
        this.title = title;
        this.cost = cost;
        this.reagent = reagent;
        this.isAvailable = isAvailable;               
    }
    public String show(){
        String output = "Test name: "+this.getTitle()+"<br>"
                + "Cost: "+this.getCost()+"<br>"
                + "Availability: "+this.isIsAvailable();
        return output;
    }
    public void search(String title){
        if(this.getTitle() == title )
            show();
        else
            System.out.println("Not found");
    } 
    
    @Override
    public double calcCost() {
        double totalCost=0;
        return totalCost;
    }
 //   @Override
    public boolean deliverReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}