package fr.gaiacraft.gaiametiers;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class JobMineur implements Listener {

    public void onItemBroken(BlockBreakEvent ev) {
        Material mat = ev.getBlock().getType();
    }
}

