package laboflieven.counter;

import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.List;

public class ValueChanger implements NumberPicker.OnValueChangeListener {

    private MainActivity main;

    public ValueChanger(MainActivity main)
    {
        this.main = main;
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

        NumberPicker np = (NumberPicker) main.findViewById(R.id.np1);
        NumberPicker np5 = (NumberPicker) main.findViewById(R.id.np5);
        NumberPicker np10 = (NumberPicker) main.findViewById(R.id.np10);
        TextView total = (TextView) main.findViewById(R.id.total);

        int sum = 0;
        sum += np.getValue();
        sum += np5.getValue() * 5;
        sum += np10.getValue() * 10;
        total.setText("Total " + sum);

    }
}
