/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chassis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author destasandya
 */
public class ManufacturedEngine implements Engine {

    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    /*
     * Constructor for objects of class Engine.
     */
    public ManufacturedEngine() {
        // Initialize vehicle.
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date();
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineCylinders = 0;
        this.engineType = "85 AKI";
        this.driveTrain = "2WD: Two-Wheel Drive";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
                              String engineMake, String engineModel,
                              String driveTrain, int engineCylinders,
                              String engineType) {
        // Initialize vehicle.
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.driveTrain = driveTrain;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
    }

    /**
     * Declare method definitions.
     */
    public final void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    public final void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public final void setEngineType(String fuel) {
        this.engineType = fuel;
    }

    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    /*
     * Override the toString() method.
     */
    public String toString() {

        SimpleDateFormat ft
                = new SimpleDateFormat("E, dd-MM-yyyy");

// Print instance description.
        return "Engine Manufacturer : " + this.engineManufacturer + "\n"
                + "Engine Manufactured : " + ft.format(this.engineManufacturedDate).toString() + "\n"
                + "Engine Make : " + this.engineMake + "\n"
                + "Engine Model : " + this.engineModel + "\n"
                + "Engine Type : " + this.engineType + "\n"
                + "Engine Cylinders : " + this.engineCylinders + "\n"
                + "Drive Train : " + this.driveTrain;
    }

    /*
     * Test default constructor and print instance attributes.
     */
    public static void main(String[] args) {
        // Test default constructor and print instance attributes.
        System.out.println("------------------------------------------------------");
        ManufacturedEngine me1 = new ManufacturedEngine();
        System.out.println(me1);
        // Test overloaded constructor and print instance attributes.
        System.out.println("------------------------------------------------------");

        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String input = "02-02-2012";
        Date t = null;
        try {
            t = ft.parse(input);
        } catch (ParseException ex) {
            System.out.println("salah input tanggal");
        }

        ManufacturedEngine me2 = new ManufacturedEngine("Honda", t, "H-Series", "H23A1",
                "2WD: Two-Wheel Drive", 4,
                "88 AKI");
        System.out.println(me2);
        System.out.println("------------------------------------------------------");
    }
}
