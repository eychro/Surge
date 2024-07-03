package dev.eychro.surge.Handlers.World.Interaction;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockInteraction implements Listener {

    @EventHandler
    public void onBlockInteraction(PlayerInteractEvent event) {
        if (event.getClickedBlock() != null) {
            event.setCancelled(true);
        }
    }
}
