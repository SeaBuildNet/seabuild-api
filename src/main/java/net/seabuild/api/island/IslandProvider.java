package net.seabuild.api.island;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.UUID;

public interface IslandProvider {

    /**
     * Get an island by their id
     *
     * @param x id x
     * @param z id z
     * @return the {@link Island}
     */
    Island getIsland(int x, int z);

    /**
     * Get an island at a specified location
     *
     * @param location the {@link Location}
     * @return the {@link Island}
     */
    Island getIsland(Location location);

    /**
     * Get all islands of a player
     *
     * @param player the {@link Player}
     * @return A {@link Collection} of all {@link Island}
     */
    Collection<Island> getIslands(Player player);


    /**
     * Get all islands of a player
     *
     * @param uuid the {@link UUID} of the player
     * @return A {@link Collection} of all {@link Island}
     */
    Collection<Island> getIslands(UUID uuid);

    /**
     * Claim an island
     *
     * @param uuid the owner
     * @param x id x
     * @param z id z
     */
    void claimIsland(UUID uuid, int x, int z);

    /**
     * Delete an island
     *
     * @param x id x
     * @param z id z
     */
    void deleteIsland(int x, int z);

}
