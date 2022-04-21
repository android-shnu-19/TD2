package cn.zj.huang.TD2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ArrayList<Contact> list = new ArrayList<>();
        list.add(new Contact("Charles Meunier","060600606",R.drawable.meunier));
        list.add(new Contact("Karine Serier","0707070707",R.drawable.serier));
        list.add(new Contact("Barthelemy Heyrman","0808080808",R.drawable.heyrman));

        ListView listView = findViewById(R.id.listview);
        ContactAdapter contactAdapter = new ContactAdapter(this, R.layout.contact_item,list);
        listView.setAdapter(contactAdapter);

    }
}