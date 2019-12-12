package sample;

/** @author Samuel Njenga. */
import java.util.Date;

/** public interface Engine is implemented by ManufacturedEngine and Vehicle class. */
public interface Engine {
  /**
   * Public setter for engineCylinders.
   *
   * @param engineCylinders receives an integer value as an argument.
   */
  public void setEngineCylinders(int engineCylinders);

  /**
   * Public setter for manufacturing date.
   *
   * @param date receives a Date type value as an argument.
   */
  public void setEngineManufacturedDate(Date date);

  /**
   * Public setter for engine manufacturer.
   *
   * @param engineManufacturer receives a string value as an argument.
   */
  public void setEngineManufacturer(String engineManufacturer);

  /**
   * Public setter for engine make.
   *
   * @param engineMake receives a String value as an argument.
   */
  public void setEngineMake(String engineMake);

  /**
   * Public setter for engine model.
   *
   * @param engineModel receives a String value as an argument.
   */
  public void setEngineModel(String engineModel);

  /**
   * Public setter for drive train.
   *
   * @param driveTrain receives a String value as an argument.
   */
  public void setDriveTrain(String driveTrain);

  /**
   * Public setter for fuel type.
   *
   * @param fuel receives a String value as an argument.
   */
  public void setEngineType(String fuel);
}
