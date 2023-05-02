/*
 * Created by Tareq Islam on 8/8/18 12:31 AM
 *
 *  Last modified 8/8/18 12:26 AM
 */

/*
 * Created by Tareq Islam on 8/8/18 12:31 AM
 *
 *  Last modified 8/8/18 12:26 AM
 */

/*
 * Created by Tareq Islam on 8/8/18 12:01 AM
 *
 *  Last modified 8/8/18 12:01 AM
 */

package com.mti.pushdown_ext_onclick_single;

import android.os.SystemClock;
import android.view.View;

import java.lang.ref.WeakReference;

/***
 * Created by Tareq on 08,August,2018.
 */
public class SingleClick {


    private WeakReference<View> weakView;

    public SingleClick(View view) {
        this.weakView = new WeakReference<>(view);
        this.weakView.get().setClickable(true);
    }

    //first we need to access the view

    public static SingleClick get(View view) {
        SingleClick singleClick = new SingleClick(view);
        return singleClick;
    }


    private long mLastClickTime = 0; //just for resoving fast double click crash issue for DateTime Dialog

    public SingleClick setOnSingleClickListener(final View.OnClickListener onClickListener) {
        if (weakView.get() != null) {


            weakView.get().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // mis-clicking prevention, using threshold of 1000 ms
                    if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                        return;
                    }
                    mLastClickTime = SystemClock.elapsedRealtime();


                    //Do your things write here

                    onClickListener.onClick(v);
                }
            });

        }
        return this;
    }
}


