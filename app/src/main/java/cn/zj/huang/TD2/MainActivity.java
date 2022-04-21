package cn.zj.huang.TD2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.SeekBar;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar sb = findViewById(R.id.seekBar);
        final EditText numberField = findViewById(R.id.editTextNumber);
        numberField.setText(String.valueOf(sb.getProgress()));

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                numberField.setText(String.valueOf(progress));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar){}

            @Override
            public void onStartTrackingTouch(SeekBar seekBar){}
        });

    }

    private Bundle generateBundle(){
        final EditText nameEdit = findViewById(R.id.editTextTextPersonName);
        String name = nameEdit.getText().toString();

        final CalendarView calendarView = findViewById(R.id.calendarView);
        final long timestamp = calendarView.getDate();
        final Date date = new Date(timestamp);
        final DateFormat formatter = new DateFormat();
        final String formattedDate = (String) formatter.format("dd/MM/yyyy",date);

        final EditText numberEdit = findViewById(R.id.editTextNumber);
        String number = numberEdit.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("name",name);
        bundle.putString("date",formattedDate);
        bundle.putString("number",number);
        return bundle;
    }

    public void onClick(View v){
        Intent i = new Intent();
        i.setClass(this, DisplayActivity.class);
        i.putExtras(generateBundle());
        startActivity(i);
    }

    public void onClickContact(View v){
        Intent i = new Intent();
        i.setClass(this, ContactActivity.class);
        startActivity(i);
    }

}