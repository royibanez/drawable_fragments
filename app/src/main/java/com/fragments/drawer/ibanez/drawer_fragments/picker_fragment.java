package com.fragments.drawer.ibanez.drawer_fragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.EditText;

public class picker_fragment extends Fragment implements View.OnClickListener {

    private EditText dateEditText;
    private EditText timeEditText;


    @Override
    public void onClick(View view) {

        DialogFragment newFragment = new SelectDateFragment();
        newFragment.show(getFragmentManager(), "DatePicker");

    }
}





