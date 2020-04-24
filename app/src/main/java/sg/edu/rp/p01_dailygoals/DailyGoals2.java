package sg.edu.rp.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DailyGoals2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_goals2);
        //get the intent so as to get the "values" inside the intent
        Intent i = getIntent();
        //Get the string array name info we passed in
        String[] info = i.getStringArrayExtra("info");
        //get the textview id
        TextView tvSummary = (TextView) findViewById(R.id.textView1);
        //set the string and print out the values
        tvSummary.setText("Read up on materials before class: " + info[0] + "\n" + "Arrive on time so as not to miss important part of the lesson : " +info[1] + "\n" + "Attempt the problem myself : " +info[2] + "\n" + "Reflection :" + info[3] );

    }
}
