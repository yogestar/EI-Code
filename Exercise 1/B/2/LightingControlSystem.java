package main.java.com.adaptivelighting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LightingControlSystem {
    private static final Logger logger = Logger.getLogger(LightingControlSystem.class.getName());
    private LightingStrategy strategy;

    public void setLightingStrategy(LightingStrategy strategy) {
        if (strategy == null) {
            logger.log(Level.WARNING, "Attempted to set null lighting strategy.");
            throw new IllegalArgumentException("Lighting strategy cannot be null.");
        }
        this.strategy = strategy;
        logger.log(Level.INFO, "Lighting strategy set to: " + strategy.getClass().getSimpleName());
    }

    public void applyLighting() {
        try {
            if (strategy == null) {
                logger.log(Level.SEVERE, "No lighting strategy set.");
                throw new IllegalStateException("Lighting strategy must be set before applying.");
            }
            strategy.apply();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error while applying lighting strategy: " + e.getMessage(), e);
        }
    }
}
