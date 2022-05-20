package moe.myuuiii.noendergriefing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

public class EnderGriefingCommandCompleter implements TabCompleter {

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
		ArrayList<String> results = new ArrayList<>();

		if (args.length == 1) {
			return StringUtil.copyPartialMatches(args[0], Arrays.asList("enable", "disable"), new ArrayList<>());
		}
		return null;
	}

}
