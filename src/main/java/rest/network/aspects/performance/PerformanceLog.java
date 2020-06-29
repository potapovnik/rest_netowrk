package rest.network.aspects.performance;

import java.lang.annotation.*;

/**
 * Marker annotation for performance logging
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PerformanceLog { }
