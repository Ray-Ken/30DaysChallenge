package com.iwt.ngohep.daysworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout _1_menu_11;
    private RelativeLayout _1_menu_12;
    private RelativeLayout _1_menu_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        _1_menu_11 = (RelativeLayout) findViewById(R.id._1_rvly_11);
        _1_menu_12 = (RelativeLayout) findViewById(R.id._1_lnly_11);
        _1_menu_13 = (RelativeLayout) findViewById(R.id._1_rvly_13);

        _1_menu_11.setOnClickListener(this);
        _1_menu_12.setOnClickListener(this);
        _1_menu_13.setOnClickListener(this);
    }

    @Override
    public void onClick(View pView) {
        if (pView.equals(_1_menu_11)) {
            Intent intent = new Intent(this, CombExcerciseActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            Toast.makeText(HomeActivity.this, "Coming Soon !", Toast.LENGTH_SHORT).show();
        }
    }
}
