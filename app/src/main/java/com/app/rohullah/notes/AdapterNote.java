package com.app.rohullah.notes;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class AdapterNote extends ArrayAdapter<StrucNote> {

   public AdapterNote(ArrayList<StrucNote> array){
       super(G.context,R.layout.adapter_note,array);
   }

    public static class viewHolder{

        public viewHolder (View view){

        }

        public void fill(ArrayAdapter<StrucNote> adapter,StrucNote item,int position){

        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        StrucNote item = getItem(position);
        if (convertView == null) {
            convertView=G.inflater.inflate(R.layout.adapter_note,parent,false);
            holder= new viewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (viewHolder) convertView.getTag();
        }
        holder.fill(this,item,position);
        return convertView;
    }
}
