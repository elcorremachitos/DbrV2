package dbr.main.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import dbr.main.lib.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static void dbrMod(){
		initializeItem();
		RegisterItem();
	}
	
	
	public static Item TpsNormal;
	public static Item TpsSuper;
	public static Item SenzuCorrupta;
	public static Item Atras;
	public static Item Casino;
	public static Item Rebirth;
	public static Item T1;
	public static Item T2;
	public static Item T3;
	public static Item T4;
	public static Item T5;
	public static Item TiendaJugadores;
	public static Item Trainings;
	public static Item Fantasmita;
	public static Item Esqueleto;
	public static Item Dragon;
	public static Item Protector;
	
	public static void initializeItem(){
		
		TpsNormal = new Item().setUnlocalizedName("TpsNormal").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:TpsNormal");
		TpsSuper = new Item().setUnlocalizedName("TpsSuper").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:TpsSuper");
		SenzuCorrupta = new Item().setUnlocalizedName("SenzuCorrupta").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:SenzuCorrupta");
		Atras = new Item().setUnlocalizedName("Atras").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:Atras");
		Casino = new Item().setUnlocalizedName("Casino").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:Casino");
		Rebirth = new Item().setUnlocalizedName("Rebirth").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:Rebirth");
		T1 = new Item().setUnlocalizedName("T1").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:T1");
		T2 = new Item().setUnlocalizedName("T2").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:T2");
		T3 = new Item().setUnlocalizedName("T3").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:T3");
		T4 = new Item().setUnlocalizedName("T4").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:T4");
		T5 = new Item().setUnlocalizedName("T5").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:T5");
		TiendaJugadores = new Item().setUnlocalizedName("TiendaJugadores").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:TiendaJugadores");
		Trainings = new Item().setUnlocalizedName("Trainings").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:Trainings");
		Fantasmita = new Item().setUnlocalizedName("Fantasmita").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:Fantasmita");
		Esqueleto = new Item().setUnlocalizedName("Esqueleto").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:Esqueleto");
		Dragon = new Item().setUnlocalizedName("Dragon").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:Dragon");
		Protector = new Item().setUnlocalizedName("Protector").setCreativeTab(CreativeTabs.tabRedstone).setTextureName("main:Protector");
		
	}
	
	public static void RegisterItem(){
		
		GameRegistry.registerItem(TpsNormal, TpsNormal.getUnlocalizedName());
		GameRegistry.registerItem(TpsSuper, TpsSuper.getUnlocalizedName());
		GameRegistry.registerItem(SenzuCorrupta, SenzuCorrupta.getUnlocalizedName());
		GameRegistry.registerItem(Atras, Atras.getUnlocalizedName());
		GameRegistry.registerItem(Casino, Casino.getUnlocalizedName());
		GameRegistry.registerItem(Rebirth, Rebirth.getUnlocalizedName());
		GameRegistry.registerItem(T1, T1.getUnlocalizedName());
		GameRegistry.registerItem(T2, T2.getUnlocalizedName());
		GameRegistry.registerItem(T3, T3.getUnlocalizedName());
		GameRegistry.registerItem(T4, T4.getUnlocalizedName());
		GameRegistry.registerItem(T5, T5.getUnlocalizedName());
		GameRegistry.registerItem(TiendaJugadores, TiendaJugadores.getUnlocalizedName());
		GameRegistry.registerItem(Trainings, Trainings.getUnlocalizedName());
		GameRegistry.registerItem(Fantasmita, Fantasmita.getUnlocalizedName());
		GameRegistry.registerItem(Esqueleto, Esqueleto.getUnlocalizedName());
		GameRegistry.registerItem(Dragon, Dragon.getUnlocalizedName());
		GameRegistry.registerItem(Protector, Protector.getUnlocalizedName());
		
	}
	
}
