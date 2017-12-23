package com.example.administrator.tablayout;

/**
 * Created by Administrator on 2017/12/23.
 */



import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mChenys on 2016/5/28.
 */
public class TabFragment extends android.support.v4.app.Fragment{
    private String mTitle;

    public void setTitle(String title) {
        this.mTitle = title;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);
        textView.setGravity(Gravity.CENTER);
        textView.setText(mTitle);
        return textView;
    }
}