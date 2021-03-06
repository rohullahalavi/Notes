package com.app.rohullah.notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_main);
        ListView lstContent = (ListView) findViewById(R.id.lstContent);
        ArrayList<StrucNote> notes = new ArrayList<StrucNote>();
        ArrayAdapter<StrucNote> adapter = new AdapterNote(notes);
        lstContent.setAdapter(adapter);

        for (int i=0;i<10;i++) {
            StrucNote note = new StrucNote();
            note.title="Title"+i;
            notes.add(note);
        }

        adapter.notifyDataSetChanged();


    }
}
