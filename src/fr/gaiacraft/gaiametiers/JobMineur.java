package fr.gaiacraft.gaiametiers;

import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class JobMineur implements Listener {

    public void onBlockBroken(BlockBreakEvent ev) {
        Material mat = ev.getBlock().getType();
        BlockState st8 = ev.getBlock().getState();

        /* TODO: regarder pour la gestion andesite granite diorite */

        if(mat == Material.STONE) {
            //Do something
        }
    }
}

