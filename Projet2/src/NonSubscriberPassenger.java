public class NonSubscriberPassenger extends Passenger {
    private boolean discountCoupon;

    public NonSubscriberPassenger(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Maximum capacity of the car is zero");
        }
        setReservedCar(car);
        double tripPrice = car.getRoute().getTripPrice();
        if (discountCoupon) {
            setTripCost(tripPrice * 0.9);
        } else {
            setTripCost(tripPrice);
        }
    }
}
