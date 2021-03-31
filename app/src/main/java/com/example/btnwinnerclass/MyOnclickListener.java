package com.example.btnwinnerclass;

import android.view.View;

public class MyOnclickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnclickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText("you clicked button 1");
    }
}
