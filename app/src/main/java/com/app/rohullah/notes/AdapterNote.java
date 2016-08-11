package com.app.rohullah.notes;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class AdapterNote extends ArrayAdapter<StrucNote> {

   public AdapterNote(ArrayList<StrucNote> array){
       super(G.context,R.layout.adapter_note,array);
   }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        StrucNote item = getItem(position);
        if (convertView == null) {
            convertView=G.inflater.inflate(R.layout.adapter_note,parent,false);
            holder= new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.fill(this,item,position);
        return convertView;
    }
}
