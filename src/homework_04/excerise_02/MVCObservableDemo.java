package homework_04.excerise_02;

public class MVCObservableDemo {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);

        // Give each View the controller instance, so it can theoretically call userEventUpdate
        View view1 = new View(controller, "View1");
        View view2 = new View(controller, "View2");
        View view3 = new View(controller, "View3");

        // Not sure here, but diagram said Controller calls register on View and View calls register on Model
        // So View registers itself on given Model
        controller.registerViewInModel(view1);
        controller.registerViewInModel(view2);
        controller.registerViewInModel(view3);

        System.out.println("Set data to 10");
        controller.userEventUpdate(10);

        System.out.println("Set data to 20");
        controller.userEventUpdate(20);

        System.out.println("Set data to 30");
        controller.userEventUpdate(30);
    }
}
