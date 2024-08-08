import java.awt.*;
import javax.swing.*;

public class Gui  {
    public static void main(String[] args) {
        var frame = new JFrame("TextField Example");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(370, 200);

        var nameLabel = new JLabel("Name: ");
        var nameField = new JTextField(25);
        var emailLabel = new JLabel("Email: ");
        var emailField = new JTextField(24);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);

        frame.setVisible(true);
    }
}
