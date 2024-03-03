public class SubscriberPassenger extends Passenger {
    public SubscriberPassenger(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Maximum capacity of the car is zero");
        }
        setReservedCar(car);
        double tripPrice = car.getRoute().getTripPrice();
        setTripCost(tripPrice * 0.5);
    }
}