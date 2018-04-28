package com.example.ji.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Fragment1 fragment1;
    Fragment2 fragment2;

    public Button btn_frag1;
    public Button btn_frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setListener();
    }

    public void init() {
        btn_frag1=(Button)findViewById(R.id.btnT1);
        btn_frag2=(Button)findViewById(R.id.btnT2);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
    }

    private void setListener()
    {
        btn_frag1.setOnClickListener(new View.OnClickListener() { //if TAB1 is clicked
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_for_fragment, fragment1).commit();
            }
        });

        btn_frag2.setOnClickListener(new View.OnClickListener() { //if TAB2 is clicked
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_for_fragment, fragment2).commit();
            }
        });
    }
}

