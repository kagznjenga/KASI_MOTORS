package sample;

/** @author Samuel Njenga. */

/** VehicleFrame class implements the Chassis interface. */
public class VehicleFrame implements Chassis {
  /** Class field. */
  private String vehicleFrameType;

  /** Default constructor. */
  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  /**
   * Overloading constructor with one parameter.
   *
   * @param vehicleFrameType receives a String value as an argument.
   */
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
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
   * Public setter for vehicleFrameType.
   *
   * @param vehicleFrameType receives a String value as an argument.
   */
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * Overload class toString.
   *
   * @return returns a string value.
   */
  public String toString() {
    return "Chassis    :  "
        + VehicleFrame.chassis
        + "\n"
        + "Vehicle Frame : "
        + this.vehicleFrameType;
  }

  /**
   * Static main method for testing objects.
   *
   * @param args String values passed into array by command line to run program.
   */
  public static void main(String[] args) {
    VehicleFrame frame1 = new VehicleFrame();
    System.out.println(frame1);

    System.out.println(
        "----------------------------------------------------------------------------------");

    VehicleFrame frame2 = new VehicleFrame("ladder Frame");
    System.out.println(frame2);
  }
}
