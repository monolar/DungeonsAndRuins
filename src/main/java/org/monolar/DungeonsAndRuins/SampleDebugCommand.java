package org.monolar.DungeonsAndRuins;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Handler for the /debug sample command.
 * @author SpaceManiac
 */
public class SampleDebugCommand implements CommandExecutor {
    private final DungeonsAndRuinsPlugin dungeonsAndRuinsPlugin;

    public SampleDebugCommand(DungeonsAndRuinsPlugin dungeonsAndRuinsPlugin) {
        this.dungeonsAndRuinsPlugin = dungeonsAndRuinsPlugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            dungeonsAndRuinsPlugin.setDebugging(player, !dungeonsAndRuinsPlugin.isDebugging(player));

            return true;
        } else {
            return false;
        }
    }
}
