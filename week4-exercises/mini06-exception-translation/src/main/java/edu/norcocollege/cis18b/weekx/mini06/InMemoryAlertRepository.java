package edu.norcocollege.cis18b.weekx.mini06;

public class InMemoryAlertRepository implements AlertRepository {
    @Override
    public void save(Alert alert) throws AlertStorageException {
        try {
            // TODO: Simulate a low-level failure.
            // Example: throw new RuntimeException("Database connection failed");
            throw new RuntimeException("Connection failed");
        } catch (RuntimeException ex) {
            // TODO: Translate the exception into AlertStorageException.
            // Preserve the original cause.
            throw new AlertStorageException("Failed to connect", ex);
        }
    }
}
