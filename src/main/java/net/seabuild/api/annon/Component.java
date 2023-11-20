package net.seabuild.api.annon;

import de.liquiddev.command.adapter.bukkit.PlayerCommand;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Component {

    Class<? extends PlayerCommand> value();
}
