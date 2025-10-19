/**
 * Common interface for all hotel services
 */
public interface HotelService {
    /**
     * Initialize and prepare the service
     */
    void initialize();
    
    /**
     * Check if the service is available
     * @return true if the service is available, false otherwise
     */
    boolean isAvailable();
}