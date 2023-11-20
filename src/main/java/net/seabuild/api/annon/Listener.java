package net.seabuild.api.annon;

import de.flammenfuchs.injections.annon.AllowParameters;
import org.bukkit.event.Event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@AllowParameters
public @interface Listener {

    Class<? extends Event> value();
}
