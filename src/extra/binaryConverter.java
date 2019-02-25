package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {

	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JTextField answer = new JTextField(20);
	JButton button= new JButton("enter");

	public static void main(String[] args) {
		new binaryConverter().createUI();

	}

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);

		panel.add(answer);

		panel.add(button);
		button.addActionListener(this);
		frame.pack();

	}	

	String convert(String input) {
		if(input.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";    
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			String input= answer.getText();
			String output= convert(input);
			answer.setText(output);
		}
	}

}
