import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WWMillionär {

	private JFrame frame;
	private CardLayout cLay = new CardLayout();
	private FragenSpeicher speicher = new FragenSpeicher();
	private int wFrage = 0;
	private ArrayList<String> FragenListe = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WWMillionär window = new WWMillionär();
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
	public WWMillionär() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setLayout(cLay);
		frame.setBounds(100, 100, 817, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(cLay);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 884, 545);
		cLay.show(frame.getContentPane(),"panel");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wer Wird ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 60));
		lblNewLabel.setBounds(105, 40, 590, 74);
		panel.add(lblNewLabel);
		
		JLabel lblMillionr = new JLabel("Millionär?");
		lblMillionr.setHorizontalAlignment(SwingConstants.CENTER);
		lblMillionr.setForeground(Color.WHITE);
		lblMillionr.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 60));
		lblMillionr.setBounds(103, 150, 590, 78);
		panel.add(lblMillionr);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 801, 523);
		panel_1.setLayout(null);
		
		JButton startButton = new JButton("");
		startButton.setIcon(new ImageIcon("C:\\Users\\jason\\OneDrive\\Desktop\\StartButton2.png"));
		startButton.setFocusPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.setBounds(327, 250, 118, 65);
		panel.add(startButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jason\\OneDrive\\Desktop\\EclipseBild.jpg"));
		lblNewLabel_1.setBounds(0, 0, 808, 532);
		panel.add(lblNewLabel_1);
		
		JButton btnAntwort1 = new JButton("Antwort1");
		btnAntwort1.setOpaque(true);
		btnAntwort1.setBounds(30, 249, 308, 62);
		panel_1.add(btnAntwort1);
		
		JButton btnAntwort2 = new JButton("Antwort2");
		btnAntwort2.setBounds(465, 249, 308, 62);
		panel_1.add(btnAntwort2);
		
		JButton btnAntwort3 = new JButton("Antwort3");
		btnAntwort3.setBounds(30, 405, 308, 62);
		panel_1.add(btnAntwort3);
		
		JButton btnAntwort4 = new JButton("Antwort4");
		btnAntwort4.setBounds(465, 405, 308, 62);
		panel_1.add(btnAntwort4);
		
		panel_1.setOpaque(true);
		
		JLabel lblFrage = new JLabel("Frage");
		lblFrage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrage.setBounds(168, 47, 446, 84);
		panel_1.add(lblFrage);
		
		frame.getContentPane().add(panel, "StartPanel");
		frame.getContentPane().add(panel_1, "GamePanel");
		
		JLabel lblFrageAnzeige = new JLabel("Frage: 0");
		lblFrageAnzeige.setBounds(692, 11, 99, 44);
		panel_1.add(lblFrageAnzeige);
		
		btnAntwort1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(speicher.GetRichtigeAntwort() == 1) {
					btnAntwort1.setBackground(Color.green);
					wFrage++;
					lblFrageAnzeige.setText("Frage: " + wFrage);
					frame.repaint();
					frame.revalidate();
					
				}else {
					btnAntwort1.setBackground(Color.red);
					frame.repaint();
					frame.revalidate();
					Verloren();
				}
				javax.swing.Timer timer = new javax.swing.Timer(1000, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						 btnAntwort1.setBackground(Color.WHITE);
			             Frage(lblFrage, btnAntwort1, btnAntwort2, btnAntwort3, btnAntwort4);
					}
					
				});
				timer.setRepeats(false);
				timer.start();
			}
			
		});
		
		btnAntwort2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(speicher.GetRichtigeAntwort() == 2) {
					btnAntwort2.setBackground(Color.green);
					frame.repaint();
					frame.revalidate();
					wFrage++;
					lblFrageAnzeige.setText("Frage: " + wFrage);
					
				}else {
					btnAntwort2.setBackground(Color.red);
					frame.repaint();
					frame.revalidate();
					Verloren();
				}
				javax.swing.Timer timer = new javax.swing.Timer(1000, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						 btnAntwort2.setBackground(Color.WHITE);
			             Frage(lblFrage, btnAntwort1, btnAntwort2, btnAntwort3, btnAntwort4);
					}
					
				});
				timer.setRepeats(false);
				timer.start();
			}
			
		});
		
		btnAntwort3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(speicher.GetRichtigeAntwort() == 3) {
					btnAntwort3.setBackground(Color.green);
					frame.repaint();
					frame.revalidate();
					wFrage++;
					lblFrageAnzeige.setText("Frage: " + wFrage);
					
				}else {
					btnAntwort3.setBackground(Color.red);
					frame.repaint();
					frame.revalidate();
					Verloren();
				}
				javax.swing.Timer timer = new javax.swing.Timer(1000, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						 btnAntwort3.setBackground(Color.WHITE);
			             Frage(lblFrage, btnAntwort1, btnAntwort2, btnAntwort3, btnAntwort4);
					}
					
				});
				timer.setRepeats(false);
				timer.start();
			}
			
		});
		
		btnAntwort4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(speicher.GetRichtigeAntwort() == 4) {
					btnAntwort4.setBackground(Color.green);
					frame.repaint();
					frame.revalidate();
					wFrage++;
					lblFrageAnzeige.setText("Frage: " + wFrage);
					
				}else {
					btnAntwort4.setBackground(Color.red);
					frame.repaint();
					frame.revalidate();
					Verloren();
				}
				javax.swing.Timer timer = new javax.swing.Timer(1000, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						 btnAntwort4.setBackground(Color.WHITE);
			             Frage(lblFrage, btnAntwort1, btnAntwort2, btnAntwort3, btnAntwort4);
					}
					
				});
				timer.setRepeats(false);
				timer.start();
			}
			
		});
		
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cLay.show(frame.getContentPane(),"GamePanel");
				Frage(lblFrage,btnAntwort1,btnAntwort2,btnAntwort3,btnAntwort4);
			}
			
		});
		cLay.show(frame.getContentPane(), "StartPanel");
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "name_6422625472400");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Verloren!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(188, 11, 407, 118);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNochmal = new JButton("Nochmal");
		btnNochmal.setBounds(316, 209, 172, 52);
		btnNochmal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frage(lblFrage,btnAntwort1,btnAntwort2,btnAntwort3,btnAntwort4);
				cLay.show(frame.getContentPane(), "GamePanel");
			}
			
		});
		panel_2.add(btnNochmal);
		
		JButton btnMenu = new JButton("Zurück zum Menü");
		btnMenu.setBounds(316, 289, 172, 52);
		btnMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 cLay.show(frame.getContentPane(), "StartPanel");
			}
			
		});
		panel_2.add(btnMenu);
		frame.getContentPane().add(panel_2, "Verloren");
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "name_7557851226000");
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Gewonnen!");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel_2_1.setBounds(186, 33, 407, 118);
		panel_3.add(lblNewLabel_2_1);
		
		JButton btnNochmal_1 = new JButton("Nochmal");
		btnNochmal_1.setBounds(329, 239, 172, 52);
		btnNochmal_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frage(lblFrage,btnAntwort1,btnAntwort2,btnAntwort3,btnAntwort4);
				cLay.show(frame.getContentPane(), "GamePanel");
			}
			
		});
		panel_3.add(btnNochmal_1);
		
		JButton btnMenu_1 = new JButton("Zurück zum Menü");
		btnMenu_1.setBounds(332, 305, 172, 52);
		panel_3.add(btnMenu_1);
		frame.getContentPane().add(panel_3, "Gewonnen");
		frame.repaint();
		frame.revalidate();
		
	}
	
	public void Verloren() {
		wFrage = 0;
		cLay.show(frame.getContentPane(), "Verloren");
	}
	
	public void Gewonnen() {
		wFrage = 0;
		cLay.show(frame.getContentPane(), "Gewonnen");
	}
	
	public void Frage(JLabel lblFrage, JButton btnAntwort1, JButton btnAntwort2, JButton btnAntwort3, JButton btnAntwort4) {
		if(wFrage >= 15) {
			Gewonnen();
		}else {
			String frage = speicher.GetFrage();
			FragenListe.add(frage);
			for(int i = 0; i < FragenListe.size(); i++) {
				if(FragenListe.get(i) == frage) {
					frage = speicher.GetFrage();
				}
			}
			lblFrage.setText(frage);
			btnAntwort1.setText(speicher.GetAntwort1());
			btnAntwort2.setText(speicher.GetAntwort2());
			btnAntwort3.setText(speicher.GetAntwort3());
			btnAntwort4.setText(speicher.GetAntwort4());
		}
	}
	
	private void FragenCheck() {
		
	}
}