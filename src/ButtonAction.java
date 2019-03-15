import javax.swing.*;

public abstract class ButtonAction extends JButton {

    protected Mediator mediator;

    public ButtonAction(String text){
        super(text);
    }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

}
