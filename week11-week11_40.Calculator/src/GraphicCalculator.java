import javax.swing.*;
import java.awt.*;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField2;


    @Override
    public void run() {

        frame = new JFrame("Calculator");

        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        textField = new JTextField();
        textField.setEnabled(false);
        textField.setText("0");

        textField2 = new JTextField();

        Panel panel = new Panel();

        container.add(textField);
        container.add(textField2);
        container.add(panel, BorderLayout.SOUTH);

        panel.getPlus().addActionListener(new Listener(panel, textField, textField2));
        panel.getMinus().addActionListener(new Listener(panel, textField, textField2));
        panel.getRemove().addActionListener(new Listener(panel, textField, textField2));
    }
}