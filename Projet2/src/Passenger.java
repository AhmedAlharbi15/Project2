public abstract class Passenger {
    private String name;
    private String ID;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void reserveCar(Car car) throws Exception;
    protected void setReservedCar(Car car) {
        this.reservedCar = car;
    }

    protected void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public void displayInfo() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger ID: " + ID);
        System.out.println("Reserved Car Code: " + (reservedCar != null ? reservedCar.getCode() : "No car reserved"));
        System.out.println("Trip Cost: " + tripCost);
    }
}
