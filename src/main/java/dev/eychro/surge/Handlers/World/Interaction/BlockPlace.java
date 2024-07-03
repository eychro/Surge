package dev.eychro.surge.Handlers.World.Interaction;

import dev.eychro.surge.Commands.Staff.BuildMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if ( !BuildMode.BuildMode.contains(event.getPlayer()) ) {
          event.setCancelled(true);
        }
    }
}
