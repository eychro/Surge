package dev.eychro.surge.Handlers.World.Interaction;

import dev.eychro.surge.Commands.Staff.BuildMode;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if ( !BuildMode.BuildMode.contains( event.getPlayer() ) ) {
            event.setCancelled(true);
        }
    }
}
