import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.border.MatteBorder;


public class ImmunizationsDeworming extends JFrame {
    private JTable table;
    private JTextField dateField;
    private JTextField timeField;
    private Timer timer;
    private TimerTask timerTask;

    private final JLabel pawFileLogo = new JLabel("");
   

    
    public ImmunizationsDeworming() {
    	
    	 Font customFont1 = null;
         try {
             customFont1 = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Black.ttf"));
         } catch (FontFormatException | IOException e) {
             e.printStackTrace();
         }
    	getContentPane().setForeground(new Color(240, 240, 240));
        // Set up JFrame properties
        setTitle("Regular Immunization & Deworming");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1250, 634);

        // Create sample data
        String[] columns = {"Date", "Weight","Againts", "Manufacturer","Lot Number","Veterinarian"};
        Object[][] data = {
                {"", "", "", "", "", "",},
                {"", "", "", "", "", ""},
                {"", "", "", "", "", ""}
        };

        // Create a table model with the data
        DefaultTableModel model = new DefaultTableModel(data, columns);
        getContentPane().setLayout(null);
        
                // Add the table to the frame
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                scrollPane.setBounds(38, 233, 812, 257);
                getContentPane().add(scrollPane);
                
                

                
                        // Create the JTable using the model
                        table = new JTable(new DefaultTableModel(
                        	new Object[][] {
                        		{"", "", "", "", "", ""},
                        		{"", "", "", "", "", ""},
                        		{"", "", "", "", "", ""},
                        		{"", "","" , "", "", ""},
                        		{"", "","" , "", "", ""},
                        		{"", "","" , "", "", ""},
                        		{"", "","" , "", "", ""},
                        		{"", "","" , "", "", ""},
                        		{"", "","" , "", "", ""}
                        	},
                        	new String[] {
                        		"Date", "Weight", "Againts", "Manufacturer", "Lot Number", "Veterinarian"
                        	}
                        ));
                        
                        Font tableCellFont = null;
                        try {
                        	tableCellFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Light.ttf"));
                        } catch (FontFormatException | IOException e) {
                            e.printStackTrace();
                        }
                        table.setBackground(new Color(255, 255, 255));
                        table.setFont((tableCellFont.deriveFont(Font.BOLD, 14)));
                        table.setBorder(null);
                        table.setSelectionBackground(new Color(173, 228, 219));
                        scrollPane.setViewportView(table);
                        
                        Font tableHeaderFont = null;
                        try {
                        	tableHeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
                        } catch (FontFormatException | IOException e) {
                            e.printStackTrace();
                        }
                        table.getTableHeader().setFont((tableHeaderFont.deriveFont(Font.BOLD, 16)));;
                        //table.setFont((tableCellFont.deriveFont(Font.BOLD, 14)));
                        table.getTableHeader().setOpaque(false);
                        table.getTableHeader().setBackground(new Color(21,1,90));
                        table.getTableHeader().setForeground(new Color(255,255,255));
                        table.setRowHeight(25);
                        
               JButton importButton = new JButton("Import");
               importButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(246, 186, 111)));
               importButton.setForeground(new Color(255, 255, 255));
               importButton.setFont((customFont1.deriveFont(Font.BOLD, 15)));
               importButton.setBackground(new Color(19, 0, 90));
               importButton.setBounds(585, 520, 265, 40);
               getContentPane().add(importButton);
        
                // Add buttons for export and import
                JButton exportButton = new JButton("Export");
                exportButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(246, 186, 111)));
                exportButton.setFont((customFont1.deriveFont(Font.BOLD, 15)));
                exportButton.setBackground(new Color(19, 0, 90));
                exportButton.setForeground(new Color(255, 255, 255));
                exportButton.setBounds(312, 520, 265, 40);
                getContentPane().add(exportButton);
                
                pawFileLogo.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/images/pawFileLogo.png")));
                pawFileLogo.setBounds(20, 11, 193, 70);
                getContentPane().add(pawFileLogo);
                
                JLabel lblNewLabel = new JLabel("New label");
                lblNewLabel.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/images/headerLine.png")));
                lblNewLabel.setBounds(38, 91, 1159, 14);
                getContentPane().add(lblNewLabel);
                
                Font customFont = null;
                try {
                     customFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(customFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                
                JLabel RegularImmunizationsandDewormingLabel = new JLabel("Regular Immunizations and Deworming");
                RegularImmunizationsandDewormingLabel.setForeground(new Color(19, 0, 90));
               
				RegularImmunizationsandDewormingLabel.setFont((customFont.deriveFont(Font.BOLD, 32)));
                RegularImmunizationsandDewormingLabel.setBounds(38, 151, 688, 51);
                getContentPane().add(RegularImmunizationsandDewormingLabel);
                
                Font customFont2 = null;
                try {
                     customFont2 = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(customFont1);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                
                JPanel panel = new JPanel();
                panel.setBackground(new Color(255, 255, 255));
                panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(19, 0, 90)));
                panel.setBounds(867, 126, 330, 443);
                getContentPane().add(panel);
                panel.setLayout(null);
                
                JLabel smallLogo = new JLabel("");
                smallLogo.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/images/Smallerlogo.png")));
                smallLogo.setBounds(103, 26, 134, 51);
                panel.add(smallLogo);
                
                JLabel ScheduleaReminderLabel = new JLabel("Schedule a Reminder");
                ScheduleaReminderLabel.setBounds(40, 97, 254, 40);
                panel.add(ScheduleaReminderLabel);
                ScheduleaReminderLabel.setForeground(new Color(19, 0, 90));
                ScheduleaReminderLabel.setFont((customFont2.deriveFont(Font.BOLD, 25)));
                
                dateField = new JTextField();
                dateField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
                dateField.setBackground(new Color(232, 237, 236));
                dateField.setBounds(10, 200, 308, 40);
                panel.add(dateField);
                dateField.setColumns(10);
                
                timeField = new JTextField();
                timeField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
                timeField.setBackground(new Color(232, 237, 236));
                timeField.setBounds(10, 266, 308, 40);
                panel.add(timeField);
                timeField.setColumns(10);
                
                JLabel timeLabel = new JLabel("Time (HH:mm):");
                timeLabel.setFont((customFont1.deriveFont(Font.BOLD, 14)));
                timeLabel.setBounds(10, 244, 118, 21);
                panel.add(timeLabel);
                
                JLabel dateLabel = new JLabel("Date (yyyy-MM-dd):");
                dateLabel.setFont((customFont1.deriveFont(Font.BOLD, 13)));
                dateLabel.setBounds(10, 177, 146, 21);
                panel.add(dateLabel);
                
                JButton setButton = new JButton("Set the Date");
                setButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(246, 186, 111)));
                setButton.setFont((customFont1.deriveFont(Font.BOLD, 13)));
                setButton.setBounds(10, 320, 146, 40);
                panel.add(setButton);
                setButton.setBackground(new Color(19, 0, 90));
                setButton.setForeground(new Color(255, 255, 255));
                
                JButton clearDataButton = new JButton("Clear Data");
                clearDataButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(19, 0, 90)));
                clearDataButton.setFont((customFont1.deriveFont(Font.BOLD, 14)));
                clearDataButton.setBounds(172, 320, 146, 40);
                panel.add(clearDataButton);
                clearDataButton.setBackground(new Color(246, 186, 111));
                
                
                Font HeaderFont = null;
                try {
                	HeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(customFont1);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                
                
                JLabel MypetLabel = new JLabel("My Pets");
                MypetLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
                MypetLabel.setBounds(284, 27, 118, 39);
                getContentPane().add(MypetLabel);
                
                JLabel AboutLabel = new JLabel("About");
                AboutLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
                AboutLabel.setBounds(401, 27, 118, 39);
                getContentPane().add(AboutLabel);
                
                JLabel ContactUsLabel = new JLabel("Contact Us");
                ContactUsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
                ContactUsLabel.setBounds(518, 27, 118, 39);
                getContentPane().add(ContactUsLabel);
                
                JLabel lblNewLabel_1 = new JLabel("New label");
                lblNewLabel_1.setBounds(184, 3, 100, 95);
                getContentPane().add(lblNewLabel_1);
                clearDataButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		
                		// Clear the table data
                        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
                        tableModel.setRowCount(0);

                        // Clear the text fields
                        dateField.setText("");
                        timeField.setText("");
                		
                	}
                });
                setButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		
                		 String dateText = dateField.getText();
                	        String timeText = timeField.getText();

                	        // Check if the date and time fields are empty
                	        if (dateText.isEmpty() || timeText.isEmpty()) {
                	            JOptionPane.showMessageDialog(null, "Please enter a valid date and time.");
                	            return;
                	        }

                	        try {
                	            LocalDateTime notificationDateTime = LocalDateTime.parse(dateText + "T" + timeText);
                	            LocalDateTime currentDateTime = LocalDateTime.now();

                	            long daysUntilNotification = currentDateTime.until(notificationDateTime, java.time.temporal.ChronoUnit.DAYS);

                	            if (daysUntilNotification <= 3 && daysUntilNotification >= 0) {
                	                JOptionPane.showMessageDialog(null, "Notification: Date approaching in " + daysUntilNotification + " days!");
                	            } else {
                	                JOptionPane.showMessageDialog(null, "Notification: Date is not within 3 days!");
                	            }

                	            // Schedule the alarm
                	            scheduleAlarm(timeText);
                	        } catch (Exception ex) {
                	            JOptionPane.showMessageDialog(null, "Please enter a valid date and time in the format yyyy-MM-dd and HH:mm.");
                	        }
                	    }
                	});
                
       
                
                        // Action listener for the export button
                        exportButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                exportTableData();
                                
                            }
                        });

        // Action listener for the import button
        importButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                importTableData();
            }
        });
    }

    
		
	

	



	private void exportTableData() {
        try {
            // Create a file chooser dialog
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);

            if (choice == JFileChooser.APPROVE_OPTION) {
                // Get the selected file
                File file = fileChooser.getSelectedFile();

                // Open a file writer
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));

                // Write the table data to the file
                for (int i = 0; i < table.getRowCount(); i++) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        writer.write(table.getValueAt(i, j).toString());
                        if (j < table.getColumnCount() - 1)
                            writer.write(",");
                    }
                    writer.newLine();
                }

                // Close the writer
                writer.close();
                
                JOptionPane.showMessageDialog(this, "Table data exported successfully.");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error exporting table data: " + ex.getMessage());
        }
    }

   
		

	private void importTableData() {
        try {
            // Create a file chooser dialog
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);

            if (choice == JFileChooser.APPROVE_OPTION) {
                // Get the selected file
                File file = fileChooser.getSelectedFile();

                // Open a file reader
                BufferedReader reader = new BufferedReader(new FileReader(file));

                // Read the file line by line
                String line;
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0); // Clear existing table data

                while ((line = reader.readLine()) != null) {
                    // Split the line by comma
                    String[] rowData = line.split(",");

                    // Add a new row to the table model
                    model.addRow(rowData);
                }
                
                int dateColumnIndex = model.findColumn("Date");
                if (dateColumnIndex != -1 && model.getRowCount() > 0) {
                    String dateValue = model.getValueAt(0, dateColumnIndex).toString();
                    dateField.setText(dateValue);
                } else {
                    dateField.setText("");
                }

                // Close the reader
                reader.close();

                JOptionPane.showMessageDialog(this, "Table data imported successfully.");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error importing table data: " + ex.getMessage());
        }
    }
	
	private void scheduleAlarm(String timeText) {
	    try {
	        // Parse the input time
	        int hours = Integer.parseInt(timeText.substring(0, 2));
	        int minutes = Integer.parseInt(timeText.substring(3));

	        // Get the current time
	        LocalDateTime now = LocalDateTime.now();
	        int currentHours = now.getHour();
	        int currentMinutes = now.getMinute();

	        // Calculate the delay in milliseconds until the alarm time
	        long delay = ((hours - currentHours) * 60 + (minutes - currentMinutes)) * 60 * 1000;

	        // Create a TimerTask to execute when the alarm triggers
	        timerTask = new TimerTask() {
	            @Override
	            public void run() {
	                // Perform the actions you want when the alarm triggers
	                JOptionPane.showMessageDialog(null, "Schedule for your Cute Pet's Immunization and Deworming!!");
	                
	            }
	        };

	        // Schedule the TimerTask with the specified delay
	        timer = new Timer();
	        timer.schedule(timerTask, delay);
	    } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
	        JOptionPane.showMessageDialog(null, "Invalid time format. Please enter time in HH:mm format.");
	          }
	      }
		
   
        public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
        	ImmunizationsDeworming immunizationsdeworming = new ImmunizationsDeworming();
        	immunizationsdeworming.setVisible(true);
            
        }
    });
    
    }
}