public class Truck extends Vehicle{

    //--------------VARIABLES------------------

    public Double height = 0.0;
    public int TrunkCapacity = 0;
    public int trailerAmount = 0;
    public int axis = 0;

    //-----------CONSTRUCTOR---------------
    public Truck(String brand, int yearOfProduction, int vin, String model, Double height, int trunkCapacity, int trailerAmount, int axis) {
        super(brand, yearOfProduction, vin, model);
        this.height = height;
        TrunkCapacity = trunkCapacity;
        this.trailerAmount = trailerAmount;
        this.axis = axis;
    }

    //--------------GETTERS & SETTERS------------
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public int getTrunkCapacity() {
        return TrunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        TrunkCapacity = trunkCapacity;
    }

    public int getTrailerAmount() {
        return trailerAmount;
    }

    public void setTrailerAmount(int trailerAmount) {
        this.trailerAmount = trailerAmount;
    }

    public int getAxis() {
        return axis;
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }

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
        System.out.println("Podaj rok produkcji auta:  ");
        this.yearOfProduction = scanner.nextInt();
        System.out.println("Podaj nr vin");
        this.setVin(scanner.nextInt());
        System.out.println("Podaj ilosć osi kół w pojeździe: ");
        this.setAxis(scanner.nextInt());
        System.out.println("Podaj wysokość pojazdu: ");
        this.setHeight(scanner.nextDouble());
        System.out.println("Podaj ilość przyczep : ");
        this.setTrailerAmount(scanner.nextInt());
        System.out.println("Podaj pojemność Przyczepy: ");
        this.setTrunkCapacity(scanner.nextInt());

        System.out.println("Twoje auto to" + getBrand() + " " + getModel() + " " + getAxis() + " " + getVin() + " " + getYearOfProduction() + " " + getHeight() + " " + getTrailerAmount() + " " + getTrunkCapacity());
    }
}
