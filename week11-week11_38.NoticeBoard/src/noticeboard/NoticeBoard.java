package noticeboard;

import javax.swing.*;
import java.awt.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {

        frame = new JFrame("Title");

        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }


    private void createComponents(Container container) {

        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textField = new JTextField("I was copied from the JTextArea.");
        JButton button = new JButton("Copy!");
        JLabel label = new JLabel();

        button.addActionListener(new TextCopier(textField, label));

        container.add(textField);
        container.add(button);
        container.add(label);
    }
}