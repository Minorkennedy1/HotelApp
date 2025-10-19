public class HotelApp {
    public static void main(String[] args) {
        // Create and initialize the front desk
        FrontDesk frontDesk = new FrontDesk();
        frontDesk.initialize();
        
        // Demonstrate various hotel services
        System.out.println("\n=== Testing Hotel Services ===");
        
        // Test valet service
        frontDesk.requestValet("ABC123");
        
        // Test housekeeping service
        frontDesk.requestRoomCleaning("1408");
        
        // Test cart service
        frontDesk.requestLuggageCarts(3);
        frontDesk.returnLuggageCarts(2);
        frontDesk.requestLuggageCarts(8);  // Should show available carts
    }
}