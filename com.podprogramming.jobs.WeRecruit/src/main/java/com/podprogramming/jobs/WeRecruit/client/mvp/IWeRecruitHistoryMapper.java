package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers( {WeRecruitPlace.Tokenizer.class} )
public interface IWeRecruitHistoryMapper extends PlaceHistoryMapper {
}
