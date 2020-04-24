package sg.edu.rp.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
//elgin
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOk = (Button)findViewById(R.id.button2);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                RadioGroup rgMaterial = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rgTime = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rgProblem = (RadioGroup)findViewById(R.id.radioGroup3);
                int selectedButtonIdMaterial = rgMaterial.getCheckedRadioButtonId();
                int selectedButtonIdTime = rgTime.getCheckedRadioButtonId();
                int selectedButtonIdProblem = rgProblem.getCheckedRadioButtonId();
                RadioButton rbMaterial =(RadioButton)findViewById(selectedButtonIdMaterial);
                RadioButton rbTime =(RadioButton)findViewById(selectedButtonIdTime);
                RadioButton rbProblem =(RadioButton)findViewById(selectedButtonIdProblem);
                EditText etReflection = (EditText)findViewById(R.id.reflectionEditText);
                String[] info ={rbMaterial.getText().toString(),
                        rbTime.getText().toString(),
                        rbProblem.getText().toString(),
                        etReflection.getText().toString(),};


                Intent i = new Intent (MainActivity.this,DailyGoals2.class);

                i.putExtra("info",info);

                startActivity(i);
            }
        });
    }
}