package net.seabuild.api.island.event;

import net.seabuild.api.island.Island;
import org.bukkit.event.HandlerList;

import java.util.UUID;

/**
 * This Event is called when a helper is removed
 */
public class IslandRemoveHelperEvent extends UserIslandEvent {

    private static final HandlerList handlers = new HandlerList();

    public IslandRemoveHelperEvent(UUID uuid, Island island) {
        super(uuid, island);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
