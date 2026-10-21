package com.enderdevelopment.plugin;

import org.bukkit.Bukkit;
import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

public class AdvancementListener implements Listener {
    @EventHandler
    public void onAdvancementDone(PlayerAdvancementDoneEvent event) {
        Player player = event.getPlayer();
        Advancement advancement = event.getAdvancement();
        String advancementKey = advancement.getKey().toString();

        switch (advancementKey) {
            case "minecraft:nether/sky_conqueror":
                player.sendMessage("You have unlocked Sky Conqueror!");
                break;
            case "minecraft:nether/trial_champion":
                player.sendMessage("You have unlocked Trial Champion!");
                break;
            case "minecraft:nether/packmaster":
                player.sendMessage("You have unlocked Packmaster!");
                break;
            case "minecraft:nether/soul_hunter":
                player.sendMessage("You have unlocked Soul Hunter!");
                break;
            case "minecraft:nether/unbreakable":
                player.sendMessage("You have unlocked Unbreakable!");
                break;
            case "minecraft:nether/deaths_touch":
                player.sendMessage("You have unlocked Death's Touch!");
                break;
            case "minecraft:nether/web_walker":
                player.sendMessage("You have unlocked Web Walker!");
                break;
            case "minecraft:nether/void_conqueror":
                player.sendMessage("You have unlocked Void Conqueror!");
                break;
            case "minecraft:nether/cosmic_ascension":
                player.sendMessage("You have unlocked Cosmic Ascension!");
                break;
            case "minecraft:nether/deaths_awakening":
                player.sendMessage("You have unlocked Death's Awakening!");
                break;
            case "minecraft:nether/mochis_blessing":
                player.sendMessage("You have unlocked Mochi's Blessing!");
                break;
            case "minecraft:nether/the_ninefold_legend":
                player.sendMessage("You have unlocked The Ninefold Legend!");
                break;
            default:
                break;
        }
    }
}