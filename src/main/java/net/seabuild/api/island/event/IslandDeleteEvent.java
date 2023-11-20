package net.seabuild.api.island.event;

import net.seabuild.api.island.Island;
import org.bukkit.event.HandlerList;

/**
 * This event is called when an island is deleted
 */
public class IslandDeleteEvent extends IslandEvent {

    private static final HandlerList handlers = new HandlerList();

    public IslandDeleteEvent(Island island) {
        super(island);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
