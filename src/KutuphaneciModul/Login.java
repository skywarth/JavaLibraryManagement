package KutuphaneciModul;
import siniflar.Librarian;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import siniflar.Admin;
import siniflar.Librarian;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoginKAdi;
	private JPasswordField txtLoginParola;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKulla = new JLabel("K\u00FCt\u00FCphaneci Giri\u015F");
		lblKulla.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKulla.setBounds(99, 22, 124, 38);
		contentPane.add(lblKulla);
		
		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblKullancAd.setBounds(20, 81, 86, 14);
		contentPane.add(lblKullancAd);
		
		txtLoginKAdi = new JTextField();
		txtLoginKAdi.setBounds(116, 78, 162, 20);
		contentPane.add(txtLoginKAdi);
		txtLoginKAdi.setColumns(10);
		
		JLabel lblParola = new JLabel("Parola :");
		lblParola.setBounds(20, 111, 46, 14);
		contentPane.add(lblParola);
		
		txtLoginParola = new JPasswordField();
		txtLoginParola.setBounds(116, 108, 162, 20);
		contentPane.add(txtLoginParola);
		
		JButton btnGiri = new JButton("Giri\u015F");
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Librarian giris=new Librarian();
				giris.Login(txtLoginKAdi.getText(),txtLoginParola.getText());
				dispose();
			
			}
		});
		btnGiri.setBounds(80, 165, 89, 23);
		contentPane.add(btnGiri);
		
		JButton btnk = new JButton("\u00C7\u0131k\u0131\u015F");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnk.setBounds(204, 165, 89, 23);
		contentPane.add(btnk);
	}

}
