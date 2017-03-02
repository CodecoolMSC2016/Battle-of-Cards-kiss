package cardgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class EndGame extends JFrame {


	/**
	 * Launch the application.
	 */
	public void EndGame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndGame frame = new EndGame(finalwinner);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JPanel contentPane;
	private String finalwinner;

	/**
	 * Create the frame.
	 */
	public EndGame(String finalwinner) {
		this.finalwinner = finalwinner;
		initialize();
	}
		
		
		
	public void initialize() {
		
		Gui guiwinner = new Gui(finalwinner);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWinner = new JLabel("The winner is:");
		lblWinner.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setBounds(0, 38, 324, 31);
		contentPane.add(lblWinner);
		
		JLabel lblWinnerplayer = new JLabel("");
		lblWinnerplayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinnerplayer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWinnerplayer.setBounds(10, 80, 314, 54);
		contentPane.add(lblWinnerplayer);
		lblWinnerplayer.setText(finalwinner);
	}
}
