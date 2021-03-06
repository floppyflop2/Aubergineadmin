package com.example.aubergineadmin.View;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.aubergineadmin.Model.LogicielModel;
import com.example.aubergineadmin.R;

import java.util.ArrayList;

/**
 * Created by Florian on 08/02/2017.
 */

public class LogicielAdatpter extends ArrayAdapter<LogicielModel> {
    /**
     @param context
     @param logiciels
     */
    public LogicielAdatpter(Context context , ArrayList<LogicielModel> logiciels){
        super(context,0,logiciels);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LogicielModel logiciel = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }

        TextView logicielName = (TextView)convertView.findViewById(R.id.nameLogiciel);
        logicielName.setText(logiciel.getNom());
        return convertView;

    }
}
