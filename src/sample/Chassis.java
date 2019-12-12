package sample;

/** @author Samuel Njenga */

/**
 * public interface chassis that is implemented by Vehicle, VehicleChassis and VehicleFrame classes.
 */
public interface Chassis {

  /** Interface field. */
  public final String chassis = "Chassis";

  /**
   * Public getter method getChassisType.
   *
   * @return returns a Chassis type value.
   */
  public Chassis getChassisType();

  /**
   * Public setter setChassisType with one parameter.
   *
   * @param vehicleChassis receives a string value as an argument.
   */
  public void setChassisType(String vehicleChassis);
}
