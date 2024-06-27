package nl.lankreijer.hotbar3x3;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import nl.lankreijer.hotbar3x3.config.Hotbar3x3Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class Hotbar3x3Client implements ClientModInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger("hotbar3x3");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Initializing 3x3hotbar");
		AutoConfig.register(Hotbar3x3Config.class, GsonConfigSerializer::new);
		LOGGER.info("Initialized 3x3hotbar");
	}
}