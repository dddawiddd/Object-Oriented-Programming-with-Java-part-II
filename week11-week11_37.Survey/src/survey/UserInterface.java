package survey;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {

        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {

        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);

        container.setLayout(boxLayout);

        JLabel label1 = new JLabel("Are you?");
        container.add(label1);

        JCheckBox checkbox1 = new JCheckBox("Yes!");
        JCheckBox checkbox2 = new JCheckBox("No!");

        container.add(checkbox1);
        container.add(checkbox2);

        JLabel label2 = new JLabel("Why?");
        container.add(label2);

        JRadioButton radioButton1 = new JRadioButton("No reason.");
        container.add(radioButton1);

        JRadioButton radioButton2 = new JRadioButton("Because it is fun!");
        container.add(radioButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JButton button = new JButton("Done!");
        container.add(button);

    }


    public JFrame getFrame() {
        return frame;
    }
}
