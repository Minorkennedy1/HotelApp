public class HouseKeeping implements HotelService {
    private boolean available = true;

    @Override
    public void initialize() {
        System.out.println("Housekeeping service is initialized and ready.");
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void cleanRoom(String roomNumber) {
        if (!isAvailable()) {
            System.out.println("Housekeeping service is currently unavailable.");
            return;
        }
        System.out.println("Housekeeping is cleaning room: " + roomNumber);
    }
}