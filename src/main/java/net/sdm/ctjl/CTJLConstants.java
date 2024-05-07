package net.sdm.ctjl;

import com.blamejared.crafttweaker.api.CraftTweakerConstants;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraftforge.fml.loading.FMLPaths;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.ctjl.api.CTJLConstants")
public class CTJLConstants {

    @ZenCodeType.Field
    public static String SCRIPTS_DIRECTORY = CraftTweakerConstants.SCRIPTS_DIRECTORY;
    @ZenCodeType.Field
    public static String GAMEDIR = FMLPaths.GAMEDIR.get().toString();
    @ZenCodeType.Field
    public static String CONFIGDIR = FMLPaths.CONFIGDIR.get().toString();
    @ZenCodeType.Field
    public static String MODSDIR = FMLPaths.MODSDIR.get().toString();
}
