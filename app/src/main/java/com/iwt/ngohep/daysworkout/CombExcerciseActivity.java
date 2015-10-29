package com.iwt.ngohep.daysworkout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by PEHONG on 29/10/2015.
 */
public class CombExcerciseActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView _1_txvw_11;
    private Button   _1_bttn_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combination);

        _1_txvw_11 = (TextView) findViewById(R.id._1_txvw_11);
        _1_bttn_11 = (Button)   findViewById(R.id._1_bttn_11);

        _1_txvw_11.setText(Html.fromHtml("This session consists of 4 Main Movements (Push ups, Squats, Sit ups and Lunges)<br /><br /><b>Push Ups</b><br />1. Muscle Body Shaping<br />2. Strengthening Abdominal Muscles<br />3. Helps Bone Strength<br />4. Muscle Strength Chest<br />5. Increase Muscle Mass Bicep and Tricep<br />6. Stabilizing Muscles Shoulder<br />7. Establish Stomach<br />8. Improving Posture<br />9. Balancing Body Size<br />10. Exercising Muscles Heart<br />11. Increase Breast Size<br />12. Increase Metabolism System<br />13. Endurance Training Body<br />14. Exercise Routine for Diet<br />15. Preventing Osteoporosis<br /><br /><b>Squats</b><br />1. Burn calories<br />2. Establish the muscles throughout the body<br />3. Increase muscle mass<br />4. Make the other activities easier<br />5. Improve balance and strength<br />6. Prevent injury<br />7. Improve your athletic performance<br />8. Increase metabolism<br /><br /><b>Sit Ups</b><br />1. Maintain Stability Body Movement<br />2. Balancing Body<br />3. Maintain Body Health<br />4. Keeping System Metabolism<br />5. Keeping Digestion<br />6. Maintain Posture<br />7. Maintain Healthy Muscle<br />8. Smooth Circulatory<br />9. Helps Relieve Lower Back Pain<br />10. Assist Formation Physical<br />11. Lose Fat in the Body<br />12. Establishment of Hips<br />13. Establish Chest Muscles<br />14. Maintaining Healthy Bones and Muscles<br />15. Extend Life Expectancy<br /><br /><b>Lunges</b><br />1. Body Balance<br />2. Maintain Mobility<br />3. Prevent Injuries<br />4. Strengthen Joints"));

        _1_bttn_11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainCombinationActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
