package xyz.itsylands.ItsyJoin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.itsylands.ItsyJoin.Commands.Commands;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getCommand("forum").setExecutor(new Commands());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ItsyForumMC] ItsyForumMC has loaded");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[ItsyForumMC] ItsyForumMC Has been disabled");
    }
}
