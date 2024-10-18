import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AlarmClock {

    public static void main(String[] args) {
        // Set the alarm time (24-hour format)
        String alarmTime = "19:26"; // Change this to your desired alarm time

        // Create a timer
        Timer timer = new Timer();

        // Define a task to be executed when the alarm time is reached
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Alarm! It's time to wake up!");
                // You can replace the message with any action you want
                timer.cancel(); // Cancel the timer to prevent repeated alarms
            }
        };

        // Schedule the task to run at the desired alarm time
        String[] alarmTimeParts = alarmTime.split(":");
        int alarmHour = Integer.parseInt(alarmTimeParts[0]);
        int alarmMinute = Integer.parseInt(alarmTimeParts[1]);
        Date alarmDate = new Date();
        alarmDate.setHours(alarmHour);
        alarmDate.setMinutes(alarmMinute);
        alarmDate.setSeconds(0);

        timer.schedule(task, alarmDate);
    }
}