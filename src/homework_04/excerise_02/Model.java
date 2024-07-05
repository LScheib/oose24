package homework_04.excerise_02;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int data;
    private List<View> views = new ArrayList<View>();

    public int getData() {
        return data;
    }

    public void changeData(int data) {
        this.data = data;
        for (View view : views) {
            view.dataUpdate(data);
        }
    }

    public void register(View view) {
        views.add(view);
    }
}
