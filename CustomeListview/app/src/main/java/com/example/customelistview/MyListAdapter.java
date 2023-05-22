package com.example.customelistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
//    private final Integer[] imgid;
    public MyListAdapter(Activity context, String[] maintitle,String[]
            subtitle) {
        super(context, R.layout.mylist, maintitle);
        // TODO Auto-generated constructor stub
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
//        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView titleText = (TextView) rowView.findViewById(androidx.core.R.id.title);
//        ImageView imageView = (ImageView)
//                rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView)
                rowView.findViewById(R.id.subtitile);

        titleText.setText(maintitle[position]);
//        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);

        return rowView;
    };
}