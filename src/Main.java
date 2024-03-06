public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Honda",2019,1345231497,"Civic","Hatchback",3,"Manual",60);
        Truck truck1 = new Truck("MAN",2020,1345633149,"tgx",3.5,2000,1,4);

        car1.setupVehicle();
        truck1.setupVehicle();
    }
}