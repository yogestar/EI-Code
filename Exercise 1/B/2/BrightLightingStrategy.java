package main.java.com.adaptivelighting;
import java.util.logging.Logger;
import java.util.logging.Level;

public class BrightLightingStrategy implements LightingStrategy {
    private static final Logger logger = Logger.getLogger(BrightLightingStrategy.class.getName());

    @Override
    public void apply() {
        // Implement bright lighting logic
        logger.log(Level.INFO, "Applying bright lighting strategy.");
    }
}
