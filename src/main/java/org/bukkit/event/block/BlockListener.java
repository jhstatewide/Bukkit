package org.bukkit.event.block;

import org.bukkit.event.Listener;

/**
 * Handles all events thrown in relation to Blocks
 * 
 * @author durron597
 */
public class BlockListener implements Listener {
    /**
     * Default Constructor
     */
    public BlockListener() {
    }

    /**
     * Called when a block is broken (or destroyed)
     *
     * @param event Relevant event details
     */
    public void onBlockBroken(BlockBrokenEvent event) {
    }

    /**
     * Called when we try to place a block, to see if we can build it
     */
    public void onBlockCanBuild(BlockCanBuildEvent event) {
    }

    /**
     * Called when a block flows (water/lava)
     *
     * @param event Relevant event details
     */
    public void onBlockFlow(BlockFromToEvent event) {
    }

    /**
     * Called when a block gets ignited
     *
     * @param event Relevant event details
     */
    public void onBlockIgnite(BlockIgniteEvent event) {
    }

    /**
     * Called when block physics occurs
     *
     * @param event Relevant event details
     */
    public void onBlockPhysics(BlockPhysicsEvent event) {
    }

    /**
     * Called when a player places a block
     *
     * @param event Relevant event details
     */
    public void onBlockPlaced(BlockPlacedEvent event) {
    }
    
    /**
     * Called when a block is interacted with
     * 
     * @param event Relevant event details
     */
    public void onBlockInteracted(BlockInteractEvent event) {
    }

    /**
     * Called when a player right clicks a block
     *
     * @param event Relevant event details
     */
    public void onBlockRightClicked(BlockRightClickedEvent event) {
    }

    /**
     * Called when redstone changes
     * From: the source of the redstone change
     * To: The redstone dust that changed
     *
     * @param event Relevant event details
     */
    public void onBlockRedstoneChange(BlockFromToEvent event) {    	
    }

    /**
     * Called when leaves are decaying naturally
     *
     * @param event Relevant event details
     */
    public void onLeavesDecay(LeavesDecayEvent event) {
    }

}
