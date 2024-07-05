package homework_04.excerise_02;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void userEventUpdate(int data) {
        model.changeData(data);
    }

    public void registerViewInModel(View view) {
        view.register(this.model);
    }
}
