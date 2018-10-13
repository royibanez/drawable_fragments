package com.fragments.drawer.ibanez.drawer_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class toggle_fragment extends Fragment {


    private boolean toggleButtonValue = false;
    private boolean toggleSwitchValue = false;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);


    }


    ToggleButton toggleButton = layout.findViewById(R.id.toggle_button);
    SwitchCompat toggleSwitch = layout.findViewById(R.id.toggle_switch);

    toggleButtonValue = toggleButton.isChecked();
    toggleSwitchValue = toggleSwitch.isChecked();

        toggleButton.setOnCheckedChangeListener(this);
        toggleSwitch.setOnCheckedChangeListener(this);

        return layout;

}


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int id = buttonView.getId();
        String message = "";

        switch (id){
            case R.id.toggle_button:
                toggleButtonValue = isChecked;
                message = isChecked ? "Toggle Button is on" : "Toggle Button is off";
                break;

            case R.id.toggle_switch:
                toggleSwitchValue = isChecked;
                message = isChecked ? "Switch is on" : "Switch is off";
                break;
        }

        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();

    }


}
