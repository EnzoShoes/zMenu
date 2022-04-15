package fr.maxlego08.menu.button.loader;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import fr.maxlego08.menu.api.InventoryManager;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.buttons.InventoryButton;
import fr.maxlego08.menu.api.loader.ButtonLoader;
import fr.maxlego08.menu.button.buttons.ZInventoryButton;

public class InventoryLoader implements ButtonLoader {

	private final Plugin plugin;
	private final InventoryManager manager;

	/**
	 * @param plugin
	 * @param manager
	 */
	public InventoryLoader(Plugin plugin, InventoryManager manager) {
		super();
		this.plugin = plugin;
		this.manager = manager;
	}

	@Override
	public Class<? extends Button> getButton() {
		return InventoryButton.class;
	}

	@Override
	public String getName() {
		return "inventory";
	}

	@Override
	public Plugin getPlugin() {
		return this.plugin;
	}

	@Override
	public Button load(YamlConfiguration configuration, String path) {
		String inventoryName = configuration.getString(path + "inventory");
		return new ZInventoryButton(this.manager, inventoryName);
	}

}
