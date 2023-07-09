package com.jamdotjar.pcmod.screen;

import com.jamdotjar.pcmod.block.entity.RefineryBlockEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;

public class RefineryMenu extends AbstractContainerMenu {
    public final RefineryBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public RefineryMenu(int id, Inventory inv, FriendlyByteBuf extraData){
        this(id, inv inv.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }
    public RefineryMenu(int id, Inventory inv, BlockEntity entity, ContainerData data) {
        super();
    }



    @Override
    public ItemStack quickMoveStack(Player p_38941_, int p_38942_) {
        return null;
    }

    @Override
    public boolean stillValid(Player p_38874_) {
        return false;
    }
}
