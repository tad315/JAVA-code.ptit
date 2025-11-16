import view.FormEmployee;
import view.FormSale;
import view.FormService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new FormService().setVisible(true);
        new FormEmployee().setVisible(true);
        new FormSale().setVisible(true);
    }
}