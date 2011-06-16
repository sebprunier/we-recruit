package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;

/**
 * A view which implements the IWeRecruitActivity.IWeRecruitView interface in
 * order to be managed by the WeRecruitActivity
 */
public class WeRecruitView extends Composite implements IWeRecruitActivity.IWeRecruitView {

	private final HTML mailTo;

	private final Label q1;
	private final RadioButton q1Answer1;
	private final RadioButton q1Answer2;
	private final RadioButton q1Answer3;
	
	private final Label q2;
	private final RadioButton q2Answer1;
	private final RadioButton q2Answer2;
	private final RadioButton q2Answer3;
	
	private final Label q3;
	private final RadioButton q3Answer1;
	private final RadioButton q3Answer2;
	private final RadioButton q3Answer3;
	
	private final Label q4;
	private final RadioButton q4Answer1;
	private final RadioButton q4Answer2;
	private final RadioButton q4Answer3;
	
	public WeRecruitView() {
		//VerticalPanel viewContainer = new VerticalPanel();
		FlowPanel viewContainer = new FlowPanel();
		viewContainer.setStylePrimaryName( "weRecruitView-main" );
		
		// Question 1
		q1 = new Label("Quelle annotation existe dans Guice?");
		q1.setStylePrimaryName( "weRecruitView-question" );
		viewContainer.add(q1);
		
		q1Answer1 = new RadioButton("q1", "@Inject");
		q1Answer1.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q1Answer1 );
		
		q1Answer2 = new RadioButton("q1", "@Injection");
		q1Answer2.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q1Answer2 );
		
		q1Answer3 = new RadioButton("q1", "@Deprecated");
		q1Answer3.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q1Answer3 );
		
		// Question 2
		q2 = new Label("SaaS veut dire");
		q2.setStylePrimaryName( "weRecruitView-question" );
		viewContainer.add(q2);
		
		q2Answer1 = new RadioButton("q2", "Software as a Service");
		q2Answer1.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q2Answer1 );
		
		q2Answer2 = new RadioButton("q2", "System as a Service");
		q2Answer2.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q2Answer2 );
		
		q2Answer3 = new RadioButton("q2", "Obiwan Kenobi");
		q2Answer3.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q2Answer3 );
		
		// Question 3
		q3 = new Label("double number = (Double)null;");
		q3.setStylePrimaryName( "weRecruitView-question" );
		viewContainer.add(q3);
		
		q3Answer1 = new RadioButton("q3", "Ne compile pas.");
		q3Answer1.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q3Answer1 );
		
		q3Answer2 = new RadioButton("q3", "Renvoie une NumberFormatException à l'éxécution.");
		q3Answer2.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q3Answer2 );
		
		q3Answer3 = new RadioButton("q3", "Renvoie une NullPointerException à l'exécution.");
		q3Answer3.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q3Answer3 );
		
		// Question 4
		q4 = new Label("GoF signifie :");
		q4.setStylePrimaryName( "weRecruitView-question" );
		viewContainer.add(q4);
		
		q4Answer1 = new RadioButton("q4", "Getter on Field");
		q4Answer1.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q4Answer1 );
		
		q4Answer2 = new RadioButton("q4", "Gang of Four");
		q4Answer2.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q4Answer2 );
		
		q4Answer3 = new RadioButton("q4", "Good old Frame");
		q4Answer3.setStylePrimaryName( "weRecruitView-answer" );
		viewContainer.add( q4Answer3 );
		
		// the label where the information is combined
		mailTo = new HTML();
		mailTo.setStylePrimaryName( "weRecruitView-mail" );
		viewContainer.add( mailTo );

		// defines the container as the composite widget
		initWidget( viewContainer );
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#reset()
	 */
	@Override
	public void reset() {
		// clears the combination label
		mailToHasHTML().setHTML( "" );

		// clears the selection widgets
		
		
	}
	
	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#combinationHasText()
	 */
	@Override
	public HasHTML mailToHasHTML() {
		return mailTo;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q1Answer1HasText()
	 */
	@Override
	public HasText q1Answer1HasText() {
		return q1Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q1Answer1HasValue()
	 */
	@Override
	public HasValue<Boolean> q1Answer1HasValue() {
		return q1Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q1Answer2HasText()
	 */
	@Override
	public HasText q1Answer2HasText() {
		return q1Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q1Answer2HasValue()
	 */
	@Override
	public HasValue<Boolean> q1Answer2HasValue() {
		return q1Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q1Answer3HasText()
	 */
	@Override
	public HasText q1Answer3HasText() {
		return q1Answer3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q1Answer3HasValue()
	 */
	@Override
	public HasValue<Boolean> q1Answer3HasValue() {
		return q1Answer3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q2Answer1HasText()
	 */
	@Override
	public HasText q2Answer1HasText() {
		return q2Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q2Answer1HasValue()
	 */
	@Override
	public HasValue<Boolean> q2Answer1HasValue() {
		return q2Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q2Answer2HasText()
	 */
	@Override
	public HasText q2Answer2HasText() {
		return q2Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q2Answer2HasValue()
	 */
	@Override
	public HasValue<Boolean> q2Answer2HasValue() {
		return q2Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q2Answer3HasText()
	 */
	@Override
	public HasText q2Answer3HasText() {
		return q2Answer3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q2Answer3HasValue()
	 */
	@Override
	public HasValue<Boolean> q2Answer3HasValue() {
		return q2Answer3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q3Answer1HasText()
	 */
	@Override
	public HasText q3Answer1HasText() {
		return q3Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q3Answer1HasValue()
	 */
	@Override
	public HasValue<Boolean> q3Answer1HasValue() {
		return q3Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q3Answer2HasText()
	 */
	@Override
	public HasText q3Answer2HasText() {
		return q3Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q3Answer2HasValue()
	 */
	@Override
	public HasValue<Boolean> q3Answer2HasValue() {
		return q3Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q3Answer3HasText()
	 */
	@Override
	public HasText q3Answer3HasText() {
		return q3Answer3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q3Answer3HasValue()
	 */
	@Override
	public HasValue<Boolean> q3Answer3HasValue() {
		return q3Answer3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q4Answer1HasText()
	 */
	@Override
	public HasText q4Answer1HasText() {
		return q4Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q4Answer1HasValue()
	 */
	@Override
	public HasValue<Boolean> q4Answer1HasValue() {
		return q4Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q4Answer2HasText()
	 */
	@Override
	public HasText q4Answer2HasText() {
		return q4Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q4Answer2HasValue()
	 */
	@Override
	public HasValue<Boolean> q4Answer2HasValue() {
		return q4Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q4Answer3HasText()
	 */
	@Override
	public HasText q4Answer3HasText() {
		return q4Answer3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q4Answer3HasValue()
	 */
	@Override
	public HasValue<Boolean> q4Answer3HasValue() {
		return q4Answer3;
	}
}