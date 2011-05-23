package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class WeRecruitActivity extends
		HandlerRegistrationActivity<IWeRecruitActivity.IWeRecruitView>
		implements IWeRecruitActivity<IWeRecruitActivity.IWeRecruitView> {
	
	private final byte[] message = {60,98,114,47,62,87,101,32,119,97,110,116,32,121,111,117,33,32,77,97,
									105,108,32,117,115,32,121,111,117,114,32,114,101,115,117,109,101,44,
									32,121,111,117,114,32,103,105,116,104,117,98,32,112,97,103,101,44,32,
									121,111,117,114,32,98,108,111,103,44,32,121,111,117,114,32,116,119,105,
									116,116,101,114,32,97,110,100,47,111,114,32,97,110,121,116,104,105,110,
									103,32,121,111,117,32,102,105,110,100,32,114,101,108,101,118,97,110,116,
									32,102,111,114,32,116,104,105,115,32,112,111,115,105,116,105,111,110,46,
									60,47,98,114,62,77,97,105,108,32,117,115,32,97,116,32,60,97,32,104,114,
									101,102,61,34,109,97,105,108,116,111,58,114,101,99,114,117,105,116,109,
									101,110,116,64,112,111,100,45,112,114,111,103,114,97,109,109,105,110,103,
									46,99,111,109,34,62,114,101,99,114,117,105,116,109,101,110,116,64,112,111,
									100,45,112,114,111,103,114,97,109,109,105,110,103,46,99,111,109,60,47,97,62,};
	
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
		view.item6HasText().setText( "30 years old and still being a developer is not a crime!" );
		view.item7HasText().setText( "Hey! Do you know that I hold scrums every day?" );
		view.item8HasText().setText( "I know Guice, EMF, Spring, JPA, and even stuff you never heard about it!" );
		view.item9HasText().setText( "For example the open source project I participate." );
		view.item10HasText().setText( "Equinox, Tomcat, JBoss, ... are my friends." );
		view.item11HasText().setText( "My deepest dream is to be the java leader of the next killer open source framework" );
		view.item12HasText().setText( "Model Driven Engineering doesn't give me spots! I think MDE is cool" );
		view.item13HasText().setText( "I'm cool too ..." );

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
		registerHandler( view.item3HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item4HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item5HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item6HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item7HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item8HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item9HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item10HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler( view.item11HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler ( view.item12HasValue().addValueChangeHandler(
				booleanChangeHandler ) );
		registerHandler ( view.item13HasValue().addValueChangeHandler(
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
		boolean youWin = view.item1HasValue().getValue() 
								&& view.item2HasValue().getValue() 
								&& view.item3HasValue().getValue()
								&& view.item4HasValue().getValue()
								&& view.item5HasValue().getValue()
								&& view.item6HasValue().getValue()
								&& view.item7HasValue().getValue()
								&& view.item8HasValue().getValue()
								&& view.item9HasValue().getValue()
								&& view.item10HasValue().getValue()
								&& view.item11HasValue().getValue()
								&& view.item12HasValue().getValue()
								&& view.item13HasValue().getValue();
		// computes the combination message
		String combinationMessage = "";
		if( youWin ) {
			combinationMessage = new String(message);
		}

		// sets the resulting message in the view
		view.mailToHasHTML().setHTML( combinationMessage );
	}
}