package com.podprogramming.jobs.WeRecruit.client.mvp;

import com.google.gwt.user.client.ui.HasHTML;
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
		public HasHTML mailToHasHTML();

		/**
		 * 
		 */
		public HasText q1Answer1HasText();
		
		/**
		 * 
		 */
		public HasValue<Boolean> q1Answer1HasValue();
		
		/**
		 * 
		 */
		public HasText q1Answer2HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q1Answer2HasValue();
		
		/**
		 * 
		 */
		public HasText q1Answer3HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q1Answer3HasValue();
		
		/**
		 * 
		 */
		public HasText q2Answer1HasText();
		
		/**
		 * 
		 */
		public HasValue<Boolean> q2Answer1HasValue();
		
		/**
		 * 
		 */
		public HasText q2Answer2HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q2Answer2HasValue();
		
		/**
		 * 
		 */
		public HasText q2Answer3HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q2Answer3HasValue();
		
		/**
		 * 
		 */
		public HasText q3Answer1HasText();
		
		/**
		 * 
		 */
		public HasValue<Boolean> q3Answer1HasValue();
		
		/**
		 * 
		 */
		public HasText q3Answer2HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q3Answer2HasValue();
		
		/**
		 * 
		 */
		public HasText q3Answer3HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q3Answer3HasValue();
		
		/**
		 * 
		 */
		public HasText q4Answer1HasText();
		
		/**
		 * 
		 */
		public HasValue<Boolean> q4Answer1HasValue();
		
		/**
		 * 
		 */
		public HasText q4Answer2HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q4Answer2HasValue();
		
		/**
		 * 
		 */
		public HasText q4Answer3HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q4Answer3HasValue();
		
		/**
		 * 
		 */
		public HasText q5Answer1HasText();
		
		/**
		 * 
		 */
		public HasValue<Boolean> q5Answer1HasValue();
		
		/**
		 * 
		 */
		public HasText q5Answer2HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q5Answer2HasValue();
		
		/**
		 * 
		 */
		public HasText q5Answer3HasText();
		/**
		 * 
		 */
		public HasValue<Boolean> q5Answer3HasValue();
	}
}