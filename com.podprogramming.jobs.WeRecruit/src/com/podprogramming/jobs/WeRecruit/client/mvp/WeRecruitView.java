package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * A view which implements the IWeRecruitActivity.IWeRecruitView interface in
 * order to be managed by the WeRecruitActivity
 */
public class WeRecruitView extends Composite implements
		IWeRecruitActivity.IWeRecruitView {

	private final Label combinationLabel;
	private final CheckBox item1;
	private final CheckBox item2;
	private final CheckBox item3;
	private final CheckBox item4;
	private final CheckBox item5;
	private final CheckBox item6;
	private final CheckBox item7;
	private final CheckBox item8;
	private final CheckBox item9;
	private final CheckBox item10;
	private final CheckBox item11;

	public WeRecruitView() {
		VerticalPanel viewContainer = new VerticalPanel();
		viewContainer.setStylePrimaryName( "weRecruitView-main" );

		// the first selectable item
		item1 = new CheckBox();
		item1.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item1 );

		// the second selectable item
		item2 = new CheckBox();
		item2.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item2 );
		
		// the first selectable item
		item3 = new CheckBox();
		item3.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item3 );

		// the second selectable item
		item4 = new CheckBox();
		item4.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item4 );
		
		// the first selectable item
		item5 = new CheckBox();
		item5.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item5 );

		// the second selectable item
		item6 = new CheckBox();
		item6.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item6 );
		
		// the first selectable item
		item7 = new CheckBox();
		item7.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item7 );

		// the second selectable item
		item8 = new CheckBox();
		item8.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item8 );
		
		// the first selectable item
		item9 = new CheckBox();
		item9.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item9 );

		// the second selectable item
		item10 = new CheckBox();
		item10.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item10 );
		
		// the first selectable item
		item11 = new CheckBox();
		item11.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item11 );
		
		// the label where the information is combined
		combinationLabel = new Label();
		combinationLabel.setStylePrimaryName( "weRecruitView-combination" );
		viewContainer.add( combinationLabel );

		// defines the container as the composite widget
		initWidget( viewContainer );
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#reset()
	 */
	@Override
	public void reset() {
		// clears the combination label
		combinationHasText().setText( "" );

		// clears the selection widgets
		item1HasText().setText( "" );
		item1HasValue().setValue( false );

		item2HasText().setText( "" );
		item2HasValue().setValue( false );
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#combinationHasText()
	 */
	@Override
	public HasText combinationHasText() {
		return combinationLabel;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item1HasText()
	 */
	@Override
	public HasText item1HasText() {
		return item1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item1HasValue()
	 */
	@Override
	public HasValue<Boolean> item1HasValue() {
		return item1;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item2HasText()
	 */
	@Override
	public HasText item2HasText() {
		return item2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item2HasValue()
	 */
	@Override
	public HasValue<Boolean> item2HasValue() {
		return item2;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item3HasText()
	 */
	@Override
	public HasText item3HasText() {
		return item3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item3HasValue()
	 */
	@Override
	public HasValue<Boolean> item3HasValue() {
		return item3;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item4HasText()
	 */
	@Override
	public HasText item4HasText() {
		return item4;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item4HasValue()
	 */
	@Override
	public HasValue<Boolean> item4HasValue() {
		return item4;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item5HasText()
	 */
	@Override
	public HasText item5HasText() {
		return item5;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item5HasValue()
	 */
	@Override
	public HasValue<Boolean> item5HasValue() {
		return item5;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item6HasText()
	 */
	@Override
	public HasText item6HasText() {
		return item6;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item6HasValue()
	 */
	@Override
	public HasValue<Boolean> item6HasValue() {
		return item6;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item7HasText()
	 */
	@Override
	public HasText item7HasText() {
		return item7;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item7HasValue()
	 */
	@Override
	public HasValue<Boolean> item7HasValue() {
		return item7;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item8HasText()
	 */
	@Override
	public HasText item8HasText() {
		return item8;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item8HasValue()
	 */
	@Override
	public HasValue<Boolean> item8HasValue() {
		return item8;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item9HasText()
	 */
	@Override
	public HasText item9HasText() {
		return item9;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item9HasValue()
	 */
	@Override
	public HasValue<Boolean> item9HasValue() {
		return item9;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item10HasText()
	 */
	@Override
	public HasText item10HasText() {
		return item10;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item10HasValue()
	 */
	@Override
	public HasValue<Boolean> item10HasValue() {
		return item10;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item11HasText()
	 */
	@Override
	public HasText item11HasText() {
		return item11;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item11HasValue()
	 */
	@Override
	public HasValue<Boolean> item11HasValue() {
		return item11;
	}
}