package net.sdm.ctjl;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.sdm.ctjl.runtime.ClassGenerator;
import net.sdm.ctjl.runtime.SDMJavaCompiler;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

@Mod(CraftTweakerJavaLibrary.MODID)
public class CraftTweakerJavaLibrary {

    public static final String MODID = "ctjl";
    public static final Logger LOGGER = CraftTweakerAPI.getLogger("CTJL");
    public CraftTweakerJavaLibrary() {
        try {
            ClassGenerator.generateTestClass();
        } catch (Exception e) {
            LOGGER.error(e);
        }

    }
}
