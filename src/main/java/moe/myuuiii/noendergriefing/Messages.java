package moe.myuuiii.noendergriefing;

import org.bukkit.ChatColor;

public class Messages {
	public static final String Prefix = ChatColor.DARK_GRAY + "[" + ChatColor.LIGHT_PURPLE + "NoEnderGriefing"
			+ ChatColor.DARK_GRAY + "] " + ChatColor.RESET;
	public static final String NotAllowedToUse = Prefix + "You are not allowed to use this command";
	public static final String Enabled = Prefix + "You have " + ChatColor.GREEN + "enabled " + ChatColor.RESET
			+ "NoEnderGriefing";
	public static final String Disabled = Prefix + "You have " + ChatColor.RED + "disabled " + ChatColor.RESET
			+ "NoEnderGriefing";

	public static final String CurrentState = Prefix + "The NoEnderGriefing plugin is currently ";
	public static final String CsEnabled = ChatColor.GREEN + "" + ChatColor.BOLD + "Enabled";
	public static final String CsDisabled = ChatColor.RED + "" + ChatColor.BOLD + "Disabled";

	public static final String ArgumentValueNotRecognized = Prefix + "The value you provided could not be recognized";
	public static final String TooManyArguments = Prefix + "You have provided too many arguments";
}
