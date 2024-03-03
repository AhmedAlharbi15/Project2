//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Route route1 = new Route("Address1", "Address2", 50);
        Route route2 = new Route("Address3", "Address4", 70);

        Car car1 = new Car("Code1", route1, 4);
        Car car2 = new Car("Code2", route2, 0);

        Passenger[] passengers = new Passenger[2];
        passengers[0] = new SubscriberPassenger("Ahmed", "123");
        passengers[1] = new NonSubscriberPassenger("Ali", "456", true);

        try {
            passengers[0].reserveCar(car1);
            passengers[1].reserveCar(car2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Passenger passenger : passengers) {
            passenger.displayInfo();
            System.out.println();
        }
    }
}