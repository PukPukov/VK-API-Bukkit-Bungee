package com.ubivashka.vk.bukkit.events;

import org.bukkit.event.HandlerList;

import com.vk.api.sdk.objects.callback.MarketComment;

public class VKMarketCommentEvent extends VKMarketCommentActionEvent {
	private static final HandlerList handlers = new HandlerList();

	public VKMarketCommentEvent(MarketComment comment) {
		super(comment);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}
}
