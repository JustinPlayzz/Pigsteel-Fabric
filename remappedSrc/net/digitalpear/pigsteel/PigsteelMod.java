package net.digitalpear.pigsteel;

import net.digitalpear.pigsteel.specialblocks.*;
import net.digitalpear.pigsteel.specialblocks.waxed.*;
import net.digitalpear.pigsteel.specialslabs.waxed.WaxedCorruptedCutPigsteelSlab;
import net.digitalpear.pigsteel.specialslabs.waxed.WaxedCutPigsteelSlab;
import net.digitalpear.pigsteel.specialslabs.waxed.WaxedInfectedCutPigsteelSlab;
import net.digitalpear.pigsteel.specialslabs.waxed.WaxedZombifiedCutPigsteelSlab;
import net.digitalpear.pigsteel.specialstairs.*;
import net.digitalpear.pigsteel.specialslabs.*;
import net.digitalpear.pigsteel.specialstairs.waxed.WaxedCorruptedCutPigsteelStairs;
import net.digitalpear.pigsteel.specialstairs.waxed.WaxedCutPigsteelStairs;
import net.digitalpear.pigsteel.specialstairs.waxed.WaxedInfectedCutPigsteelStairs;
import net.digitalpear.pigsteel.specialstairs.waxed.WaxedZombifiedCutPigsteelStairs;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications; //DO NOT DELETE
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors; //DO NOT DELETE
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class PigsteelMod implements ModInitializer {


    public static final Block PIGSTEEL_BLOCK = new PigsteelBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK));
	public static final Block WAXED_PIGSTEEL_BLOCK = new WaxedPigsteelBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK));

	public static final Block CUT_PIGSTEEL = new CutPigsteel(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block INFECTED_CUT_PIGSTEEL = new InfectedCutPigsteel(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block CORRUPTED_CUT_PIGSTEEL = new CorruptedCutPigsteel(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block ZOMBIFIED_CUT_PIGSTEEL = new ZombifiedCutPigsteel(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

	public static final Block CUT_PIGSTEEL_STAIRS = new CutPigsteelStairs(CUT_PIGSTEEL.getDefaultState(),FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block INFECTED_CUT_PIGSTEEL_STAIRS = new InfectedCutPigsteelStairs(INFECTED_CUT_PIGSTEEL.getDefaultState(),FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block CORRUPTED_CUT_PIGSTEEL_STAIRS = new CorruptedCutPigsteelStairs(CORRUPTED_CUT_PIGSTEEL.getDefaultState(),FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block ZOMBIFIED_CUT_PIGSTEEL_STAIRS = new ZombifiedCutPigsteelStairs(ZOMBIFIED_CUT_PIGSTEEL.getDefaultState(),FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

	public static final Block CUT_PIGSTEEL_SLAB = new CutPigsteelSlab(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block INFECTED_CUT_PIGSTEEL_SLAB = new InfectedCutPigsteelSlab(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block CORRUPTED_CUT_PIGSTEEL_SLAB = new CorruptedCutPigsteelSlab(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block ZOMBIFIED_CUT_PIGSTEEL_SLAB = new ZombifiedCutPigsteelSlab(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	
	public static final Block WAXED_CUT_PIGSTEEL = new WaxedCutPigsteel(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_INFECTED_CUT_PIGSTEEL = new WaxedInfectedCutPigsteel(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_CORRUPTED_CUT_PIGSTEEL = new WaxedCorruptedCutPigsteel(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_ZOMBIFIED_CUT_PIGSTEEL = new WaxedZombifiedCutPigsteel(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

	public static final Block WAXED_CUT_PIGSTEEL_STAIRS = new WaxedCutPigsteelStairs(WAXED_CUT_PIGSTEEL.getDefaultState(),FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_INFECTED_CUT_PIGSTEEL_STAIRS = new WaxedInfectedCutPigsteelStairs(WAXED_INFECTED_CUT_PIGSTEEL.getDefaultState(),FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_CORRUPTED_CUT_PIGSTEEL_STAIRS = new WaxedCorruptedCutPigsteelStairs(WAXED_CORRUPTED_CUT_PIGSTEEL.getDefaultState(),FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_ZOMBIFIED_CUT_PIGSTEEL_STAIRS = new WaxedZombifiedCutPigsteelStairs(WAXED_ZOMBIFIED_CUT_PIGSTEEL.getDefaultState(),FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

	public static final Block WAXED_CUT_PIGSTEEL_SLAB = new WaxedCutPigsteelSlab(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_INFECTED_CUT_PIGSTEEL_SLAB = new WaxedInfectedCutPigsteelSlab(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_CORRUPTED_CUT_PIGSTEEL_SLAB = new WaxedCorruptedCutPigsteelSlab(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
	public static final Block WAXED_ZOMBIFIED_CUT_PIGSTEEL_SLAB = new WaxedZombifiedCutPigsteelSlab(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

	public static final Block PIGSTEEL_ORE = new PigsteelOre(FabricBlockSettings.copy(Blocks.NETHER_GOLD_ORE));
	public static final Block STONE_PIGSTEEL_ORE = new PigsteelOre(FabricBlockSettings.copy(Blocks.IRON_ORE));
	public static final Block DEEPSLATE_PIGSTEEL_ORE = new PigsteelOre(FabricBlockSettings.copy(Blocks.DEEPSLATE_IRON_ORE));


	private static ConfiguredFeature<?, ?> PIGSTEEL_ORE_NETHER = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.NETHERRACK, PIGSTEEL_ORE.getDefaultState(), 5)).uniformRange(YOffset.fixed(0), YOffset.getTop()).spreadHorizontally().repeat(15);
	@Override
	public void onInitialize() {

		String MOD_ID = "pigsteel";

		//Pigsteel Blocks
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pigsteel_block"), PIGSTEEL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pigsteel_block"), new BlockItem(PIGSTEEL_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_pigsteel_block"), WAXED_PIGSTEEL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_pigsteel_block"), new BlockItem(WAXED_PIGSTEEL_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));


		//Cut Pigsteel Blocks
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cut_pigsteel"), CUT_PIGSTEEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cut_pigsteel"), new BlockItem(CUT_PIGSTEEL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "infected_cut_pigsteel"), INFECTED_CUT_PIGSTEEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "infected_cut_pigsteel"), new BlockItem(INFECTED_CUT_PIGSTEEL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "corrupted_cut_pigsteel"), CORRUPTED_CUT_PIGSTEEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corrupted_cut_pigsteel"), new BlockItem(CORRUPTED_CUT_PIGSTEEL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "zombified_cut_pigsteel"), ZOMBIFIED_CUT_PIGSTEEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "zombified_cut_pigsteel"), new BlockItem(ZOMBIFIED_CUT_PIGSTEEL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));



		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cut_pigsteel_stairs"), CUT_PIGSTEEL_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cut_pigsteel_stairs"), new BlockItem(CUT_PIGSTEEL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "infected_cut_pigsteel_stairs"), INFECTED_CUT_PIGSTEEL_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "infected_cut_pigsteel_stairs"), new BlockItem(INFECTED_CUT_PIGSTEEL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "corrupted_cut_pigsteel_stairs"), CORRUPTED_CUT_PIGSTEEL_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corrupted_cut_pigsteel_stairs"), new BlockItem(CORRUPTED_CUT_PIGSTEEL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "zombified_cut_pigsteel_stairs"), ZOMBIFIED_CUT_PIGSTEEL_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "zombified_cut_pigsteel_stairs"), new BlockItem(ZOMBIFIED_CUT_PIGSTEEL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));



		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cut_pigsteel_slab"), CUT_PIGSTEEL_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cut_pigsteel_slab"), new BlockItem(CUT_PIGSTEEL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "infected_cut_pigsteel_slab"), INFECTED_CUT_PIGSTEEL_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "infected_cut_pigsteel_slab"), new BlockItem(INFECTED_CUT_PIGSTEEL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "corrupted_cut_pigsteel_slab"), CORRUPTED_CUT_PIGSTEEL_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corrupted_cut_pigsteel_slab"), new BlockItem(CORRUPTED_CUT_PIGSTEEL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "zombified_cut_pigsteel_slab"), ZOMBIFIED_CUT_PIGSTEEL_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "zombified_cut_pigsteel_slab"), new BlockItem(ZOMBIFIED_CUT_PIGSTEEL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		
		//Waxed Cut Pigsteel Blocks
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_cut_pigsteel"), WAXED_CUT_PIGSTEEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_cut_pigsteel"), new BlockItem(WAXED_CUT_PIGSTEEL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_infected_cut_pigsteel"), WAXED_INFECTED_CUT_PIGSTEEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_infected_cut_pigsteel"), new BlockItem(WAXED_INFECTED_CUT_PIGSTEEL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_corrupted_cut_pigsteel"), WAXED_CORRUPTED_CUT_PIGSTEEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_corrupted_cut_pigsteel"), new BlockItem(WAXED_CORRUPTED_CUT_PIGSTEEL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_zombified_cut_pigsteel"), WAXED_ZOMBIFIED_CUT_PIGSTEEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_zombified_cut_pigsteel"), new BlockItem(WAXED_ZOMBIFIED_CUT_PIGSTEEL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));



		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_cut_pigsteel_stairs"), WAXED_CUT_PIGSTEEL_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_cut_pigsteel_stairs"), new BlockItem(WAXED_CUT_PIGSTEEL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_infected_cut_pigsteel_stairs"), WAXED_INFECTED_CUT_PIGSTEEL_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_infected_cut_pigsteel_stairs"), new BlockItem(WAXED_INFECTED_CUT_PIGSTEEL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_corrupted_cut_pigsteel_stairs"), WAXED_CORRUPTED_CUT_PIGSTEEL_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_corrupted_cut_pigsteel_stairs"), new BlockItem(WAXED_CORRUPTED_CUT_PIGSTEEL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_zombified_cut_pigsteel_stairs"), WAXED_ZOMBIFIED_CUT_PIGSTEEL_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_zombified_cut_pigsteel_stairs"), new BlockItem(WAXED_ZOMBIFIED_CUT_PIGSTEEL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));



		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_cut_pigsteel_slab"), WAXED_CUT_PIGSTEEL_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_cut_pigsteel_slab"), new BlockItem(WAXED_CUT_PIGSTEEL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_infected_cut_pigsteel_slab"), WAXED_INFECTED_CUT_PIGSTEEL_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_infected_cut_pigsteel_slab"), new BlockItem(WAXED_INFECTED_CUT_PIGSTEEL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_corrupted_cut_pigsteel_slab"), WAXED_CORRUPTED_CUT_PIGSTEEL_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_corrupted_cut_pigsteel_slab"), new BlockItem(WAXED_CORRUPTED_CUT_PIGSTEEL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "waxed_zombified_cut_pigsteel_slab"), WAXED_ZOMBIFIED_CUT_PIGSTEEL_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waxed_zombified_cut_pigsteel_slab"), new BlockItem(WAXED_ZOMBIFIED_CUT_PIGSTEEL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));


		//Ores
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pigsteel_ore"), PIGSTEEL_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pigsteel_ore"), new BlockItem(PIGSTEEL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_pigsteel_ore"), STONE_PIGSTEEL_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_pigsteel_ore"), new BlockItem(STONE_PIGSTEEL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "deepslate_pigsteel_ore"), DEEPSLATE_PIGSTEEL_ORE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "deepslate_pigsteel_ore"), new BlockItem(DEEPSLATE_PIGSTEEL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//Items
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pigsteel_ingot"), new Item(new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pigsteel_nugget"), new Item(new FabricItemSettings().group(ItemGroup.MISC)));
		
		RegistryKey<ConfiguredFeature<?, ?>> pigsteelOreNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("pigsteel", "pigsteel_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, pigsteelOreNether.getValue(), PIGSTEEL_ORE_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, pigsteelOreNether);

		System.out.println("Let there be pigsteel!");
	}
}
