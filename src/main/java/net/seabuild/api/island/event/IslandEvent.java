package net.seabuild.api.island.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.seabuild.api.island.Island;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@RequiredArgsConstructor
@Getter
public class IslandEvent extends Event {

    private final Island island;

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}
