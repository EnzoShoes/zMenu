package fr.maxlego08.menu.zcore.utils.attribute;

import org.jetbrains.annotations.NotNull;

public enum Attribute {
	/**
	 * Maximum health of an Entity.
	 */
	GENERIC_MAX_HEALTH("generic.max_health"),
	/**
	 * Range at which an Entity will follow others.
	 */
	GENERIC_FOLLOW_RANGE("generic.follow_range"),
	/**
	 * Resistance of an Entity to knockback.
	 */
	GENERIC_KNOCKBACK_RESISTANCE("generic.knockback_resistance"),
	/**
	 * Movement speed of an Entity.
	 */
	GENERIC_MOVEMENT_SPEED("generic.movement_speed"),
	/**
	 * Flying speed of an Entity.
	 */
	GENERIC_FLYING_SPEED("generic.flying_speed"),
	/**
	 * Attack damage of an Entity.
	 */
	GENERIC_ATTACK_DAMAGE("generic.attack_damage"),
	/**
	 * Attack knockback of an Entity.
	 */
	GENERIC_ATTACK_KNOCKBACK("generic.attack_knockback"),
	/**
	 * Attack speed of an Entity.
	 */
	GENERIC_ATTACK_SPEED("generic.attack_speed"),
	/**
	 * Armor bonus of an Entity.
	 */
	GENERIC_ARMOR("generic.armor"),
	/**
	 * Armor durability bonus of an Entity.
	 */
	GENERIC_ARMOR_TOUGHNESS("generic.armor_toughness"),
	/**
	 * Luck bonus of an Entity.
	 */
	GENERIC_LUCK("generic.luck"),
	/**
	 * Maximum absorption of an Entity.
	 */
	GENERIC_MAX_ABSORPTION("generic.max_absorption"),
	/**
	 * Strength with which a horse will jump.
	 */
	HORSE_JUMP_STRENGTH("horse.jump_strength"),
	/**
	 * Chance of a zombie to spawn reinforcements.
	 */
	ZOMBIE_SPAWN_REINFORCEMENTS("zombie.spawn_reinforcements");

	private final String key;

	private Attribute(String key) {
		this.key = key;
	}

	@NotNull
	public String getKey() {
		return key;
	}
}