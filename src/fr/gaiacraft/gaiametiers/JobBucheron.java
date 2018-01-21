package fr.gaiacraft.gaiametiers;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;


public class JobBucheron implements Listener {

    @EventHandler (priority = EventPriority.NORMAL)
    public void onBlockBroken(BlockBreakEvent event){

        if(event.getBlock().getState().getData().toString().contains("LOG(0)")){ //classic oak

        }

        if(event.getBlock().getState().getData().toString().contains("LOG(1)")){ //Redwood

        }

        if(event.getBlock().getState().getData().toString().contains("LOG(2)")){ //Birch
            Bukkit.broadcastMessage("It's some birb wood!");
        }

        if(event.getBlock().getState().getData().toString().contains("LOG(3)")){ //Jungle

        }

        if(event.getBlock().getState().getData().toString().contains("LOG_2(0)")){ //Acacia

        }

        if(event.getBlock().getState().getData().toString().contains("LOG_2(1)")) { //dark oak

        }
    }


}