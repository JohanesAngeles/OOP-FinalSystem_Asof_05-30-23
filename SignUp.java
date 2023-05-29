import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.*;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class SignUp extends JFrame {

	JFrame signupframe;
	private JTextField fullname;
	private JTextField adresstextfield;
	private JTextField emailtxtfield;
	private JPasswordField passwordsignin;
	private File file;
	private JTextField contacttextfield;
	private JButton signUpButton;
	private JPanel panel;
	private JLabel PasswordLabel;
	private JLabel EmailLAbel;
	private JLabel ContactsNoLabel;
	private JLabel AddressLabel;
	private JLabel NameLabel;
	private JLabel Logo;
	private JLabel CreateAccountLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.signupframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		signupframe = new JFrame();
		signupframe.setBounds(100, 100, 1250, 600);
		signupframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signupframe.getContentPane().setBackground(new Color(109, 169, 228));
		signupframe.getContentPane().setLayout(null);
		file = new File("user.txt");
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(19, 0, 90)));
		panel.setBounds(45, 26, 451, 509);
		signupframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		Font buttonFont = null;
        try {
        	buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(buttonFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
		signUpButton = new JButton("Sign Up");
		signUpButton.setFont((buttonFont.deriveFont(Font.BOLD, 14)));
		signUpButton.setBackground(new Color(19, 0, 90));
		signUpButton.setForeground(new Color(255, 255, 255));
		signUpButton.setBounds(163, 444, 118, 38);
		panel.add(signUpButton);
		
		Font fieldsFont = null;
        try {
        	fieldsFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(fieldsFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
				passwordsignin = new JPasswordField();
				passwordsignin.setFont((fieldsFont.deriveFont(Font.BOLD, 13)));
				passwordsignin.setBounds(54, 402, 340, 31);
				panel.add(passwordsignin);
				passwordsignin.setBackground(new Color(236, 233, 233));
				passwordsignin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
				
						emailtxtfield = new JTextField();
						emailtxtfield.setFont((fieldsFont.deriveFont(Font.BOLD, 13)));
						emailtxtfield.setBounds(54, 344, 340, 31);
						panel.add(emailtxtfield);
						emailtxtfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
						emailtxtfield.setBackground(new Color(236, 233, 233));
						emailtxtfield.setColumns(10);
						
								contacttextfield = new JTextField();
								contacttextfield.setFont((fieldsFont.deriveFont(Font.BOLD, 13)));
								contacttextfield.setBounds(54, 288, 340, 31);
								panel.add(contacttextfield);
								contacttextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
								contacttextfield.setBackground(new Color(236, 233, 233));
								contacttextfield.setColumns(10);
								
										adresstextfield = new JTextField();
										adresstextfield.setFont((fieldsFont.deriveFont(Font.BOLD, 13)));
										adresstextfield.setBounds(54, 232, 340, 31);
										panel.add(adresstextfield);
										adresstextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
										adresstextfield.setBackground(new Color(236, 233, 233));
										adresstextfield.setColumns(10);
										
												fullname = new JTextField();
												fullname.setFont((fieldsFont.deriveFont(Font.BOLD, 13)));
												fullname.setBounds(54, 177, 340, 31);
												panel.add(fullname);
												fullname.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
												fullname.setBackground(new Color(236, 233, 233));
												fullname.setColumns(10);
												
												
	         Font LabelsFont = null;
			try {
				LabelsFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(LabelsFont);
		    } catch (FontFormatException | IOException e) {
			 e.printStackTrace();
   }								
												PasswordLabel = new JLabel("Password:");
												PasswordLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
												PasswordLabel.setBounds(54, 376, 101, 25);
												panel.add(PasswordLabel);
												
												EmailLAbel = new JLabel("Email: ");
												EmailLAbel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
												EmailLAbel.setBounds(54, 318, 101, 25);
												panel.add(EmailLAbel);
												
												ContactsNoLabel = new JLabel("Contact Number: ");
												ContactsNoLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
												ContactsNoLabel.setBounds(54, 263, 118, 25);
												panel.add(ContactsNoLabel);
												
												AddressLabel = new JLabel("Address");
												AddressLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
												AddressLabel.setBounds(54, 206, 101, 25);
												panel.add(AddressLabel);
												
												NameLabel = new JLabel("Name: ");
												NameLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
												NameLabel.setBounds(54, 152, 101, 25);
												panel.add(NameLabel);
												
												Logo = new JLabel("");
												Logo.setIcon(new ImageIcon(SignUp.class.getResource("/images/pawFileLogo.png")));
												Logo.setBounds(125, 11, 197, 71);
												panel.add(Logo);
												
				Font CreateAcoountLabelFont = null;
				try {
				CreateAcoountLabelFont  = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				ge.registerFont(CreateAcoountLabelFont );
				} catch (FontFormatException | IOException e) {
				e.printStackTrace();
		}								
														
												CreateAccountLabel = new JLabel("Create a new account.");
												CreateAccountLabel.setForeground(new Color(19, 0, 90));
												CreateAccountLabel.setFont((CreateAcoountLabelFont.deriveFont(Font.BOLD, 22)));		
												CreateAccountLabel.setBounds(54, 107, 340, 34);
												panel.add(CreateAccountLabel);
												fullname.addFocusListener(new FocusAdapter() {

													@Override
													public void focusGained(FocusEvent e) {
														if (fullname.getText().equals("Full Name")) {
															fullname.setText("");
														}

													}

													@Override
													public void focusLost(FocusEvent e) {
														if (fullname.getText().equals("")) {
															fullname.setText("Full Name");
														}
													}
												});
										adresstextfield.addFocusListener(new FocusAdapter() {

											@Override
											public void focusGained(FocusEvent e) {
												if (adresstextfield.getText().equals("Adress")) {
													adresstextfield.setText("");
												}

											}

											@Override
											public void focusLost(FocusEvent e) {
												if (adresstextfield.getText().equals("")) {
													adresstextfield.setText("Adress");
												}
											}
										});
								contacttextfield.addFocusListener(new FocusAdapter() {

									@Override
									public void focusGained(FocusEvent e) {
										if (contacttextfield.getText().equals("Contact Number")) {
											contacttextfield.setText("");
										}

									}

									@Override
									public void focusLost(FocusEvent e) {
										if (contacttextfield.getText().equals("")) {
											contacttextfield.setText("Contact Number");
										}
									}
								});
						emailtxtfield.addFocusListener(new FocusAdapter() {

							@Override
							public void focusGained(FocusEvent e) {
								if (emailtxtfield.getText().equals("Email")) {
									emailtxtfield.setText("");
								}

							}

							@Override
							public void focusLost(FocusEvent e) {
								if (emailtxtfield.getText().equals("")) {
									emailtxtfield.setText("Email");
								}
							}
						});
				passwordsignin.addFocusListener(new FocusAdapter() {

					@Override
					public void focusGained(FocusEvent e) {
						if (passwordsignin.getText().equals("Password")) {
							passwordsignin.setText("");
						}

					}

					@Override
					public void focusLost(FocusEvent e) {
						if (passwordsignin.getText().equals("")) {
							passwordsignin.setText("Password");
						}
					}
				});
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Email = emailtxtfield.getText();
				String password = new String(passwordsignin.getPassword());

				if (Email.isEmpty() || password.isEmpty() || password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Registration Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						FileWriter writer = new FileWriter(file, true);
						writer.write(Email + ":" + password + "\n");
						writer.close();
						JOptionPane.showMessageDialog(null, "Registration successful.", "Registration Success",
								JOptionPane.INFORMATION_MESSAGE);
						LogIn window = new LogIn();
						window.loginframe.setVisible(true);
						signupframe.dispose();

					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "Error registering user.", "Registration Error",
								JOptionPane.ERROR_MESSAGE);

					}
				}
			}
				
		
		});

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true));
			writer.write(fullname + "," + adresstextfield + "," + contacttextfield + "," + emailtxtfield + ","
					+ passwordsignin + "\n");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error saving user data.");
		}
	}
}
