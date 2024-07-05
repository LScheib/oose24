package homework_04.excerise_02;

public class View {
    private String name;
    private Controller controller;
    private int data;

    public View(Controller controller, String name) {
        this.controller = controller;
        this.name = name;
    }

    public void dataUpdate(int data) {
        this.data = data;
        System.out.println(name + " updated: " + this.data);
    }

    public void register(Model model) {
        model.register(this);
    }
}
