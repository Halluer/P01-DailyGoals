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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOk = (Button)findViewById(R.id.button2);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Get the all the  radiogroup objects
                RadioGroup rgMaterial = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rgTime = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rgProblem = (RadioGroup)findViewById(R.id.radioGroup3);
                // get the id of the selected radio button in each group
                int selectedButtonIdMaterial = rgMaterial.getCheckedRadioButtonId();
                int selectedButtonIdTime = rgTime.getCheckedRadioButtonId();
                int selectedButtonIdProblem = rgProblem.getCheckedRadioButtonId();
                //get all the Radio button objects from the Id gotten above
                RadioButton rbMaterial =(RadioButton)findViewById(selectedButtonIdMaterial);
                RadioButton rbTime =(RadioButton)findViewById(selectedButtonIdTime);
                RadioButton rbProblem =(RadioButton)findViewById(selectedButtonIdProblem);
                // Get the reflection edit text keyed in by user
                EditText etReflection = (EditText)findViewById(R.id.reflectionEditText);
                //put all the values into an array
                String[] info ={rbMaterial.getText().toString(),
                        rbTime.getText().toString(),
                        rbProblem.getText().toString(),
                        etReflection.getText().toString(),};
                //Create an intent to start another activity

                Intent i = new Intent (MainActivity.this,DailyGoals2.class);
                //Pass the string of array holding all the values over
                i.putExtra("info",info);
                //start the new activity
                startActivity(i);
            }
        });
    }
}