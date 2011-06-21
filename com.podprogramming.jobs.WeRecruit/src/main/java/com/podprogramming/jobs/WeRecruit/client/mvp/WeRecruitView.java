package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;

/**
 * A view which implements the IWeRecruitActivity.IWeRecruitView interface in
 * order to be managed by the WeRecruitActivity
 */
public class WeRecruitView extends Composite implements IWeRecruitActivity.IWeRecruitView {

	
	protected static WeRecruitView2UiBinder uiBinder = GWT.create(WeRecruitView2UiBinder.class);

	interface WeRecruitView2UiBinder extends UiBinder<Widget, WeRecruitView> {
	}
	
	@UiField
	protected HTML mailTo;

	@UiField
	protected RadioButton q1Answer1;
	@UiField
	protected RadioButton q1Answer2;
	@UiField
	protected RadioButton q1Answer3;
	
	@UiField
	protected RadioButton q2Answer1;
	@UiField
	protected RadioButton q2Answer2;
	@UiField
	protected RadioButton q2Answer3;
	
	@UiField
	protected RadioButton q3Answer1;
	@UiField
	protected RadioButton q3Answer2;
	@UiField
	protected RadioButton q3Answer3;
	
	@UiField
	protected RadioButton q4Answer1;
	@UiField
	protected RadioButton q4Answer2;
	@UiField
	protected RadioButton q4Answer3;
	
	@UiField
	protected RadioButton q5Answer1;
	@UiField
	protected RadioButton q5Answer2;
	@UiField
	protected RadioButton q5Answer3;
	
	public WeRecruitView() {
		initWidget(uiBinder.createAndBindUi(this));
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
	
	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q5Answer1HasText()
	 */
	@Override
	public HasText q5Answer1HasText() {
		return q5Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q5Answer1HasValue()
	 */
	@Override
	public HasValue<Boolean> q5Answer1HasValue() {
		return q5Answer1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q5Answer2HasText()
	 */
	@Override
	public HasText q5Answer2HasText() {
		return q5Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q5Answer2HasValue()
	 */
	@Override
	public HasValue<Boolean> q5Answer2HasValue() {
		return q5Answer2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q5Answer3HasText()
	 */
	@Override
	public HasText q5Answer3HasText() {
		return q5Answer3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#q5Answer3HasValue()
	 */
	@Override
	public HasValue<Boolean> q5Answer3HasValue() {
		return q5Answer3;
	}
}