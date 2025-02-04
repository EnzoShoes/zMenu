package fr.maxlego08.menu.zcore.enums;

import java.util.*;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.menu.zcore.utils.nms.NMSUtils;

public enum Message {

	PREFIX("§8(§6zMenu§8) "),
	AND("and"),
	
	VINVENTORY_NULL("§cImpossible to find the inventory with the id §6%id%§c.", false),
	VINVENTORY_CLONE_NULL("§cThe inventory clone is null!", false),
	VINVENTORY_OPEN_ERROR("§cAn error occurred with the opening of the inventory §6%id%§c.", false),
	VINVENTORY_BUTTON_PREVIOUS("§f» §7Previous page", false),
	VINVENTORY_BUTTON_NEXT("§f» §7Next page", false),
	
	TIME_DAY("%02d %day% %02d %hour% %02d %minute% %02d %second%"),
	TIME_HOUR("%02d %hour% %02d minute(s) %02d %second%"),
	TIME_HOUR_SIMPLE("%02d:%02d:%02d"),
	TIME_MINUTE("%02d %minute% %02d %second%"),
	TIME_SECOND("%02d %second%"),
	
	FORMAT_SECOND("second"),
	FORMAT_SECONDS("seconds"),	
	
	FORMAT_MINUTE("minute"),
	FORMAT_MINUTES("minutes"),
	
	FORMAT_HOUR("hour"),
	FORMAT_HOURS("hours"),
	
	FORMAT_DAY("d"),
	FORMAT_DAYS("days"),
	
	COMMAND_SYNTAXE_ERROR("§cYou must execute the command like this§7: §a%syntax%"),
	COMMAND_NO_PERMISSION("§cYou do not have permission to run this command."),
	COMMAND_NO_CONSOLE("§cOnly one player can execute this command."),
	COMMAND_NO_ARG("§cImpossible to find the command with its arguments."),
	COMMAND_SYNTAXE_HELP("§f%syntax% §7» §7%description%"),
	DOCUMENTATION_INFORMATION("§7Documentation§8: §fhttps://docs.zmenu.dev/"),
	
	INVENTORY_NOT_FOUND("§cUnable to find the §f%toName% §cinventory in the §f%name%§c inventory."), 
	INVENTORY_ERROR("§cUnable to find the §f%name%§c inventory."), 
	INVENTORY_OPEN_OTHER("§aYou have just opened the inventory §f%name%§a to the §3%player%§a."),
	INVENTORY_OPEN_SUCCESS("§aYou have just opened the inventory §f%name%§a."),
	INVENTORY_OPEN_ERROR_INVENTORY("§cImpossible to find the inventory §f%name%§c."),
	INVENTORY_OPEN_ERROR_COMMAND("§cImpossible to find the command §f%name%§c."),
	INVENTORY_OPEN_ERROR_PLAYER("§cUnable to find the player, please specify."),
	INVENTORY_OPEN_ERROR_CONSOLE("§cOnly one player can open an inventory."),
	
	DESCRIPTION_OPEN("Allows you to open an inventory"),
	DESCRIPTION_SAVE("Allows you to save the item in your hand"),
	DESCRIPTION_RELOAD("Allows you to reload configuration files"),
	DESCRIPTION_VERSION("Show plugin version"),
	DESCRIPTION_LIST("Inventory list"),
	DESCRIPTION_TEST_DUPE("Test dupe"),
	DESCRIPTION_DOWNLOAD("WIP"),
	DESCRIPTION_LOGIN("WIP"),
	DESCRIPTION_DISCONNECT("WIP"),
    DESCRIPTION_CONVERT("Convert other configurations to zmenu"),
    DESCRIPTION_PLAYERS("Displays the list of commands for the players' data"),
    DESCRIPTION_PLAYERS_SET("Set new player data. You must set the expiration time in seconds. Put 0 to have no expiration"),
    DESCRIPTION_PLAYERS_REMOVE("Remove player data"),
    DESCRIPTION_PLAYERS_GET("Get player data"),
    DESCRIPTION_PLAYERS_KEYS("Returns the list of keys of a player"),
    DESCRIPTION_PLAYERS_CLEAR_ALL("Clear all player's data"),
    DESCRIPTION_PLAYERS_CLEAR_PLAYER("Clear player's data"),
	DESCRIPTION_OPEN_MAIN_MENU("Open the main menu"),
	DESCRIPTION_CREATE("Create a new config file"),
	
	RELOAD("§aYou have just reloaded the configuration files. §8(§7%inventories% inventories§8)"),
	RELOAD_INVENTORY("§aYou have just reloaded the inventories files. §8(§7%inventories% inventories§8)"),
	RELOAD_INVENTORY_FILE("§aVous have just reloaded the inventory §f%name%§a."),
	RELOAD_COMMAND("§aYou have just reloaded the commands files."),
	RELOAD_COMMAND_FILE("§aVous have just reloaded the command §f%name%§a."),
	RELOAD_COMMAND_ERROR("§cIt is not possible to reload the command §f%name%§c."),
	RELOAD_FILES("§aYou have just reloaded config.json and messages.yml files."),
	
	CONVERT_INFO(
			"§fYou can convert the menu from §eDeluxeMenu§f to §azMenu§f.",
			"§fYou must install the §3zMenuConvert§f plugin.",
			"§fDownload link§8: §7https://groupez.dev/resources/zmenuconvert.266",
			"§fYou must then issue the command §b/zmenu convert§f."
			),
	
	PLAYERS_DATA_CLEAR_ALL("§aYou have just deleted the datas of all the players."),
	PLAYERS_DATA_CLEAR_PLAYER("§aYou have just deleted the player's data §f%player%§a."),
	
	PLAYERS_DATA_SET("§aYou have just added a data for the §b%player% §a with the §f%key%§a."),
	PLAYERS_DATA_KEYS_SUCCESS("§aPlayer's Key §f%player%§8: §7%keys%"),
	PLAYERS_DATA_KEYS_EMPTY("§cThe §f%player% §chas no key."),
	PLAYERS_DATA_GET_SUCCESS(
			"§fKey§8: §7%key%",
			"§fExpired at (timestamp)§8: §7%expiredAt%",
			"§fValue§8: §7%value%"
			),
	PLAYERS_DATA_GET_ERROR("§cCannot find the key §f%key%§c."),
	PLAYERS_DATA_REMOVE_SUCCESS("§aYou have just deleted the §f%key% §for the §b%player%§a."),
	PLAYERS_DATA_REMOVE_ERROR("§cCannot find the key §f%key%§c."),
	
	WEBSITE_LOGIN_ERROR_TOKEN("§cYour token seems invalid, please try again."),
	WEBSITE_LOGIN_ERROR_ALREADY("§cYou are already connected to the site."),
	WEBSITE_LOGIN_ERROR_INFO("§cAn error occurred during your connection, please try again."),
	WEBSITE_LOGIN_PROCESS("§7Connection in progress, please wait."),
	WEBSITE_LOGIN_SUCCESS("§aYou have successfully connected to the site.", "§aYou can now access your purchased resources and the inventory editor."),
	
	WEBSITE_DISCONNECT_SUCCESS("§cYou have just deleted the link to the site."), 
	WEBSITE_DISCONNECT_ERROR("§cYou are not connected to the site."), 
	
	PLACEHOLDER_NEVER("never"),

	LIST_EMPTY("§cNo inventory of available."),
	LIST_INFO("§fInventories of §a%plugin% §8(§7%amount%§8): §7%inventories%"),

	INVENTORY_CREATE_ERROR_SIZE("§cThe inventory size should be included in 9 and 54."),
	INVENTORY_CREATE_ERROR_ALREADY("§cThe file §f%name%§c already exist."),
	INVENTORY_CREATE_ERROR_EXCEPTION("§cAn error has occurred§8: §f%error%"),
	INVENTORY_CREATE_SUCCESS("§aYou have just created the inventory §f%name%§a."),

	SAVE_ERROR_EMPTY("§cYou must have an item in hand to save this item."),
	SAVE_ERROR_NAME("§cThe name already exists for this item, please select another one."),
	SAVE_SUCCESS("§aYou just saved the item §f%name%§a."),

	;

	private List<String> messages;
	private String message;
	private Map<String, Object> titles = new HashMap<>();
	private boolean use;
	private MessageType type = MessageType.TCHAT;

	private ItemStack itemStack;
	
	/**
	 * 
	 * @param message
	 */
    Message(String message) {
		this.message = message;
		this.use = true;
	}

	/**
	 * 
	 * @param title
	 * @param subTitle
	 * @param a
	 * @param b
	 * @param c
	 */
    Message(String title, String subTitle, int a, int b, int c) {
		this.use = true;
		this.titles.put("title", title);
		this.titles.put("subtitle", subTitle);
		this.titles.put("start", a);
		this.titles.put("time", b);
		this.titles.put("end", c);
		this.titles.put("isUse", true);
		this.type = MessageType.TITLE;
	}

	/**
	 * 
	 * @param message
	 */
    Message(String... message) {
		this.messages = Arrays.asList(message);
		this.use = true;
	}
	
	/**
	 * 
	 * @param message
	 */
    Message(MessageType type, String... message) {
		this.messages = Arrays.asList(message);
		this.use = true;
		this.type = type;
	}
	
	/**
	 * 
	 * @param message
	 */
    Message(MessageType type, String message) {
		this.message = message;
		this.use = true;
		this.type = type;
	}

	/**
	 * 
	 * @param message
	 * @param use
	 */
    Message(String message, boolean use) {
		this.message = message;
		this.use = use;
	}

	public String getMessage() {
		return message;
	}

	public String toMsg() {
		return message;
	}

	public String msg() {
		return message;
	}

	public boolean isUse() {
		return use;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getMessages() {
		return messages == null ? Collections.singletonList(message) : messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public boolean isMessage() {
		return messages != null && messages.size() > 1;
	}

	public String getTitle() {
		return (String) titles.get("title");
	}

	public Map<String, Object> getTitles() {
		return titles;
	}

	public void setTitles(Map<String, Object> titles) {
		this.titles = titles;
		this.type = MessageType.TITLE;
	}

	public String getSubTitle() {
		return (String) titles.get("subtitle");
	}

	public boolean isTitle() {
		return titles.containsKey("title");
	}

	public int getStart() {
		return ((Number) titles.get("start")).intValue();
	}

	public int getEnd() {
		return ((Number) titles.get("end")).intValue();
	}

	public int getTime() {
		return ((Number) titles.get("time")).intValue();
	}

	public boolean isUseTitle() {
		return (boolean) titles.getOrDefault("isUse", "true");
	}

	public String replace(String a, String b) {
		return message.replace(a, b);
	}

	public MessageType getType() {
		return type.equals(MessageType.ACTION) && NMSUtils.isVeryOldVersion() ? MessageType.TCHAT : type;
	}
	
	public ItemStack getItemStack() {
		return itemStack;
	}

	public void setType(MessageType type) {
		this.type = type;
	}
	
	public void setItemStack(ItemStack itemStack) {
		this.itemStack = itemStack;
	}

}

