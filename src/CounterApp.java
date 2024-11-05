import javax.swing.SwingUtilities;
public class CounterApp {
public static void main(String[] args) {
    // Run the app on the Event Dispatch Thread (EDT)
    SwingUtilities.invokeLater(() -> new CounterGUI());
    }
   }
