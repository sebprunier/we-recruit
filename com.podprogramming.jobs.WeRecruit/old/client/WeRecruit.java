package com.podprogramming.jobs.WeRecruit.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.podprogramming.jobs.WeRecruit.client.mvp.Factory;
import com.podprogramming.jobs.WeRecruit.client.mvp.WeRecruitPlace;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WeRecruit implements EntryPoint {
	private final Place defaultPlace = new WeRecruitPlace();
	private final SimplePanel weRecruitMainView = new SimplePanel();

	/**
	 * This is the entry point method.
	 */
	@Override
	public void onModuleLoad() {
		// defines the application main widget
		Factory.getActivityManager().setDisplay( weRecruitMainView );

		// attaches the application main view to the Html DOM
		RootPanel.get( "weRecruit" ).add( weRecruitMainView );

		// binds the place controller, the application event bus and the default
		// view of the application
		PlaceHistoryHandler placeHistoryHandler = Factory
				.getPlaceHistoryHandler();
		placeHistoryHandler.register( Factory.getPlaceController(),
				Factory.getEventBus(), defaultPlace );

		// manages the history
		placeHistoryHandler.handleCurrentHistory();
	}
}