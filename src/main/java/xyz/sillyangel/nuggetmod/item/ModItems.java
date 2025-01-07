package xyz.sillyangel.nuggetmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.sillyangel.nuggetmod.NuggetMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NuggetMod.MOD_ID);

    public static final DeferredItem<Item> NUGGET = ITEMS.register("nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
