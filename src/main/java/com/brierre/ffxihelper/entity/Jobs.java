package com.brierre.ffxihelper.entity;

public enum Jobs {
	WARRIOR("Warrior", "WAR"),
	MONK("Monk", "MNK"),
	WHITE_MAGE("White Mage", "WHM"),
	BLACK_MAGE("Black Mage", "BLM"),
	RED_MAGE("Red Mage", "RDM"),
	THIEF("Thief", "THF"),
	PALADIN("Paladin", "PLD"),
	DARK_KNIGHT("Dark Knight", "DRK"),
	BEASTMASTER("Beastmaster", "BST"),
	BARD("Bard", "BRD"),
	RANGER("Ranger", "RNG"),
	SAMURAI("Samurai", "SAM"),
	NINJA("Ninja", "NIN"),
	DRAGOON("Dragoon", "DRG"),
	SUMMONER("Summoner", "SMN"),
	BLUE_MAGE("Blue Mage", "BLU"),
	CORSAIR("Corsair", "COR"),
	PUPPETMASTER("Puppetmaster", "PUP"),
	DANCER("Dancer", "DNC"),
	SCHOLAR("Scholar", "SCH"),
	GEOMANCER("Geomancer", "GEO"),
	RUNEFENCER("Runefencer", "RUN"); 
	
	private final String full;
	private final String abbr;
	
	private Jobs(String full, String abbr) {
		this.full = full;
		this.abbr = abbr;
	}
	
	public String getFullName() {
		return full;
	}
	
	public String getAbbreviatedName() {
		return abbr;
	}
}
