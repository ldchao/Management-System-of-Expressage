package nju.edu.presentation.general_managerui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class ApproveListInformation extends JFrame {
	private JPanel contentPane;
	private int row;
	/**
	 * Create the frame.
	 * @param rowpos 
	 */
	public ApproveListInformation(String information, int rowpos) {
		this.row=rowpos;
		setBounds(100, 500, 188, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 179, 125);
		textArea.setText(information);
		contentPane.add(textArea);
		setVisible(true);
		
	}

	public int getrows() {
		return this.row;
	}
}
