package com.example.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    RadioGroup rad_grp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rad_grp = findViewById(R.id.rad_grp);
        rad_grp.clearCheck();


        rad_grp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = group.findViewById(checkedId);
                if (null != rb && checkedId > -1)
                {
                    Toast.makeText(MainActivity.this,rb.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}