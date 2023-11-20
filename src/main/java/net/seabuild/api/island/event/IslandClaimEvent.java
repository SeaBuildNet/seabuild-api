package net.seabuild.api.island.event;

import net.seabuild.api.island.Island;
import org.bukkit.event.HandlerList;

import java.util.UUID;

/**
 * This event is called when an island is claimed
 */
public class IslandClaimEvent extends UserIslandEvent {

    private static final HandlerList handlers = new HandlerList();

    public IslandClaimEvent(UUID uuid, Island island) {
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
