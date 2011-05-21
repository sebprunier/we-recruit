package com.podprogramming.jobs.WeRecruit.client.mvp;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.IsWidget;

/**
 * Default implementation of an activity which allox
 * 
 * @param <V>
 */
public abstract class HandlerRegistrationActivity<V extends IsWidget>
		implements Activity {

	// the event bus, view and list of handler registrations managed by this
	// activity
	protected final EventBus eventBus;
	protected final V view;
	private final List<HandlerRegistration> handlerRegistrations;

	public HandlerRegistrationActivity( final EventBus eventBus, final V view ) {
		// initializes the event bus and the view handled by this activity
		this.eventBus = eventBus;
		this.view = view;

		handlerRegistrations = new ArrayList<HandlerRegistration>();
	}

	/**
	 * Registers an event handler to the current activity
	 * 
	 * @param handlerRegistration
	 */
	protected void registerHandler( HandlerRegistration handlerRegistration ) {
		handlerRegistrations.add( handlerRegistration );
	}

	/**
	 * Implementation which removes all the registered event handlers
	 * 
	 * @see com.google.gwt.activity.shared.Activity#onStop()
	 */
	@Override
	public void onStop() {
		// removes all the handler registrations
		for( HandlerRegistration handlerRegistration : handlerRegistrations ) {
			handlerRegistration.removeHandler();
		}

		// clears the registration list
		handlerRegistrations.clear();
	}

	/**
	 * Default no-op that does not prevent the user to leave the activity
	 * 
	 * @see com.google.gwt.activity.shared.Activity#mayStop()
	 */
	@Override
	public String mayStop() {
		return null;
	}

	/**
	 * Override this no-op when the activity involves a cancellable callback
	 * 
	 * @see com.google.gwt.activity.shared.Activity#onCancel()
	 */
	@Override
	public void onCancel() {
	}
}