import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction3 extends ButtonAction{

    public ButtonAction3(String text) {
        super(text);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.action3();
            }
        });
    }
}
