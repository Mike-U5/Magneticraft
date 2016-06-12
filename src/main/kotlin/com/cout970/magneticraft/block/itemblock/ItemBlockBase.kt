package com.cout970.magneticraft.block.itemblock

import com.cout970.magneticraft.block.BlockBase
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack

class ItemBlockBase(block: BlockBase) : ItemBlock(block) {

    init {
        registryName = block.registryName
        unlocalizedName = block.unlocalizedName
        hasSubtypes = true
    }

    override fun getUnlocalizedName(stack: ItemStack?): String {
        return (block as BlockBase).getUnlocalizedName(stack) ?: "unamed"
    }

    fun getMaxModels():Int = (block as BlockBase).getMaxModels()

    fun getModelLoc(i :Int): ModelResourceLocation = (block as BlockBase).getModelLoc(i)

    override fun getMetadata(damage: Int): Int = damage
}