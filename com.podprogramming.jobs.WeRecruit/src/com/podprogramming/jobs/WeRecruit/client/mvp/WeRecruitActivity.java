package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class WeRecruitActivity extends
		HandlerRegistrationActivity<IWeRecruitActivity.IWeRecruitView>
		implements IWeRecruitActivity<IWeRecruitActivity.IWeRecruitView> {
	/**
	 * Constructs an instance of the activity corresponding to the given place
	 * 
	 * @param place
	 */
	public WeRecruitActivity( WeRecruitPlace place ) {
		super( Factory.getEventBus(), Factory.weRecruitView() );
	}

	/**
	 * @see com.google.gwt.activity.shared.Activity#start(com.google.gwt.user.client.ui.AcceptsOneWidget,
	 *      com.google.gwt.event.shared.EventBus)
	 */
	@Override
	public void start( AcceptsOneWidget containerWidget, EventBus eventBus ) {
		// resets the view
		view.reset();

		// initializes the labels of the widgets
		
		view.item1HasText().setText( "I can implement this webapp with a lot of java frameworks" );
		view.item2HasText().setText( "Even with other jvm based languages" );
		view.item3HasText().setText( "WTF??!! Why aren't you using Maven? Give me 5 minutes, I'll mavenize it right now." );
		view.item4HasText().setText( "Look at the product we developped! Let me spread the word during JUGs, conferences and on my blog!" );
		view.item5HasText().setText( "Now it's time to get cloudy! AWS, App Engine, Rackspace, etc. have no secrets for me!" );
		view.item6HasText().setText( "30 year old and still being a developer is not a crime!" );
		view.item7HasText().setText( "Hey! Do you know that I do scrums every day?" );
		view.item8HasText().setText( "I know Guice, EMF, Spring, JPA, and even stuff you never heard about it!" );
		view.item9HasText().setText( "For example the open source project I participate." );
		view.item10HasText().setText( "Equinox, Tomcat, JBoss, ... are my friends." );
		view.item11HasText().setText( "And I'm highly motivated by the idea of developing a new product!" );
		view.combinationHasText().setText( "Are you ready?" );

		// event handler registration
		// 1. creates a boolean change handler
		ValueChangeHandler<Boolean> booleanChangeHandler = new ValueChangeHandler<Boolean>() {
			@Override
			public void onValueChange( ValueChangeEvent<Boolean> event ) {
				// updates the combination label
				updateCombinationLabel();
			}
		};
		// 2. registers the boolean change handler on the selectable items of
		// the view
		registerHandler( view.item1HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item2HasValue().addValueChangeHandler(
				booleanChangeHandler ) );

		// attaches the view in the container widget of the application
		containerWidget.setWidget( view.asWidget() );
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity#updateCombinationLabel()
	 */
	@Override
	public void updateCombinationLabel() {
		// retrieves the state of the selectable items of the view
		boolean isItem1Selected = view.item1HasValue().getValue();
		boolean isItem2Selected = view.item2HasValue().getValue();

		// computes the combination message
		String combinationMessage = "nothing selected";
		if( isItem1Selected ) {
			if( isItem2Selected ) {
				combinationMessage = "items 1 and 2 selected";
			} else {
				combinationMessage = "item 1 selected";
			}
		} else if( isItem2Selected ) {
			combinationMessage = "item 2 selected";
		}

		// sets the resulting message in the view
		view.combinationHasText().setText( combinationMessage );
	}
}