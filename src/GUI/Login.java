
package GUI;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	public JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;

	public Login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Change this line to EXIT_ON_CLOSE
		frame.setTitle("Banking System");
		frame.getContentPane().setLayout(null); // Set layout to null for custom placement

		// Set background color to black
		frame.getContentPane().setBackground(Color.BLACK);

		JLabel label = new JLabel("Banking System");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setForeground(Color.WHITE); // Set text color to white
		label.setBounds(147, 11, 151, 41);
		frame.getContentPane().add(label);

		JLabel lblLoginScreen = new JLabel("Login Screen");
		lblLoginScreen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLoginScreen.setForeground(Color.WHITE); // Set text color to white
		lblLoginScreen.setBounds(170, 63, 101, 23);
		frame.getContentPane().add(lblLoginScreen);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsername.setForeground(Color.WHITE); // Set text color to white
		lblUsername.setBounds(55, 119, 64, 23);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setForeground(Color.WHITE); // Set text color to white
		lblPassword.setBounds(55, 159, 64, 23);
		frame.getContentPane().add(lblPassword);

		textField = new JTextField();
		textField.setBounds(130, 121, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("admin");

		textField_1 = new JPasswordField();
		textField_1.setBounds(130, 161, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("admin");
				String user = "admin";
				String pass = textField_1.getText();
				if (user.equals("admin") && pass.equals("admin")) {
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
					frame.setVisible(false);
					GUIForm.menu.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Failed");
				}
			}
		});
		btnLogin.setBounds(260, 138, 89, 23);
		frame.getContentPane().add(btnLogin);

		// Show the frame
		frame.setVisible(true);
	}
}
