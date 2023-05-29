import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;



import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ownerprofile extends JFrame {
	JFrame ownerframe;

	JLabel nameLabel, phoneLabel, adressLabel;
	
	private ArrayList<String> data;
	private JLabel ProfilePicture;
	private ImageIcon image;
	private JPanel PorfilePicturePanel;
	private JLabel HeaderLine;
	private JLabel Logo;
	private JPanel NamePanel;
	private JPanel PhoneNumberPanel;
	private JPanel addressPanel;
	private JLabel OwnersProfileLabel;
	private JLabel MypetsLabel;
	private JLabel AboutLabel;
	private JLabel ContactUsLabel;
	private JLabel NameLabel;
	private JLabel PhoneNoLAbel;
	private JLabel AddressLabel;
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ownerprofile window = new Ownerprofile();
					window.ownerframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ownerprofile() {

		initialize();
	}

	private void initialize() {
		data = new ArrayList<>();
		ownerframe = new JFrame();
		ownerframe.getContentPane().setBackground(new Color(255, 255, 255));
		ownerframe.setBounds(100, 100, 1250, 633);
		ownerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ownerframe.getContentPane().setLayout(null);
				
				JButton SelectProfilePictureButton = new JButton("");
				SelectProfilePictureButton.setIcon(new ImageIcon(Ownerprofile.class.getResource("/images/SelectProPic.png")));
				SelectProfilePictureButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						
						JFileChooser fileChooser = new JFileChooser();
		                int option = fileChooser.showOpenDialog(Ownerprofile.this);
		                if (option == JFileChooser.APPROVE_OPTION) {
		                    File file = fileChooser.getSelectedFile();
		                    ImageIcon imageIcon = new ImageIcon(file.getPath());
		                    Image image = imageIcon.getImage().getScaledInstance(246, 270, Image.SCALE_SMOOTH);
		                    ProfilePicture.setIcon(new ImageIcon(image));
		                    
		                
		                }
		                
					}
						
						
		
				});
				
				JButton AddOwnnersInformationButton = new JButton("");
				AddOwnnersInformationButton.setIcon(new ImageIcon(Ownerprofile.class.getResource("/images/AddOwnersInfo.png")));
				AddOwnnersInformationButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Ownerinfo ownerinfo = new Ownerinfo();
						ownerinfo.ownerinfoframe.setVisible(true);
						ownerframe.dispose();
						
					}
				});
				AddOwnnersInformationButton.setBounds(74, 522, 266, 36);
				ownerframe.getContentPane().add(AddOwnnersInformationButton);
				SelectProfilePictureButton.setBounds(74, 475, 266, 36);
				ownerframe.getContentPane().add(SelectProfilePictureButton);
		
		PorfilePicturePanel = new JPanel();
		PorfilePicturePanel.setBackground(new Color(19, 0, 90));
		PorfilePicturePanel.setBounds(74, 141, 266, 323);
		ownerframe.getContentPane().add(PorfilePicturePanel);
		PorfilePicturePanel.setLayout(null);
		
		ProfilePicture = new JLabel("");
		ProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		ProfilePicture.setBounds(10, 11, 246, 270);
		PorfilePicturePanel.add(ProfilePicture);
		ProfilePicture.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(109, 169, 255)));
		
		HeaderLine = new JLabel("");
		HeaderLine.setIcon(new ImageIcon(Ownerprofile.class.getResource("/images/headerLine.png")));
		HeaderLine.setHorizontalAlignment(SwingConstants.LEFT);
		HeaderLine.setBounds(28, 91, 1171, 14);
		ownerframe.getContentPane().add(HeaderLine);
		
		Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Ownerprofile.class.getResource("/images/pawFileLogo.png")));
		Logo.setBounds(10, 0, 167, 95);
		ownerframe.getContentPane().add(Logo);
		
		NamePanel = new JPanel();
		NamePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		NamePanel.setBounds(367, 260, 451, 62);
		ownerframe.getContentPane().add(NamePanel);
		NamePanel.setLayout(null);
		        
		Font inputFont = null;
        try {
        	inputFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(inputFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
				nameLabel = new JLabel("");
				nameLabel.setBounds(10, 15, 431, 36);
				NamePanel.add(nameLabel);
				nameLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));
		
		PhoneNumberPanel = new JPanel();
		PhoneNumberPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		PhoneNumberPanel.setBounds(828, 260, 356, 62);
		ownerframe.getContentPane().add(PhoneNumberPanel);
		PhoneNumberPanel.setLayout(null);
		
				phoneLabel = new JLabel("");
				phoneLabel.setBounds(10, 15, 336, 36);
				PhoneNumberPanel.add(phoneLabel);
				phoneLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));
		
		addressPanel = new JPanel();
		addressPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		addressPanel.setBounds(367, 356, 819, 108);
		ownerframe.getContentPane().add(addressPanel);
		addressPanel.setLayout(null);
		
				adressLabel = new JLabel("");
				adressLabel.setBounds(10, 42, 441, 36);
				addressPanel.add(adressLabel);
				adressLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));
				
				Font OwnersProfileLabelFont = null;
                try {
                	OwnersProfileLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(OwnersProfileLabelFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
				
				OwnersProfileLabel = new JLabel("Owner Profile");
				OwnersProfileLabel.setForeground(new Color(19, 0, 90));
				OwnersProfileLabel.setFont(OwnersProfileLabelFont.deriveFont(Font.BOLD, 36));
				OwnersProfileLabel.setBounds(377, 141, 260, 62);
				ownerframe.getContentPane().add(OwnersProfileLabel);
				
				
				
				Font HeaderFont = null;
                try {
                	HeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(HeaderFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                
				MypetsLabel = new JLabel("My Pets");
				MypetsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
				MypetsLabel.setBounds(275, 27, 118, 40);
				ownerframe.getContentPane().add(MypetsLabel);
				
				AboutLabel = new JLabel("About");
				AboutLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
				AboutLabel.setBounds(403, 27, 118, 40);
				ownerframe.getContentPane().add(AboutLabel);
				
				ContactUsLabel = new JLabel("Contact Us");
				ContactUsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
				ContactUsLabel.setBounds(518, 27, 118, 40);
				ownerframe.getContentPane().add(ContactUsLabel);
				
				Font labelFont = null;
                try {
                	labelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(labelFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                
				NameLabel = new JLabel("Name:");
				NameLabel.setFont(labelFont.deriveFont(Font.BOLD, 14));
				NameLabel.setBounds(367, 238, 118, 14);
				ownerframe.getContentPane().add(NameLabel);
				
				PhoneNoLAbel = new JLabel("Phone Number:");
				PhoneNoLAbel.setFont(labelFont.deriveFont(Font.BOLD, 14));
				PhoneNoLAbel.setBounds(828, 238, 118, 14);
				ownerframe.getContentPane().add(PhoneNoLAbel);
				
				AddressLabel = new JLabel("Address:");
				AddressLabel.setFont(labelFont.deriveFont(Font.BOLD, 14));
				AddressLabel.setBounds(367, 333, 118, 14);
				ownerframe.getContentPane().add(AddressLabel);
	}

	    private void displayData() {
	        StringBuilder sb = new StringBuilder();
	        for (String item : data) {
	            sb.append(item);
	            sb.append("\n");
	        }
	        
	    }
}
