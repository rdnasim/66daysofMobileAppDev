package space.rdnasim.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    // private Button showMoney, showTag;

    private TextView moneyText;
    private int moneyCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moneyText = findViewById(R.id.money_text);
//        showMoney = findViewById(R.id.button_make_rain);
//        showTag = findViewById(R.id.button_show_tag);

        /* showMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MYTAG", "onClick: ");
            }
        });

         */


    }

    public void makeItRain(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        moneyCounter += 1000;
        moneyText.setText(numberFormat.format(moneyCounter));
        Toast.makeText(getApplicationContext(), "MAKE IT RAIN and it money:  " + numberFormat.format(moneyCounter), Toast.LENGTH_SHORT).show();


        switch (moneyCounter){
            case 2000:
                moneyText.setTextColor(Color.BLACK);
                moneyText.setTextColor(getResources().getColor(R.color.myColor));
        }
        //Log.d("MIR", "makeItRain: Tapped " + moneyCounter);
    }

    public void showTag(View view) {
        Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_SHORT).show();
        //Log.d("MYTAG", "onClick: ");
    }
}
