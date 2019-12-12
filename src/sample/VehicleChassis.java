package sample;

/** @author Samuel Njenga. */

/** Class VehicleChassis implements the functionality of the chassis interface. */
public class VehicleChassis implements Chassis {

  /** Class field */
  private String chassisName;

  /** Default constructor with no parameters. */
  public VehicleChassis() {
    this.chassisName = Chassis.chassis;
  }

  /**
   * Overloading constructor with one parameter.
   *
   * @param chassisName receives a String value as an argument.
   */
  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  /**
   * Public setter for chassisName.
   *
   * @param VehicleChassis receives a String value as an argument.
   */
  public void setChassisType(String VehicleChassis) {
    this.chassisName = VehicleChassis;
  }

  /**
   * Public getter for Chassis type
   *
   * @return returns an instance of the interface chassis
   */
  public Chassis getChassisType() {
    return this;
  }

  /**
   * Public toString that overrides the class toString.
   *
   * @return returns a String value.
   */
  public String toString() {
    return "Chassis Name  : " + this.chassisName;
  }
  /**
   * static main method for testing class objects.
   *
   * @param args String values passed into array by command line to run program.
   */
  public static void main(String[] args) {
    VehicleChassis chassis1 = new VehicleChassis();
    System.out.println(chassis1);

    System.out.println(
        "----------------------------------------------------------------------------------");

    VehicleChassis chassis2 = new VehicleChassis("Test Chassis");
    System.out.println(chassis2);
  }
}
