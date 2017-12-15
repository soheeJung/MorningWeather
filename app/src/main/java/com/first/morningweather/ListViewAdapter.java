package com.first.morningweather;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sohee on 2017-12-15.
 */

public class ListViewAdapter extends BaseAdapter{
    private ArrayList<ListData> listViewItemList = null;
    private LayoutInflater mInflater = null;

    public ListViewAdapter(Context context) {
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listViewItemList = new ArrayList<ListData>();
    }

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return listViewItemList.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = mInflater.inflate(R.layout.seoul_ltem, viewGroup, false);
        }
        TextView seoulTxt = (TextView)view.findViewById(R.id.seoul_name);
        TextView degreeTxt = (TextView)view.findViewById(R.id.degree);
        ImageView heartImage = (ImageView)view.findViewById(R.id.likeBtn);

        return view;
    }

    public void addItem(String text1, String text2, ImageView imageView){
        ListData listData = new ListData(text1, text2, imageView);
    }
}
