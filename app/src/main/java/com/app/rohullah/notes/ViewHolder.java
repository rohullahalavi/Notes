package com.app.rohullah.notes;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ViewHolder {
    TextView txtTitle;
    TextView txtDescription;
    Button btnClose;
    CheckBox chkDone;



    public ViewHolder (View view){
        btnClose = (Button)view.findViewById(R.id.btnClose);
        txtTitle = (TextView)view.findViewById(R.id.txtTitle);
    }

    public void fill(final ArrayAdapter<StrucNote> adapter, final StrucNote item, final int position){
        txtTitle.setText(item.title);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.remove(item);
            }
        });
    }

}
