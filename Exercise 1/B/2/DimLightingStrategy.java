package main.java.com.adaptivelighting;
import java.util.logging.Logger;
import java.util.logging.Level;

public class DimLightingStrategy implements LightingStrategy {
    private static final Logger logger = Logger.getLogger(DimLightingStrategy.class.getName());

    @Override
    public void apply() {
        // Implement dim lighting logic
        logger.log(Level.INFO, "Applying dim lighting strategy.");
    }
}
