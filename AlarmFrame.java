import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlarmFrame extends JFrame {
    private JTextField dateField;
    private JTextField timeField;
    private Timer timer;
    private TimerTask timerTask;
	protected Object AlarmFrame;

    public AlarmFrame() {
        setTitle("Set Alarm");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(921, 703);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        dateField = new JTextField();
        dateField.setBounds(232, 193, 159, 20);

        JPanel datePanel = new JPanel();
        datePanel.setLayout(null);
        JLabel label_1 = new JLabel("Date:");
        label_1.setBounds(195, 196, 27, 14);
        datePanel.add(label_1);
        datePanel.add(dateField);

        getContentPane().add(datePanel);
        JButton setButton = new JButton("Set Alarm");
        setButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        setButton.setBounds(337, 287, 79, 23);
        datePanel.add(setButton);
        timeField = new JTextField();
        timeField.setBounds(232, 224, 131, 20);
        datePanel.add(timeField);
        JLabel label = new JLabel("Time:");
        label.setBounds(196, 227, 26, 14);
        datePanel.add(label);
        
                setButton.addActionListener(e -> setAlarm());
    }

    private void setAlarm() {
        String dateText = dateField.getText();
        String timeText = timeField.getText();

        // Check if the date and time fields are empty
        if (dateText.isEmpty() || timeText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid date and time.");
            return;
        }

        try {
            LocalDateTime notificationDateTime = LocalDateTime.parse(dateText + "T" + timeText);
            LocalDateTime currentDateTime = LocalDateTime.now();

            long daysUntilNotification = currentDateTime.until(notificationDateTime, java.time.temporal.ChronoUnit.DAYS);

            if (daysUntilNotification <= 3 && daysUntilNotification >= 0) {
                JOptionPane.showMessageDialog(this, "Notification: Date approaching in " + daysUntilNotification + " days!");
            } else {
                JOptionPane.showMessageDialog(this, "Notification: Date is not within 3 days!");
            }

            // Schedule the alarm
            scheduleAlarm(timeText);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid date and time in the format yyyy-MM-dd and HH:mm.");
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
}
