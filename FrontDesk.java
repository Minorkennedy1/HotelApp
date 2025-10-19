/**
 * FrontDesk serves as a facade for all hotel services
 */
public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    /**
     * Initialize all hotel services
     */
    public void initialize() {
        valet.initialize();
        houseKeeping.initialize();
        cart.initialize();
    }

    /**
     * Request valet service for vehicle pickup
     * @param plateNumber the vehicle's plate number
     */
    public void requestValet(String plateNumber) {
        if (valet.isAvailable()) {
            valet.pickUpVehicle(plateNumber);
        }
    }

    /**
     * Request room cleaning service
     * @param roomNumber the room number to clean
     */
    public void requestRoomCleaning(String roomNumber) {
        if (houseKeeping.isAvailable()) {
            houseKeeping.cleanRoom(roomNumber);
        }
    }

    /**
     * Request luggage carts
     * @param numberOfCarts number of carts needed
     */
    public void requestLuggageCarts(int numberOfCarts) {
        if (cart.isAvailable()) {
            cart.requestCart(numberOfCarts);
        }
    }

    /**
     * Return luggage carts
     * @param numberOfCarts number of carts being returned
     */
    public void returnLuggageCarts(int numberOfCarts) {
        cart.returnCart(numberOfCarts);
    }
}