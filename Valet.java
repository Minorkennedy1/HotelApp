public class Valet implements HotelService {
    private boolean available = true;

    @Override
    public void initialize() {
        System.out.println("Valet service is initialized and ready.");
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void pickUpVehicle(String plateNumber) {
        if (!isAvailable()) {
            System.out.println("Valet service is currently unavailable.");
            return;
        }
        System.out.println("Valet is picking up vehicle with plate number: " + plateNumber);
    }
}