package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

/**
 * Handles the history changes
 */
public class WeRecruitActivityMapper implements ActivityMapper {

	@Override
	public Activity getActivity( Place place ) {
		// initiates the activity to return
		Activity activity = null;

		if( place instanceof WeRecruitPlace ) {
			activity = new WeRecruitActivity( (WeRecruitPlace) place );
		}
		return activity;
	}

}
