import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private JButton plus;
    private JButton minus;
    private JButton remove;


    public Panel() {
        super(new GridLayout(1, 3));
        createComponents();
    }


    private void createComponents() {

        plus = new JButton("+");
        add(plus);
        minus = new JButton("-");
        add(minus);
        remove = new JButton("Z");
        remove.setEnabled(false);
        add(remove);
    }


    public JButton getPlus() {
        return plus;
    }

    public JButton getMinus() {
        return minus;
    }

    public JButton getRemove() {
        return remove;
    }
    public void setRemove(boolean b){
        remove.setEnabled(b);
    }
}