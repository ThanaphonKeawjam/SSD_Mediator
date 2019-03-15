public class Mediator1 implements Mediator{

    private ButtonAction1 b1;
    private ButtonAction2 b2;
    private ButtonAction3 b3;
    private ActionLabel label;

    public Mediator1(ButtonAction1 b1, ButtonAction2 b2, ButtonAction3 b3, ActionLabel label){
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.label = label;
    }

    @Override
    public void action1() {
        label.setText("Doing action 1");
        b1.setEnabled(false);
        b2.setEnabled(true);
        b3.setEnabled(true);
    }

    @Override
    public void action2() {
        label.setText("Doing action 2");
        b2.setEnabled(false);
        b1.setEnabled(true);
        b3.setEnabled(true);
    }

    @Override
    public void action3() {
        label.setText("Doing action 3");
        b3.setEnabled(false);
        b2.setEnabled(true);
        b1.setEnabled(true);
    }
}
