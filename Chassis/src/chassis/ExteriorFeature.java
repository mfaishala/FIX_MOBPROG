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
public class ExteriorFeature implements Feature {
    // Declare local variables.

    private String exteriorFeature;

    /**
     * Default constructor for ExteriorFeature
     */
    public ExteriorFeature() {
        this.exteriorFeature = "Generic";
    }

    /* Default constructor for ExteriorFeature

     */
    public ExteriorFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }

    /**
     * Implement method definitions.
     */
    public String getFeature() {
        return this.exteriorFeature;
    }

    public void setFeature(String feature) {
        this.exteriorFeature = feature;
    }

    /*
* Override the toString() method.
     */
    public String toString() {
        return "Exterior [" + this.exteriorFeature + "]";
    }

    public static void main(String[] args) {
// Test default constructor and print instance attributes.
        System.out.println("----------------------------------------------------");
        ExteriorFeature ef1 = new ExteriorFeature();
        System.out.println(ef1);
// Test overloaded constructor and print instance attributes.
        System.out.println("---------------------------------------------------");
        ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
        System.out.println(ef2);
        System.out.println("------------------------------------------------------");
    }
}
