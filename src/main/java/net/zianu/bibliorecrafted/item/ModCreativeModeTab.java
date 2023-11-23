package net.zianu.bibliorecrafted.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab BIBLIO_RECRAFTED_TAB = new CreativeModeTab("biblio_recrafted_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SIMPLE_BIG_BOOK.get());
        }
    };

}
