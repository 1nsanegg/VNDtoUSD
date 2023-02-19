package hanu.edu.tut2ex2tut2mpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get ref to btn
        Button btnConvert = findViewById(R.id.btnConvert);
    }

    public void convertToUSD(View view) {
        //get ref to input and output
        EditText editText = findViewById(R.id.editTextNumber);
        TextView textView = findViewById(R.id.textView);

        //get the number
        double number = Double.parseDouble(editText.getText().toString());
        //convert to usd
        double result = number * 0.000042;
        textView.setText(result + "USD");;
    }
}