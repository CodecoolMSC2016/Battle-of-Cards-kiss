package cardgame;

import java.awt.EventQueue;

import javax.swing.JFrame;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class StartGame {

	private JFrame frame;
	private JLabel lblGivePlayersName;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private String name1;
	private String name2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGame window = new StartGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartGame(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
	}
	
	public StartGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		lblGivePlayersName = new JLabel("Give players name ");
		lblGivePlayersName.setHorizontalAlignment(SwingConstants.CENTER);
		lblGivePlayersName.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblGivePlayersName.setBounds(10, 43, 414, 38);
		frame.getContentPane().add(lblGivePlayersName);
		
		textField = new JTextField();
		textField.setBounds(176, 92, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		name1 = textField.getText();
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 123, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel(" ");
		lblNewLabel.setBounds(288, 95, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setBounds(288, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Start game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gui gui = new Gui(textField.getText(), textField_1.getText());
				gui.Gui();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(112, 209, 216, 28);
		frame.getContentPane().add(btnNewButton);
		
	}
	public String getPlayer1Name (){
		return name1;
	}
	
	public String getPlayer2Name (){
		return name2;
	}
	
	
}