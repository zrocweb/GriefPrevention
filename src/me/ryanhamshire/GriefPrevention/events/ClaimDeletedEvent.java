package me.ryanhamshire.GriefPrevention.events;

import me.ryanhamshire.GriefPrevention.Claim;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event gets called whenever a claim is going to be deleted.
 * @author Tux2
 *
 */
public class ClaimDeletedEvent extends Event implements Cancellable {

	// Custom Event Requirements
    private static final HandlerList handlers = new HandlerList();
    
    public HandlerList getHandlers() {
        return handlers;
    }
     
    public static HandlerList getHandlerList() {
        return handlers;
    }
    
    Claim claim;
    
    public ClaimDeletedEvent(Claim claim) {
    	this.claim = claim;
    }
    
    /**
     * Gets the claim to be deleted.
     * @return
     */
    public Claim getClaim() {
    	return claim;
    }
    
    boolean canceled = false;

	@Override
	public boolean isCancelled() {
		return canceled;
	}

	@Override
	public void setCancelled(boolean iscancelled) {
		canceled = iscancelled;
	}

}
