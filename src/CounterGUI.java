import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterGUI extends JFrame {
    JButton inc = new JButton("Increment");
    JButton decrementButton = new JButton("Decrement");
    JTextField value = new JTextField(10);  // Initializing with 0

    public CounterGUI() {
        this.setSize(300, 100);
        setTitle("Counter");
        value.setText("0");
        // Create panels for layout
        JPanel north = new JPanel();
        north.add(value);
        JPanel south = new JPanel();
        south.add(inc);
        south.add(decrementButton);

        // Add panels to the frame
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);

        // Increment button action
        inc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val = value.getText();
                value.setText(Integer.toString(Integer.parseInt(val) + 1));
            }
        });

        // Decrement button action
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val = value.getText();
                value.setText(Integer.toString(Integer.parseInt(val) - 1));
            }
        });

        // Set visibility of the frame
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the app when the window is closed
    }

    public static void main(String[] args) {
        new CounterGUI();  // Create and display the GUI
    }
}
