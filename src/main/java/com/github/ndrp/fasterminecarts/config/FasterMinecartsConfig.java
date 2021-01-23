package com.github.ndrp.fasterminecarts.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
@Config(name = "faster-minecarts")
public class FasterMinecartsConfig implements ConfigData {
	
	@ConfigEntry.Gui.Excluded
	public double slowSpeed = 0.3;
	
	@ConfigEntry.Gui.Tooltip()
	@ConfigEntry.Category("default")
    public boolean automaticMinecartSlowDown = true;
	
	@ConfigEntry.Gui.Tooltip()
	@ConfigEntry.BoundedDiscrete(max = 12)
	@ConfigEntry.Category("default")
    public int maxSpeed = 8;
}
