package net.zianu.bibliorecrafted.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zianu.bibliorecrafted.BiblioRecrafted;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BiblioRecrafted.MOD_ID);

    public static final RegistryObject<Item> SIMPLE_BIG_BOOK = ITEMS.register("simple_big_book", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BIBLIO_RECRAFTED_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
