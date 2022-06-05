/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chassis;

/**
 * @author destasandya
 */
public class VehicleChassis implements Chassis {
// Declare generic chassis variable.

    private String chassisName;

    public VehicleChassis() {
        this.chassisName = Chassis.chassis;
    }

    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        this.chassisName = vehicleChassis;
    }

    public String toString() {
        return "Chassis Name : " + this.chassisName;
    }

    public static void main(String[] args) {
        // Test default constructor and print instance attributes.
        System.out.println("------------------------------------------------------------");
        VehicleChassis vc1 = new VehicleChassis();
        System.out.println(vc1);

// Test overloaded constructor and print instance attributes.
        System.out.println("------------------------------------------------------------");
        VehicleChassis vc2 = new VehicleChassis("Test Chassis");
        System.out.println(vc2);

    }
}
