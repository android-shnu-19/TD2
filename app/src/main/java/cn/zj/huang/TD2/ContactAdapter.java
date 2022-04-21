package cn.zj.huang.TD2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {
    //the list values in the List of type hero
    ArrayList<Contact> contacts;

    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;

    //constructor initializing the values
    public ContactAdapter(Context context, int resource, ArrayList<Contact> contacts) {
        super(context, resource, contacts);
        this.context = context;
        this.resource = resource;
        this.contacts = contacts;
    }

    //this will return the ListView Item as a View
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //we need to get the view of the xml for our list item
        //And for this we need a layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        View view = layoutInflater.inflate(resource, null, false);

        //getting the view elements of the list from the view
        ImageView imageView = view.findViewById(R.id.contactPicture);
        TextView textName = view.findViewById(R.id.contactName);
        TextView textPhoneNumber = view.findViewById(R.id.phoneNumber);

        //getting the hero of the specified position
        Contact contact = contacts.get(position);

        //adding values to the list item
        imageView.setImageDrawable(context.getResources().getDrawable(contact.getPicture()));
        textName.setText(contact.getName());
        textPhoneNumber.setText(contact.getPhoneNumber());

        //finally returning the view
        return view;
    }
}
