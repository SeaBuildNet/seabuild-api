package net.seabuild.api.island;

import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface Island {

    /**
     * Get id x
     *
     * @return the id x of the island
     */
    int getX();

    /**
     * Get id z
     *
     * @return the id z of the island
     */
    int getZ();

    /**
     * Get the owner of an island
     *
     * @return the {@link UUID} of the owner
     */
    UUID getOwner();

    /**
     * Get all helpers of an island
     *
     * @return An {@link Collection} of all helpers
     */
    Collection<UUID> getHelper();

    /**
     * Check if a player is a helper
     *
     * @param uuid {@link UUID} of the player
     * @return true if players is a helper
     */
    boolean isHelper(UUID uuid);

    /**
     * Remove a helper
     *
     * @param uuid {@link UUID} of the helper
     */
    void removeHelper(UUID uuid);

    /**
     * Remove all helpers
     */
    void removeHelpers();

    /**
     * Get all trusted players of an island
     *
     * @return A {@link Collection} of all trusted players
     */
    Collection<UUID> getTrustees();

    /**
     * Check if player is trusted
     *
     * @param uuid {@link UUID}
     * @return true if player is trusted
     */
    boolean isTrusted(UUID uuid);

    /**
     * Remove a trusted player
     *
     * @param uuid {@link UUID} of a player
     */
    void removeTrusted(UUID uuid);

    /**
     * Remove all trusted players
     */
    void removeTrustees();

    /**
     * Get all banned players
     *
     * @return A {@link Collection} of all banned players
     */
    Collection<UUID> getBanned();

    /**
     * Check if player is banned
     *
     * @param uuid {@link UUID} of the player
     * @return true if player is banned
     */
    boolean isBanned(UUID uuid);

    /**
     * Unban a player
     *
     * @param uuid {@link UUID} of the player
     */
    void removeBanned(UUID uuid);

    /**
     * Remove all banned players
     */
    void removeBanned();

    /**
     * Check if player can build
     *
     * @param player the {@link Player}
     * @return true if a player is trusted, the owner or a helper when the owner is online
     */
    boolean canBuild(Player player);

    /**
     * Get a property
     *
     * @param key the property key
     * @return the value as {@link String}
     */
    String getProperty(String key);

    /**
     * Set a property
     *
     * @param key the property key
     * @param value the property value
     */
    void setProperty(String key, String value);

    /**
     * Get all properties
     *
     * @return {@link Map} with key and value as {@link String}
     */
    Map<String, String> getProperties();

    /**
     * Check if a property is set
     *
     * @param key the property key
     * @return true if the property is a key
     */
    boolean hasPropertySet(String key);

}