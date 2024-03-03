public class Route {
    private String startPickUpAddress;

    public void setStartPickUpAddress(String startPickUpAddress) {
        this.startPickUpAddress = startPickUpAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    private String destinationAddress;
    private double tripPrice;

    public Route(String startPickUpAddress, String destinationAddress, double tripPrice) {
        this.startPickUpAddress = startPickUpAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public String getStartPickUpAddress() {
        return startPickUpAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }
}