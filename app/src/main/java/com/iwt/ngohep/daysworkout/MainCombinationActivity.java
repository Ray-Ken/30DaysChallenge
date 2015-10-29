package com.iwt.ngohep.daysworkout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.iwt.ngohep.daysworkout.component.CircleButton;

/**
 * Created by PEHONG on 29/10/2015.
 */
public class MainCombinationActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private CheckBox _1_chbx_21;
    private CheckBox _1_chbx_22;
    private CheckBox _1_chbx_23;
    private CheckBox _1_chbx_24;
    private TextView _1_txvw_21;
    private TextView _1_txvw_22;
    private TextView _1_txvw_23;
    private TextView _1_txvw_24;
    private CircleButton _1_clbt_11;

    private int checkedCount = 0;
    private int maxChecked = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_combination);

        _1_chbx_21 = (CheckBox) findViewById(R.id._1_chbx_21);
        _1_chbx_22 = (CheckBox) findViewById(R.id._1_chbx_22);
        _1_chbx_23 = (CheckBox) findViewById(R.id._1_chbx_23);
        _1_chbx_24 = (CheckBox) findViewById(R.id._1_chbx_24);

        _1_txvw_21 = (TextView) findViewById(R.id._1_txvw_21);
        _1_txvw_22 = (TextView) findViewById(R.id._1_txvw_22);
        _1_txvw_23 = (TextView) findViewById(R.id._1_txvw_23);
        _1_txvw_24 = (TextView) findViewById(R.id._1_txvw_24);

        _1_clbt_11 = (CircleButton) findViewById(R.id._1_clbt_11);

        _1_chbx_21.setOnCheckedChangeListener(this);
        _1_chbx_22.setOnCheckedChangeListener(this);
        _1_chbx_23.setOnCheckedChangeListener(this);
        _1_chbx_24.setOnCheckedChangeListener(this);

        _1_clbt_11.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            checkedCount++;
        } else {
            checkedCount--;
        }

        if (checkedCount == maxChecked) {
            _1_clbt_11.setColor(getResources().getColor(android.R.color.holo_green_light));
        } else {
            _1_clbt_11.setColor(getResources().getColor(android.R.color.darker_gray));
        }
    }

    @Override
    public void onClick(View v) {
        if (checkedCount == maxChecked) {
            Toast.makeText(MainCombinationActivity.this, "Good you have complete it all", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainCombinationActivity.this, "Please complete all of your moves", Toast.LENGTH_SHORT).show();
        }
    }
}
