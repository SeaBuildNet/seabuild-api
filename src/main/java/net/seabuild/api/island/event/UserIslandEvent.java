package net.seabuild.api.island.event;

import lombok.Getter;
import net.seabuild.api.island.Island;

import java.util.UUID;

@Getter
public class UserIslandEvent extends IslandEvent {
    private final UUID uuid;

    public UserIslandEvent(UUID uuid, Island island) {
        super(island);
        this.uuid = uuid;
    }
}
