package sample;

/** @author Samuel Njenga. */
import java.util.Date;

/** ManufacturedEngine class implements the Engine interface. */
public class ManufacturedEngine implements Engine {

  /** Class attributes/fields. */
  private String engineManufacturer;

  private Date engineManufacturedDate;

  private String engineMake;

  private String engineModel;

  private int engineCylinders;

  private String engineType;

  private String driveTrain;

  /** Default Constructors. */
  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "generic";
    this.engineCylinders = 0;
    this.engineType = "85 AKI";
    this.driveTrain = "2wd: Two-Wheel Drive";
  }

  /**
   * Overloading constructor.
   *
   * @param engineManufacturer receives a string value.
   * @param engineManufacturerDate receives a Date type value.
   * @param engineMake receives a string value.
   * @param engineModel receives a string value.
   * @param engineCylinders receives an integer value.
   * @param driveTrain receives a string value.
   */
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufacturerDate,
      String engineMake,
      String engineModel,
      int engineCylinders,
      String engineType,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturerDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.driveTrain = driveTrain;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
  }

  /**
   * Public setter for date.
   *
   * @param date receives a Date type value as an argument.
   */
  public final void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  /**
   * Public setter for engine manufacturer.
   *
   * @param manufacturer receives a string value.
   */
  public final void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  /**
   * public setter for engineMake.
   *
   * @param engineMake receives a String value as an argument.
   */
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * public setter for engineModel.
   *
   * @param engineModel receives a String value as an argument.
   */
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * public setter for engineType
   *
   * @param fuel receives a String value as an argument.
   */
  public final void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  /**
   * public setter for engineCylinders.
   *
   * @param engineCylinders receives an integer value as an argument.
   */
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * public setter for driveTrain.
   *
   * @param driveTrain receives a String value as an argument.
   */
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * Overload toString.
   *
   * @return returns a String value.
   */
  public String toString() {
    return "Engine Manufacturer : "
        + this.engineManufacturer
        + "\n"
        + "Engine Manufactured : "
        + this.engineManufacturedDate.toString()
        + "\n"
        + "Engine Make : "
        + this.engineMake
        + "\n"
        + "Engine Model : "
        + this.engineModel
        + "\n"
        + "Engine Type : "
        + this.engineType
        + "\n"
        + "Engine Cylinders : "
        + this.engineCylinders
        + "\n"
        + "Drive Train : "
        + this.driveTrain;
  }

  /**
   * main method for testing objects.
   *
   * @param args String values passed into array by command line to run program.
   */
  public static void main(String[] args) {
    ManufacturedEngine engine1 = new ManufacturedEngine();
    System.out.println(engine1);

    System.out.println(
        "----------------------------------------------------------------------------------");
    ManufacturedEngine engine2 =
        new ManufacturedEngine(
            "Honda",
            new Date(1325599999999L),
            "H-Series",
            "H23A1",
            4,
            "88 AKI",
            "2WD: Two-Wheel Drive");
    System.out.println(engine2);
  }
}
