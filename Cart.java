public class Cart implements HotelService {
    private boolean available = true;
    private int totalCarts = 10;
    private int availableCarts = 10;

    @Override
    public void initialize() {
        System.out.println("Cart service is initialized and ready.");
    }

    @Override
    public boolean isAvailable() {
        return available && availableCarts > 0;
    }

    public void requestCart(int numberOfCarts) {
        if (!isAvailable()) {
            System.out.println("Cart service is currently unavailable.");
            return;
        }
        
        if (numberOfCarts > availableCarts) {
            System.out.println("Sorry, only " + availableCarts + " carts available.");
            return;
        }
        
        availableCarts -= numberOfCarts;
        System.out.println("Providing " + numberOfCarts + " luggage cart(s). " + availableCarts + " carts remaining.");
    }

    public void returnCart(int numberOfCarts) {
        availableCarts = Math.min(totalCarts, availableCarts + numberOfCarts);
        System.out.println("Returned " + numberOfCarts + " cart(s). " + availableCarts + " carts now available.");
    }
}