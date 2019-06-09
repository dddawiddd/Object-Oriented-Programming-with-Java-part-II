import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {

    Panel panel;
    private JTextField valueToAdd;
    private JTextField baseValue;


    public Listener(Panel panel, JTextField baseValue, JTextField valueToAdd) {
        this.valueToAdd = valueToAdd;
        this.baseValue = baseValue;
        this.panel = panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+")) {
            int a = Integer.parseInt(baseValue.getText());
            try {
                a = Integer.parseInt(baseValue.getText()) + Integer.parseInt(valueToAdd.getText());
            } catch (NumberFormatException ex) {
                valueToAdd.setText("");
            }
            baseValue.setText(a + "");
            valueToAdd.setText("");
            panel.setRemove(true);
        } else if (e.getActionCommand().equals("-")) {
            int a = Integer.parseInt(baseValue.getText());
            try {
                a = Integer.parseInt(baseValue.getText()) - Integer.parseInt(valueToAdd.getText());
            } catch (NumberFormatException ex) {
                valueToAdd.setText("asd");
            }
            baseValue.setText(a + "");
            valueToAdd.setText("");
            panel.setRemove(true);

        } else {
            baseValue.setText("0");
            valueToAdd.setText("");
            panel.setRemove(false);
        }
    }
}