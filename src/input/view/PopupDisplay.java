package input.view;

import javax.swing.JOptionPane;
/**
 * this class provides popups for input and output.
 * @author cand3952
 *
 */

public class PopupDisplay
{
	/**
	 * Makes a popup that asks something for a text answer.
	 * Returns user's response as a String.
	 * @param input The supplied question for the popup.
	 * @return The user's answer for the question.
	 */

	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	/**
	 *
	 * @param input
	 */
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
