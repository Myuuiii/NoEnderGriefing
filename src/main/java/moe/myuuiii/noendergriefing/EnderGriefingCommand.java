package moe.myuuiii.noendergriefing;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class EnderGriefingCommand implements CommandExecutor {
	Plugin plugin;

	public EnderGriefingCommand(Plugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (!sender.hasPermission(Permissions.UseCommand)) {
			sender.sendMessage(Messages.NotAllowedToUse);
		}

		if (args.length == 0) {
			if (NoEnderGriefing.enabled) {
				sender.sendMessage(Messages.CurrentState + Messages.CsEnabled);
				return false;
			} else {
				sender.sendMessage(Messages.CurrentState + Messages.CsDisabled);
				return false;
			}
		}

		else if (args.length == 1) {
			switch (args[0].toLowerCase()) {
				case "enable":
				case "on":
					sender.sendMessage(Messages.Enabled);
					plugin.getConfig().set("enabled", true);
					NoEnderGriefing.enabled = true;
					break;
				case "disable":
				case "off":
					sender.sendMessage(Messages.Disabled);
					plugin.getConfig().set("enabled", false);
					NoEnderGriefing.enabled = false;
					break;
				default:
					sender.sendMessage(Messages.ArgumentValueNotRecognized);
			}
		} else {
			sender.sendMessage(Messages.TooManyArguments);
		}
		return false;
	}

}
