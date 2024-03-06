public class Car extends Vehicle{

    //---------------VARIABLES-------------------
    public String shape = "";
    public int doors = 0;
    public String shifterType = "";
    public int capacityOfTrunk= 0;


    //------------CONSTRUCTOR--------------------
    public Car(String brand, int yearOfProduction, int vin, String model, String shape, int doors, String shifterType, int capacityOfTrunk) {
        super(brand, yearOfProduction, vin, model);
        this.shape = shape;
        this.doors = doors;
        this.shifterType = shifterType;
        this.capacityOfTrunk = capacityOfTrunk;
    }

    //---------------GETTERS & SETTERS--------------------
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getShifterType() {
        return shifterType;
    }

    public void setShifterType(String shifterType) {
        this.shifterType = shifterType;
    }

    public int getCapacityOfTrunk() {
        return capacityOfTrunk;
    }

    public void setCapacityOfTrunk(int capacityOfTrunk) {
        this.capacityOfTrunk = capacityOfTrunk;
    }

    //-----------------METHODS ----------------------
    public void brake(){
        System.out.println("You are breaking");
    }

    public void accelerate(){
        System.out.println("You are accelerating");
    }

    public void turn(){
        System.out.println("You are turning");
    }
    public void lock_doors(){
        System.out.println("You look the doors");
    }
    public void setupVehicle(){
        System.out.println("Podaj markę auta: ");
        this.brand = scanner.nextLine();
        System.out.println("Podaj model auta: ");
        this.model = scanner.nextLine();
        System.out.println("Podaj rok produkcji auta: ");
        this.yearOfProduction = scanner.nextInt();
        System.out.println("Podaj nr vin");
        this.setVin(scanner.nextInt());
        System.out.println("Podaj krztałt");
        this.setShape(scanner.nextLine());
        System.out.println("Podaj ilosć drzwi w pojeździe: ");
        this.setDoors(scanner.nextInt());
        System.out.println("Podaj rodzaj skrzyni biegów: ");
        this.setShifterType(scanner.nextLine());
        System.out.println("Podaj pojemność bagażnika: ");
        this.setCapacityOfTrunk(scanner.nextInt());

        System.out.println("Twoje auto to " + getBrand() + " " + getModel() + " " + getShape() + " " + getVin() + " " + getYearOfProduction() + " " + getShifterType() + " " + getDoors() + " " + getCapacityOfTrunk());
    }
}
