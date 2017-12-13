package com.first.morningweather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.first.morningweather.api.data.MyPojo;

/**
 * Created by sohee on 2017-12-12.
 * 오늘의 날씨
 */

public class FragmentSeoul extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public FragmentSeoul() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static FragmentSeoul newInstance(int sectionNumber) {
        FragmentSeoul fragment = new FragmentSeoul();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_seoul, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;

    }
}
