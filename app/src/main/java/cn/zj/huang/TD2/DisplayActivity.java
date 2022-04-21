package cn.zj.huang.TD2;

 import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
 import android.widget.EditText;
 import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle bundle = this.getIntent().getExtras();

        final TextView nameEdit = findViewById(R.id.textView4);
        nameEdit.setText(bundle.getString("name"));

        final TextView dateEdit = findViewById(R.id.textView7);
        dateEdit.setText(bundle.getString("date"));

        final TextView cursorEdit = findViewById(R.id.textView9);
        cursorEdit.setText(bundle.getString("number"));

    }
}