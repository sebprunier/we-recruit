package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * Matches an url token with the WeRecruitActivity
 */
public class WeRecruitPlace extends Place {
	/**
	 * Performs the conversion between the token and the activity
	 */
	@Prefix("we_recruit")
	public static class Tokenizer implements PlaceTokenizer<WeRecruitPlace> {
		@Override
		public String getToken(WeRecruitPlace place) {
			return null;
		}

		@Override
		public WeRecruitPlace getPlace(String token) {
			return new WeRecruitPlace();
		}
	}
}