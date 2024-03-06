import java.util.Scanner;

public class Vehicle {

    //---------------VARIABLES-------------------
    public String brand = "";
    public int yearOfProduction = 0;
    public String model = "";
    private int vin = 0;
    public boolean running = false;

    //------------OBJECTS-----------
    Scanner scanner = new Scanner(System.in);

    //------------CONSTRUCTOR--------------------
    public Vehicle(String brand, int yearOfProduction, int vin, String model) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.vin = vin;
        this.model = model;
    }
//------------------getters & setters ------------------------
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setAgeOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }


    //------------METHODS-----------------
    public void startVehicle(){
        if(this.isRunning() == true) {
            System.out.println("Auto już jest włączone");
        }else {
            System.out.println("Włączyłeś auto");
            this.running = true;
        }

    }
    public void stopVehicle(){
        if(this.isRunning() == false){
            System.out.println("Auto już jest wyłączone");
        }else {
            System.out.println("Wyłączyłeś auto");
            this.running = false;
        }
    }
    public void setupVehicle(){
        System.out.println("Podaj markę auta: ");
        this.brand = scanner.nextLine();
        System.out.println("Podaj model auta: ");
        this.model = scanner.nextLine();
        System.out.println("Podaj rok produkcji aura (dd/mm/yyyy)");
        this.yearOfProduction = scanner.nextInt();
        System.out.println("Podaj nr vin");
        this.vin = scanner.nextInt();
    }
}
