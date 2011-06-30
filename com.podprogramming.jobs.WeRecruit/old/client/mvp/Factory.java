package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;

/**
 * Nope, it's not a job offer for a factory, don't get confused!
 */
public class Factory {
	// the singleton instance of EventBus
	private static EventBus eventBus;

	// the singleton instance of PlaceController
	private static PlaceController placeController;

	// the singleton instance of ActivityManager
	private static ActivityManager activityManager;

	// the singleton instance of ActivityMapper
	private static ActivityMapper activityMapper;

	// the singleton instance of PlaceHistoryHandler
	private static PlaceHistoryHandler placeHistoryHandler;

	// the singleton instance of IWeRecruitView
	private static IWeRecruitActivity.IWeRecruitView weRecruitView;

	/**
	 * The bus that connects the factory and the rest of the world.
	 * 
	 * @return
	 */
	public static EventBus getEventBus() {
		if( eventBus == null ) {
			eventBus = new SimpleEventBus();
		}

		return eventBus;
	}

	/**
	 * The place history handler
	 * 
	 * @return
	 */
	public static PlaceHistoryHandler getPlaceHistoryHandler() {
		if( placeHistoryHandler == null ) {
			placeHistoryHandler = new PlaceHistoryHandler(
					(PlaceHistoryMapper) GWT
							.create( IWeRecruitHistoryMapper.class ) );
		}

		return placeHistoryHandler;
	}

	/**
	 * The history controller
	 * 
	 * @return
	 */
	public static PlaceController getPlaceController() {
		if( placeController == null ) {
			placeController = new PlaceController( getEventBus() );
		}

		return placeController;
	}

	/**
	 * The activity manager
	 * 
	 * @return
	 */
	public static ActivityManager getActivityManager() {
		if( activityManager == null ) {
			activityManager = new ActivityManager( getActivityMapper(),
					getEventBus() );
		}

		return activityManager;
	}

	/**
	 * The ActivityMapper
	 * 
	 * @return ActivityMapper
	 */
	public static ActivityMapper getActivityMapper() {
		if( activityMapper == null ) {
			activityMapper = new WeRecruitActivityMapper();
		}

		return activityMapper;
	}

	/**
	 * The view used for the corresponding activity
	 * 
	 * @return
	 */
	public static IWeRecruitActivity.IWeRecruitView weRecruitView() {
		if( weRecruitView == null ) {
			weRecruitView = new WeRecruitView();
		}

		return weRecruitView;
	}
}