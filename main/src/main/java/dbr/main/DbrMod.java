package dbr.main;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dbr.main.ModItems.ModItems;
import dbr.main.proxies.ClientProxy;
import dbr.main.proxies.CommonProxy;

@Mod(name = "Dragon Block Resurrection", modid = "main", version = "1.0")
public class DbrMod {
	
	@SidedProxy(clientSide="dbr.main.proxies.ClientProxy", serverSide="dbr.main.proxies.CommonProxy")
	public static CommonProxy proxy;
	public static ClientProxy cproxy;
	
	public static Logger log = FMLLog.getLogger();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModItems.dbrMod();
		log.info("Mod PreInit");
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		log.info("Mod Init");
		proxy.registerRenders();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		log.info("Mod postInit");
	}

}
