package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * A view which implements the IWeRecruitActivity.IWeRecruitView interface in
 * order to be managed by the WeRecruitActivity
 */
public class WeRecruitView extends Composite implements
		IWeRecruitActivity.IWeRecruitView {

	private final HTML mailTo;
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
	private final CheckBox item12;
	private final CheckBox item13;

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
		
		// the third selectable item
		item3 = new CheckBox();
		item3.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item3 );

		// the fourth selectable item
		item4 = new CheckBox();
		item4.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item4 );
		
		// the fifth selectable item
		item5 = new CheckBox();
		item5.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item5 );

		// the sixth selectable item
		item6 = new CheckBox();
		item6.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item6 );
		
		// the seventh selectable item
		item7 = new CheckBox();
		item7.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item7 );

		// the eighth selectable item
		item8 = new CheckBox();
		item8.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item8 );
		
		// the ninth selectable item
		item9 = new CheckBox();
		item9.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item9 );

		// the tenth selectable item
		item10 = new CheckBox();
		item10.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item10 );
		
		// the eleventh selectable item
		item11 = new CheckBox();
		item11.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item11 );
		
		// the 12th selectable item
		item12 = new CheckBox();
		item12.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item12 );
		
		// the 13th selectable item
		item13 = new CheckBox();
		item13.setStylePrimaryName( "weRecruitView-item" );
		viewContainer.add( item13 );
		
		// the label where the information is combined
		mailTo = new HTML();
		mailTo.setStylePrimaryName( "weRecruitView-mailToHTML" );
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
		item1HasText().setText( "" );
		item1HasValue().setValue( false );

		item2HasText().setText( "" );
		item2HasValue().setValue( false );
		
		item3HasText().setText( "" );
		item3HasValue().setValue( false );

		item4HasText().setText( "" );
		item4HasValue().setValue( false );
		
		item5HasText().setText( "" );
		item5HasValue().setValue( false );

		item6HasText().setText( "" );
		item6HasValue().setValue( false );
		
		item7HasText().setText( "" );
		item7HasValue().setValue( false );

		item8HasText().setText( "" );
		item8HasValue().setValue( false );
		
		item9HasText().setText( "" );
		item9HasValue().setValue( false );

		item10HasText().setText( "" );
		item10HasValue().setValue( false );
		
		item11HasText().setText( "" );
		item11HasValue().setValue( false );
		
	}
	
	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#combinationHasText()
	 */
	@Override
	public HasHTML mailToHasHTML() {
		return mailTo;
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

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item12HasText()
	 */
	@Override
	public HasText item12HasText() {
		return item12;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item12HasValue()
	 */
	@Override
	public HasValue<Boolean> item12HasValue() {
		return item12;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item13HasText()
	 */
	@Override
	public HasText item13HasText() {
		return item13;
	}

	/**
	 * @see com.podprogramming.jobs.WeRecruit.client.mvp.IWeRecruitActivity.IWeRecruitView#item13HasValue()
	 */
	@Override
	public HasValue<Boolean> item13HasValue() {
		return item13;
	}
}