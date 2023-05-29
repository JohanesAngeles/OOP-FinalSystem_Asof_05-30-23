import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class KnownConditionandAllergies {

    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton importButton;
    private Font customFont;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    KnownConditionandAllergies window = new KnownConditionandAllergies();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public KnownConditionandAllergies() {
        initialize();
    }

    private void initialize() {
    	
    	
        frame = new JFrame();
        frame.setBounds(100, 100, 1250, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Load the custom font
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Black.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(85, 211, 1033, 226);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setFont(customFont.deriveFont(Font.PLAIN, 14));
        table.setRowHeight(25);

        tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Name", "Weight", "Medicine", "Condition","Allergies" }) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(tableModel);

        scrollPane.setViewportView(table);

        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setBackground(new Color(21,1,90));
        tableHeader.setForeground(new Color(255,255,255));
        tableHeader.setFont(customFont.deriveFont(Font.BOLD, 20));
        tableHeader.setOpaque(false);
        
        
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);

        Font labelFont = customFont.deriveFont(Font.PLAIN, 12);

        JButton addDataButton = new JButton("Input new data");
        addDataButton.setForeground(new Color(0, 0, 0));
        addDataButton.setBackground(new Color(246, 186, 111));
        addDataButton.setBounds(853, 493, 265, 40);
        addDataButton.setFont(labelFont);
        frame.getContentPane().add(addDataButton);
        addDataButton.addActionListener(e -> addInfo());

        JButton exportButton = new JButton("Export");
        exportButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        exportButton.setForeground(new Color(255, 255, 255));
        exportButton.setBackground(new Color(19, 0, 90));
        exportButton.setBounds(578, 493, 265, 40);
        exportButton.setFont(labelFont);
        frame.getContentPane().add(exportButton);
        exportButton.addActionListener(e -> {
            try {
                exportTableData();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        
        
        importButton = new JButton("Import");
        importButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        importButton.setBackground(new Color(19, 0, 90));
        importButton.setForeground(new Color(255, 255, 255));
        importButton.setBounds(303, 493, 265, 40);
        importButton.setFont(labelFont);
        frame.getContentPane().add(importButton);
        
        JLabel logo = new JLabel("");
        logo.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/images/pawFileLogo.png")));
        logo.setBounds(10, 11, 193, 71);
        frame.getContentPane().add(logo);
        
        JLabel headeLine = new JLabel("");
        headeLine.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/images/headerLine.png")));
        headeLine.setBounds(28, 87, 1164, 14);
        frame.getContentPane().add(headeLine);
        
        Font customFont = null;
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
       
        JLabel KnownAllergiesAndConditionsLAbel = new JLabel("Known Allergies and Conditions");
        KnownAllergiesAndConditionsLAbel.setForeground(new Color(19, 0, 90));
        KnownAllergiesAndConditionsLAbel.setFont((customFont.deriveFont(Font.BOLD, 36)));
        KnownAllergiesAndConditionsLAbel.setBounds(75, 132, 558, 60);
        frame.getContentPane().add(KnownAllergiesAndConditionsLAbel);
        
        Font customFont1 = null;
        try {
            customFont1 = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

       
        
        JLabel MypetLabel = new JLabel("My Pet");
        MypetLabel.setBounds(285, 28, 118, 33);
        MypetLabel.setFont(customFont1.deriveFont(Font.BOLD, 18));
        frame.getContentPane().add(MypetLabel);
        
        JLabel aboutLabel = new JLabel("About");
        aboutLabel.setBounds(413, 28, 118, 32);
        aboutLabel.setFont(customFont1.deriveFont(Font.BOLD, 18));
        frame.getContentPane().add(aboutLabel);
        
        JLabel contatcUSLabel = new JLabel("Contact Us");
        contatcUSLabel.setBounds(541, 31, 118, 27);
        contatcUSLabel.setFont(customFont1.deriveFont(Font.BOLD, 18));
        frame.getContentPane().add(contatcUSLabel);
        
        importButton.addActionListener(e -> {
            try {
                importTableData();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    private void addInfo() {
        AddDataForm addDataForm = new AddDataForm(this);
        addDataForm.show();
    }

    public void addInfoFromForm(String name, String weight, String medicine, String condition, String allergies) {
        Object[] rowData = { name, weight, medicine, condition, allergies };
        tableModel.addRow(rowData);
    }

    private void exportTableData() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Export Table Data");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        int userSelection = fileChooser.showSaveDialog(frame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
                for (int i = 0; i < tableModel.getColumnCount(); i++) {
                    writer.write(tableModel.getColumnName(i));
                    if (i < tableModel.getColumnCount() - 1) {
                        writer.write("\t");
                    }
                }
                writer.newLine();

                for (int row = 0; row < tableModel.getRowCount(); row++) {
                    for (int column = 0; column < tableModel.getColumnCount(); column++) {
                        Object value = tableModel.getValueAt(row, column);
                        writer.write(value.toString());
                        if (column < tableModel.getColumnCount() - 1) {
                            writer.write("\t");
                        }
                    }
                    writer.newLine();
                }

                JOptionPane.showMessageDialog(frame, "Table data exported successfully.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error exporting table data: " + ex.getMessage(),
                        "Export Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void importTableData() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Import Table Data");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        int userSelection = fileChooser.showOpenDialog(frame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToImport = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(fileToImport))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split("\t");
                    tableModel.addRow(data);
                }
                JOptionPane.showMessageDialog(frame, "Table data imported successfully.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error importing table data: " + ex.getMessage(),
                        "Import Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public Font getCustomFont() {
        return customFont;
    }
}
