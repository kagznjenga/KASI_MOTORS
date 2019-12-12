package sample;

/** @author Samuel Njenga. */
import java.util.Date;

/** Public template for vehicle objects that implements the Engines and Chassis interface. */
public class Vehicle implements Engine, Chassis {
  /** Class fields. */
  private Date vehicleManufacturedDate;

  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  String driveTrain;
  private Engine vehicleEngine;

  /** Default Constructor */
  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleType = "None";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("88 AKI");
    this.vehicleEngine.setDriveTrain("2WD: Two-Wheel Drive");
  }

  /**
   * Overloading constructor.
   *
   * @param vehicleManufacturer receives a string value.
   * @param vehicleManufacturedDate receives a Date type value.
   * @param vehicleMake receives a string value.
   * @param vehicleModel receives a string value.
   * @param vehicleType receives a string value.
   * @param vehicleFrame receives a Chassis type object.
   * @param engine receives an Engine type object.
   */
  public Vehicle(
      String vehicleManufacturer,
      Date vehicleManufacturedDate,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      Engine engine) {

    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleType = vehicleType;
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = engine;
  }

  /**
   * public setter for engine cylinders.
   *
   * @param engineCylinders receives an integer value as an argument.
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  /**
   * public setter for manufactured date.
   *
   * @param date receives a Date type value as an argument.
   */
  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  /**
   * public setter for manufacturer.
   *
   * @param manufacturer receives a string value.
   */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  /**
   * public setter for engine make.
   *
   * @param engineMake receives a String value as an argument.
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  /**
   * public setter for engine model.
   *
   * @param engineModel receives a String value as an argument.
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  /**
   * public setter for drive train.
   *
   * @param driveTrain receives a String value as an argument.
   */
  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  /**
   * public setter for engine fuel.
   *
   * @param fuel receives a String value as an argument.
   */
  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  /**
   * public getter for chassis type.
   *
   * @return returns a Chassis type value.
   */
  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  /**
   * public setter for chassis type.
   *
   * @param vehicleChassis receives a string value as an argument.
   */
  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  /**
   * Overrides class to string method.
   *
   * @return a string value.
   */
  public String toString() {
    // Print instance description.
    return "Manufacturer Name   : "
        + this.vehicleManufacturer
        + "\n"
        + "Manufactured Date   : "
        + this.vehicleManufacturedDate.toString()
        + "\n"
        + "Vehicle Make        : "
        + this.vehicleMake
        + "\n"
        + "Vehicle Model       : "
        + this.vehicleModel
        + "\n"
        + "Vehicle Type        : "
        + this.vehicleType
        + "\n"
        + vehicleEngine.toString();
  }

  public static void main(String[] args) {
    Vehicle vehicle1 = new Vehicle();
    System.out.println(vehicle1);

    System.out.println(
        "----------------------------------------------------------------------------------");

    Vehicle vehicle2 =
        new Vehicle(
            "Honda",
            new Date(1325599999999L),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", 4, "88 AKi", "2WD: Two-Wheel Drive"));
    System.out.println(vehicle2);
  }
}
