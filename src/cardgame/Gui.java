package cardgame;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.awt.Font;
import java.awt.Color;

public class Gui extends JFrame {


		
	public void Gui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui(Player1name, Player2name);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JPanel contentPane;
	String Player1name;
	String Player2name;
	Player p1 = new Player();
	Player p2 = new Player();
	int round = 0;
	Integer rounds = 0;
	private JTextField textField;
	private String finalwinner;

	public Gui(String winner){
		this.finalwinner = winner;
	}

	/**
	 * @wbp.parser.constructor
	 */
	public Gui(String name1, String name2) {
		this.Player1name = name1;
		this.Player2name = name2;
		initialize();

		
	}
	public void initialize() {
		Dealer dealer = new Dealer(p1, p2);
		dealer.deal();
		
		Game game = new Game(p1, p2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel player1cardback = new JLabel("");
		player1cardback.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				player1cardback.setVisible(false);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				player1cardback.setVisible(true);
			}
		});
		
		JLabel player2cardback = new JLabel("");
		player2cardback.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				player2cardback.setVisible(false);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				player2cardback.setVisible(true);
			}
		});
		player2cardback.setIcon(new ImageIcon("/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/cardbackfinal.jpg"));
		player2cardback.setBounds(447, 111, 205, 335);
		contentPane.add(player2cardback);
		player1cardback.setIcon(new ImageIcon("/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/cardbackfinal.jpg"));
		player1cardback.setBounds(6, 111, 220, 335);
		contentPane.add(player1cardback);
		
		JLabel player1name = new JLabel("Player1 name");
		player1name.setFont(new Font("Tahoma", Font.BOLD, 13));
		player1name.setBounds(10, 59, 165, 14);
		contentPane.add(player1name);
		player1name.setText(Player1name);
		
		JLabel player2name = new JLabel("Player2 name");
		player2name.setFont(new Font("Tahoma", Font.BOLD, 13));
		player2name.setHorizontalAlignment(SwingConstants.RIGHT);
		player2name.setBounds(521, 60, 131, 14);
		contentPane.add(player2name);
		player2name.setText(Player2name);
		
		JLabel player1currentcard = new JLabel("current");
		player1currentcard.setBounds(10, 111, 165, 14);
		contentPane.add(player1currentcard);
		player1currentcard.setVisible(false);
		
		JLabel player2currentcard = new JLabel("current");
		player2currentcard.setHorizontalAlignment(SwingConstants.RIGHT);
		player2currentcard.setBounds(521, 111, 131, 14);
		contentPane.add(player2currentcard);
		player2currentcard.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(305, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		JLabel lblTurn = new JLabel("Choose player to start");
		lblTurn.setForeground(new Color(204, 0, 0));
		lblTurn.setFont(new Font("Stencil", Font.BOLD, 26));
		lblTurn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurn.setBounds(145, 37, 399, 36);
		contentPane.add(lblTurn);
		
		JLabel lblSelected = new JLabel("selected");
		lblSelected.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelected.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelected.setBounds(177, 335, 319, 23);
		contentPane.add(lblSelected);
		
		JLabel lblWinner = new JLabel("winner");
		lblWinner.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setBounds(177, 388, 319, 31);
		contentPane.add(lblWinner);
		
		JLabel palyer1score = new JLabel("Score1");
		palyer1score.setFont(new Font("Tahoma", Font.BOLD, 11));
		palyer1score.setBounds(10, 86, 110, 14);
		contentPane.add(palyer1score);
		
		JLabel palyer2score = new JLabel("Score2");
		palyer2score.setFont(new Font("Tahoma", Font.BOLD, 11));
		palyer2score.setHorizontalAlignment(SwingConstants.RIGHT);
		palyer2score.setBounds(554, 86, 98, 14);
		contentPane.add(palyer2score);
		
		JLabel player1cards = new JLabel("");
		player1cards.setBounds(10, 109, 205, 344);
		contentPane.add(player1cards);
		BufferedImage imgp1 = null;
	
		try {
			imgp1 = ImageIO.read(new File(p1.handOfPlayer.get(round).imageLink));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ImageIcon icon = new ImageIcon(imgp1);
		player1cards.setIcon(icon);
	
		
		JButton btnTopspeed = new JButton("topSpeed");
		btnTopspeed.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTopspeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("S");
				lblSelected.setText("You have choosed topspeed!");
			}
		});
		
		JLabel player2cards = new JLabel("");
		player2cards.setBounds(447, 109, 205, 344);
		contentPane.add(player2cards);
		btnTopspeed.setBounds(225, 126, 212, 20);
		contentPane.add(btnTopspeed);
		BufferedImage imgp2 = null;
		
		try {
			imgp2 = ImageIO.read(new File(p2.handOfPlayer.get(0).imageLink));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ImageIcon icon1 = new ImageIcon(imgp2);
		player2cards.setIcon(icon1);
		
		JButton btnWeight = new JButton("weight");
		btnWeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("W");
				lblSelected.setText("You have choosed weight!");
			}
		});
		btnWeight.setBounds(225, 160, 212, 23);
		contentPane.add(btnWeight);
		
		JButton btnAcceleration = new JButton("acceleration");
		btnAcceleration.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAcceleration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("A");
				lblSelected.setText("You have choosed acceleration!");
			}
		});
		btnAcceleration.setBounds(225, 194, 212, 20);
		contentPane.add(btnAcceleration);
		
		JButton btnCylinder = new JButton("cylinder");
		btnCylinder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCylinder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("C");
				lblSelected.setText("You have choosed cylinder!");
			}
		});
		btnCylinder.setBounds(225, 228, 212, 23);
		contentPane.add(btnCylinder);
		
		JButton btnDisplacement = new JButton("displacement");
		btnDisplacement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDisplacement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("D");
				lblSelected.setText("You have choosed displacement!");
			}
		});
		btnDisplacement.setBounds(225, 261, 212, 20);
		contentPane.add(btnDisplacement);
		
		
		JButton btnNextRound = new JButton("next round");
		btnNextRound.setForeground(new Color(204, 0, 0));
		btnNextRound.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNextRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1currentcard.setText(p1.handOfPlayer.get(round).name().toString());
				BufferedImage imgp1 = null;
				BufferedImage imgp2 = null;
				
				try {
					if (rounds.equals(15)){
						imgp1 = ImageIO.read(new File(p1.handOfPlayer.get(round).imageLink));
						imgp2 = ImageIO.read(new File(p2.handOfPlayer.get(round).imageLink));
					} if(!rounds.equals(15)) {
					imgp1 = ImageIO.read(new File(p1.handOfPlayer.get(round+1).imageLink));
					imgp2 = ImageIO.read(new File(p2.handOfPlayer.get(round+1).imageLink));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				ImageIcon icon = new ImageIcon(imgp1);
				ImageIcon icon1 = new ImageIcon(imgp2);
				player1cards.setIcon(icon);
				player2cards.setIcon(icon1);
				player2currentcard.setText(p2.handOfPlayer.get(round).name().toString());
				round ++;
				textField.getText();
				game.createComparatorMap();
				String winner = game.oneRound(textField.getText(),rounds);
				if (winner.equals("player1")){
					winner = "Round won by " + Player1name;
					lblTurn.setText(Player1name + "'s turn");
				}
				if (winner.equals("player2")){
					winner = "Round won by " + Player2name;
					lblTurn.setText(Player2name + "'s turn");
				}
				if(winner.equals("Tie")){
					winner = "It's a tie";
					lblTurn.setText("You can choose your turn!");
				}
				lblWinner.setText(winner);
				Integer player1Score = p1.getScore();
				palyer1score.setText("Score: " + player1Score.toString());
				Integer player2Score = p2.getScore();
				palyer2score.setText("Score: " + player2Score.toString());
				rounds++;
				if (rounds.equals(16)){
					btnNextRound.setEnabled(false);
					if (player1Score > player2Score){
						finalwinner = Player1name;
					}if (player2Score >player1Score){
						finalwinner = Player2name;
					}
					
					EndGame endgame = new EndGame(finalwinner);
					endgame.EndGame();					
				}

			}
		});
		
		btnNextRound.setBounds(225, 430, 212, 36);
		contentPane.add(btnNextRound);
	}
}
