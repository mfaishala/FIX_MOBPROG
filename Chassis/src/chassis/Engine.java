/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chassis;

import java.util.Date;

/**
 *
 * @author destasandya
 */
public interface Engine {

    public void setEngineCylinders(int engineCylinders);

    public void setEngineManufacturedDate(Date date);

    public void setEngineManufacturer(String manufacturer);

    public void setEngineMake(String engineMake);

    public void setEngineModel(String engineModel);

    public void setDriveTrain(String driveTrain);

    public void setEngineType(String fuel);
}
