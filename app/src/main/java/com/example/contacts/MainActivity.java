package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.contacts.adapter.CustomAdapter;
import com.example.contacts.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lv_contact);
        ArrayList<Contact> arrayList = new ArrayList<>();
        Contact contact1 = new Contact("Khoa","0934049xxx", Color.BLACK);
        Contact contact2 = new Contact("Long","09343335xxx", Color.BLUE);
        Contact contact3 = new Contact("Đức","09344469xxx", Color.YELLOW);
        Contact contact4 = new Contact("Hoài","0935557xxx", Color.GREEN);
        Contact contact5 = new Contact("Huy","0936668xxx", Color.MAGENTA);
        Contact contact6 = new Contact("Hoàng","0931239xxx", Color.BLACK);
        Contact contact7 = new Contact("Quân","0934565xxx", Color.BLUE);
        Contact contact8 = new Contact("Mạnh","0937899xxx", Color.YELLOW);
        Contact contact9 = new Contact("Tiến","0933217xxx", Color.GREEN);
        Contact contact10 = new Contact("Việt","09354368xxx", Color.MAGENTA);
        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);
        arrayList.add(contact9);
        arrayList.add(contact10);
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_contact,arrayList);

        lvContact.setAdapter(customAdapter);

    }
}
