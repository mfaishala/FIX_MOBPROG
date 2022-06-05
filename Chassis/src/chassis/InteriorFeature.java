/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chassis;

/**
 *
 * @author destasandya
 */
public class InteriorFeature implements Feature {

    private String interiorFeature;

    /**
     * Default constructor for InteriorFeature
     */
    public InteriorFeature() {
        this.interiorFeature = "Generic";
    }

    /**
     * Default constructor for InteriorFeature
     */
    public InteriorFeature(String interiorFeature) {
        this.interiorFeature = interiorFeature;
    }

    /**
     * Implement method definitions.
     */
    public String getFeature() {
        return this.interiorFeature;
    }

    public void setFeature(String feature) {
        this.interiorFeature = feature;
    }

    /*
* Override the toString() method.
     */
    public String toString() {
        return "Interior [" + this.interiorFeature + "]";
    }
//Driver

    public static void main(String[] args) {
// Test default constructor and print instance attributes.
        System.out.println("----------------------------------------------");
        InteriorFeature if1 = new InteriorFeature();
        System.out.println(if1);
// Test overloaded constructor and print instance attributes.
        System.out.println("--------------------------------------------");
        InteriorFeature if2 = new InteriorFeature("Climate Control");
        System.out.println(if2);
// Test case for equal() method.
        System.out.println("----------------------------------------------");
    }
}
