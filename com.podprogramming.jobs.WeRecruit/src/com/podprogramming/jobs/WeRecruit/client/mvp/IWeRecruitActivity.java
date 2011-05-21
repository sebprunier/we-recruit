package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.IsWidget;

/**
 * An activity which manages an instance of IWeRecruitView
 */
public interface IWeRecruitActivity<V extends IWeRecruitActivity.IWeRecruitView> {
	/**
	 * Updates the combination label according to the items selected in the view
	 */
	public void updateCombinationLabel();

	/**
	 * A view that implements this interface can be handled by an
	 * IWeRecruitActivity
	 */
	public interface IWeRecruitView extends IsWidget {

		/**
		 * Clears the view of all displayed information and unchecks the
		 * checkable widgets
		 */
		public void reset();

		/**
		 * Returns the combination widget as an instance of HasText
		 * 
		 * @return
		 */
		public HasText combinationHasText();

		/**
		 * Returns the label of the 1st selection widget
		 * 
		 * @return
		 */
		public HasText item1HasText();

		/**
		 * Returns the boolean holder of the 1st selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item1HasValue();

		/**
		 * Returns the label of the 2nd selection widget
		 * 
		 * @return
		 */
		public HasText item2HasText();

		/**
		 * Returns the boolean holder of the 2nd selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item2HasValue();
		
		/**
		 * Returns the label of the 3rd selection widget
		 * 
		 * @return
		 */
		public HasText item3HasText();

		/**
		 * Returns the boolean holder of the 3rd selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item3HasValue();

		/**
		 * Returns the label of the 4th selection widget
		 * 
		 * @return
		 */
		public HasText item4HasText();

		/**
		 * Returns the boolean holder of the 4th selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item4HasValue();
		
		/**
		 * Returns the label of the 5th selection widget
		 * 
		 * @return
		 */
		public HasText item5HasText();

		/**
		 * Returns the boolean holder of the 5th selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item5HasValue();

		/**
		 * Returns the label of the 6th selection widget
		 * 
		 * @return
		 */
		public HasText item6HasText();

		/**
		 * Returns the boolean holder of the 6th selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item6HasValue();
		
		/**
		 * Returns the label of the 7th selection widget
		 * 
		 * @return
		 */
		public HasText item7HasText();

		/**
		 * Returns the boolean holder of the 7th selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item7HasValue();

		/**
		 * Returns the label of the 8th selection widget
		 * 
		 * @return
		 */
		public HasText item8HasText();

		/**
		 * Returns the boolean holder of the 8th selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item8HasValue();
		
		/**
		 * Returns the label of the 9th selection widget
		 * 
		 * @return
		 */
		public HasText item9HasText();

		/**
		 * Returns the boolean holder of the 9th selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item9HasValue();

		/**
		 * Returns the label of the 10th selection widget
		 * 
		 * @return
		 */
		public HasText item10HasText();

		/**
		 * Returns the boolean holder of the 10th selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item10HasValue();
		
		/**
		 * Returns the label of the 11th selection widget
		 * 
		 * @return
		 */
		public HasText item11HasText();

		/**
		 * Returns the boolean holder of the 11th selection widget
		 * 
		 * @return
		 */
		public HasValue<Boolean> item11HasValue();
	}
}