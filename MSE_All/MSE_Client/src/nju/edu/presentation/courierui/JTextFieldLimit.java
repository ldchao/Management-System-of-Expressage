package nju.edu.presentation.courierui;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//limit the number of word that can be input into the textfield
@SuppressWarnings("serial")
public class JTextFieldLimit extends PlainDocument {
	private int limit;
	@SuppressWarnings("unused")
	private boolean toUppercase = false;

	public JTextFieldLimit(int limit) {
		super();
		this.limit = limit;
	}

	public void insertString(int offset, String str, AttributeSet attr)
			throws BadLocationException {
		if (str == null)
			return;

		if ((getLength() + str.length()) <= limit) {
			super.insertString(offset, str, attr);
		}
	}
}
