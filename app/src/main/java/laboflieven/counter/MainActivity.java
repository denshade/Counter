package laboflieven.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Integer> values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ValueChanger changer = new ValueChanger(this);
        NumberPicker np = findViewById(R.id.np1);
        np.setMinValue(0);
        np.setMaxValue(1000);
        np.setOnValueChangedListener(changer);
        NumberPicker np5 = findViewById(R.id.np5);
        String[] numbers = new String[1000/5];
        for (int i=0; i<numbers.length; i++)
            numbers[i] = Integer.toString(i*5);
        np5.setDisplayedValues(numbers);
        np5.setMinValue(0);
        np5.setMaxValue(numbers.length - 1);
        np5.setOnValueChangedListener(changer);
        NumberPicker np10 = findViewById(R.id.np10);
        String[] numbers10 = new String[1000/10];
        for (int i=0; i < numbers10.length; i++)
            numbers10[i] = Integer.toString(i*10);
        np10.setDisplayedValues(numbers10);
        np10.setMinValue(0);
        np10.setMaxValue(numbers10.length - 1);
        np10.setOnValueChangedListener(changer);
        Button btn =  findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    public void reset()
    {
        NumberPicker np = findViewById(R.id.np1);
        np.setValue(0);
        NumberPicker np5 = findViewById(R.id.np5);
        np5.setValue(0);
        NumberPicker np10 = findViewById(R.id.np10);
        np10.setValue(0);
        TextView total = findViewById(R.id.total);
        total.setText("Total 0");
    }
}
