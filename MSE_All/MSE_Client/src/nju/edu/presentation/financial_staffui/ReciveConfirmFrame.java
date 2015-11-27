package nju.edu.presentation.financial_staffui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
@SuppressWarnings("serial")
public class ReciveConfirmFrame extends JFrame {

	/**
	 * Create the panel.
	 */
	public ReciveConfirmFrame(ReceiFormframe frame) {
		
			getContentPane().setLayout(null);

			ReciveConfirmFrame reconframe = this;

			JButton btnNewButton = new JButton("\u662F");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					reconframe.dispose();
					frame.dispose();
				}
			});
			btnNewButton.setBounds(53, 87, 71, 23);
			getContentPane().add(btnNewButton);

			JButton button = new JButton("\u5426");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					reconframe.dispose();
				}
			});
			button.setBounds(154, 87, 71, 23);
			getContentPane().add(button);

			JLabel label = new JLabel("录入的收款单尚未提交审批");
			label.setBounds(65, 26, 160, 23);
			getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u662F\u5426\u7ACB\u5373\u9000\u51FA");
			label_1.setBounds(102, 50, 79, 23);
			getContentPane().add(label_1);

			// frame
			this.setSize(300, 180);
			this.setLocation(400, 100);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
}
