/*
 * Created by Tareq Islam on 8/7/18 10:46 PM
 *
 *  Last modified 8/7/18 10:29 PM
 */

package com.mti.pushdown_extsingleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mti.pushdown_ext_onclick_single.PushDownAnim;
import com.mti.pushdown_ext_onclick_single.SingleClick;

public class MainActivity extends AppCompatActivity {

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);













        //Todo: If you want only singleClick Listener without anim


        SingleClick.get(findViewById(R.id.mButton)).setOnSingleClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Clicked "+ i, Toast.LENGTH_SHORT).show();
                i++;
            }
        });


        //Todo: With Anim Single Click Listener
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.mButton)).setOnSingleClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Clicked "+ i, Toast.LENGTH_SHORT).show();
                i++;
            }
        });
    }
}
