/*
 * Created by Tareq Islam on 8/7/18 10:46 PM
 *
 *  Last modified 8/7/18 10:29 PM
 */

package com.mti.pushdown_extsingleclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mti.pushdown_ext_onclick_single.PushDownAnim;
import com.mti.pushdown_ext_onclick_single.SingleClick;

public class MainActivity extends AppCompatActivity {

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Without animation

        /*
        SingleClick.get(findViewById(R.id.mButton)).setOnSingleClickListener(v -> {
            Toast.makeText(MainActivity.this, "Clicked "+ i, Toast.LENGTH_SHORT).show();
            i++;
        });
        */


        // With animation
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.mButton)).setOnSingleClickListener(v -> {
            Toast.makeText(MainActivity.this, "Clicked "+ i, Toast.LENGTH_SHORT).show();
            i++;
        });
    }
}
