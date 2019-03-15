import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private ButtonAction1 b1;
    private ButtonAction2 b2;
    private  ButtonAction3 b3;
    private ActionLabel label;

    public Window() {
        pack();
        b1 = new ButtonAction1("Action 1");
        b2 = new ButtonAction2("Action 2");
        b3 = new ButtonAction3("Action 3");
        label = new ActionLabel("");

        Mediator m = new Mediator1(b1, b2, b3, label);
        b1.setMediator(m);
        b2.setMediator(m);
        b3.setMediator(m);

        setLayout(new FlowLayout());
        add(label);
        add(b1);
        add(b2);
        add(b3);
        pack();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.setVisible(true);
    }
}
