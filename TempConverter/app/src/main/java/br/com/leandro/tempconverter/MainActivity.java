package br.com.leandro.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private RadioButton celciusRadio;
    private RadioButton fahreinheitRadio;
    private Button converterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.valorTemp);
        celciusRadio = (RadioButton) findViewById(R.id.celciusRadio);
        fahreinheitRadio = (RadioButton) findViewById(R.id.fahreinheitRadio);
        converterButton = (Button) findViewById(R.id.converterButton);

        converterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversor();
            }
        });
    }

    public void conversor (){

        Double temp = Double.valueOf(editText.getText().toString());

        if (celciusRadio.isChecked()){
            temp = (temp -32) * 5/9;

        }else if (fahreinheitRadio.isChecked()){
            temp = temp * 9/5 +32;
        }

        editText.setText(temp.toString());
    }


}
