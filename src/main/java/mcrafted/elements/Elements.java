package mcrafted.elements;
import mcrafted.elements.proxy.IProxy;
import mcrafted.elements.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Elements
{
@Mod.Instance(Reference.MOD_ID)
public static Elements instance;
@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY, modId = Reference.MOD_ID)
public static IProxy proxy;
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	System.out.println("Elements 0.2a is preinitializing.");
}
@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	System.out.println("Elements 0.2a has loaded.");
}
@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event)
{
}
}
