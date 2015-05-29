package mcjty.rftools.blocks.environmental;

import net.minecraftforge.common.config.Configuration;

public class EnvironmentalConfiguration {
    public static final String CATEGORY_ENVIRONMENTAL = "environmental";
    public static int ENVIRONMENTAL_MAXENERGY = 500000;
    public static int ENVIRONMENTAL_RECEIVEPERTICK = 20000;
    public static int MIN_USAGE = 5;

    public static float FEATHERFALLING_RFPERTICK = 0.001f;
    public static float FEATHERFALLINGPLUS_RFPERTICK = 0.003f;
    public static float FLIGHT_RFPERTICK = 0.004f;
    public static float HASTE_RFPERTICK = 0.001f;
    public static float HASTEPLUS_RFPERTICK = 0.003f;
    public static float NIGHTVISION_RFPERTICK = 0.001f;
    public static float PEACEFUL_RFPERTICK = 0.001f;
    public static float REGENERATION_RFPERTICK = 0.0015f;
    public static float REGENERATIONPLUS_RFPERTICK = 0.0045f;
    public static float SATURATION_RFPERTICK = 0.001f;
    public static float SATURATIONPLUS_RFPERTICK = 0.003f;
    public static float SPEED_RFPERTICK = 0.001f;
    public static float SPEEDPLUS_RFPERTICK = 0.003f;
    public static float WATERBREATHING_RFPERTICK = 0.001f;

    public static void init(Configuration cfg) {
        ENVIRONMENTAL_MAXENERGY = cfg.get(CATEGORY_ENVIRONMENTAL, "environmentalMaxRF", ENVIRONMENTAL_MAXENERGY,
                "Maximum RF storage that the environmental controller can hold").getInt();
        ENVIRONMENTAL_RECEIVEPERTICK = cfg.get(CATEGORY_ENVIRONMENTAL, "environmentalRFPerTick", ENVIRONMENTAL_RECEIVEPERTICK,
                "RF per tick that the the environmental controller can receive").getInt();
        MIN_USAGE = cfg.get(CATEGORY_ENVIRONMENTAL, "environmentalMinRFUsage", MIN_USAGE,
                "The minimum RF/tick usage that an active controller consumes").getInt();

        FEATHERFALLING_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "featherfallingRFPerTick", FEATHERFALLING_RFPERTICK,
                "RF per tick/per block for the feather falling module").getDouble();
        FEATHERFALLINGPLUS_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "featherfallingPlusRFPerTick", FEATHERFALLINGPLUS_RFPERTICK,
                "RF per tick/per block for the feather falling plus module").getDouble();
        FLIGHT_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "flightRFPerTick", FLIGHT_RFPERTICK,
                "RF per tick/per block for the flight module").getDouble();
        HASTE_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "hasteRFPerTick", HASTE_RFPERTICK,
                "RF per tick/per block for the haste module").getDouble();
        HASTEPLUS_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "hastePlusRFPerTick", HASTEPLUS_RFPERTICK,
                "RF per tick/per block for the haste plus module").getDouble();
        NIGHTVISION_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "nightvisionRFPerTick", NIGHTVISION_RFPERTICK,
                "RF per tick/per block for the night vision module").getDouble();
        PEACEFUL_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "peacefulRFPerTick", PEACEFUL_RFPERTICK,
                "RF per tick/per block for the peaceful module").getDouble();
        REGENERATION_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "regenerationRFPerTick", REGENERATION_RFPERTICK,
                "RF per tick/per block for the regeneration module").getDouble();
        REGENERATIONPLUS_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "regenerationPlusRFPerTick", REGENERATIONPLUS_RFPERTICK,
                "RF per tick/per block for the regeneration plus module").getDouble();
        SATURATION_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "saturationRFPerTick", SATURATION_RFPERTICK,
                "RF per tick/per block for the saturation module").getDouble();
        SATURATIONPLUS_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "saturationPlusRFPerTick", SATURATIONPLUS_RFPERTICK,
                "RF per tick/per block for the saturation plus module").getDouble();
        SPEED_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "speedRFPerTick", SPEED_RFPERTICK,
                "RF per tick/per block for the speed module").getDouble();
        SPEEDPLUS_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "speedPlusRFPerTick", SPEEDPLUS_RFPERTICK,
                "RF per tick/per block for the speed plus module").getDouble();
        WATERBREATHING_RFPERTICK = (float) cfg.get(CATEGORY_ENVIRONMENTAL, "watherBreathingRFPerTick", WATERBREATHING_RFPERTICK,
                "RF per tick/per block for the wather breathing module").getDouble();
    }
}
