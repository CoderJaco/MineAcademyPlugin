package org.mineacademy.template;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class MineAcademyPlugin extends SimplePlugin {

	/**
	 * This apple is the number 10
	 */
	int apple = 10;

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {

		String knockMessage = "Knock knock!";

		//This prints out a number or string to the console or terminal.
		System.out.println(apple);

		/*
		 * This prints out 3 Knock knock!
		 */
		System.out.println((2 + 1) + " " + knockMessage);

		//getLogger().info("Knock knock, the plugin has been started.");
	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */


	/**
	 * An example event that checks if the right-clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {

		boolean isCreeper = event.getRightClicked().getType() == EntityType.CREEPER;
		boolean isSheep = event.getRightClicked().getType() == EntityType.SHEEP;
		boolean isSkeleton = event.getRightClicked().getType() == EntityType.SKELETON;
		boolean isChicken = event.getRightClicked().getType() == EntityType.CHICKEN;

		if (isCreeper) {
			event.getRightClicked().setCustomName(ChatColor.GREEN + "Creeper");
		} else if (isSheep) {
			event.getRightClicked().setCustomName(ChatColor.GRAY + "Sheep");
		} else if (isSkeleton) {
			event.getRightClicked().setCustomName(ChatColor.DARK_GRAY + "Skeleton");
		}

		if (isChicken)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
	}

	int multiply(int firstNumber, int secondNumber) {
		int result = firstNumber * secondNumber;

		return result * 2;
	}
}
