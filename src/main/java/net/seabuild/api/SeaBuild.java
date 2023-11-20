package net.seabuild.api;

import java.util.HashMap;
import java.util.Map;

public class SeaBuild {
    private static final Map<Class<?>, Object> components = new HashMap<>();

    /**
     * Get a registered Component
     *
     * @param clazz class of component
     * @return the component, null if not found
     * @param <T> type of component
     */
    public static <T extends ApiComponent> T getComponent(Class<T> clazz) {
        if (components.containsKey(clazz)) {
            return clazz.cast(components.get(clazz));
        }
        return null;
    }

    /**
     * Register a component
     *
     * @param clazz class of component
     * @param object instance of component
     * @param <T> type of component
     */
    public static <T extends ApiComponent> void putComponent(Class<T> clazz, T object) {
        components.put(clazz, object);
    }

}
