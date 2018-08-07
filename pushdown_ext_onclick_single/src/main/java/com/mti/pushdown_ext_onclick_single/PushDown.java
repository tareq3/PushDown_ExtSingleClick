/*
 * Created by Tareq Islam on 8/7/18 10:41 PM
 *
 *  Last modified 8/7/18 10:41 PM
 */

package com.mti.pushdown_ext_onclick_single;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/***
 * Created by Tareq on 07,August,2018.
 */
public interface PushDown{
    PushDown setScale( float scale );

    PushDown setScale( @PushDownAnim.Mode int mode, float scale );

    PushDown setDurationPush( long duration );

    PushDown setDurationRelease( long duration );

    PushDown setInterpolatorPush( AccelerateDecelerateInterpolator interpolatorPush );

    PushDown setInterpolatorRelease( AccelerateDecelerateInterpolator interpolatorRelease );

    PushDown setOnClickListener( View.OnClickListener clickListener );

    PushDown setOnLongClickListener( View.OnLongClickListener clickListener );

    PushDown setOnTouchEvent( View.OnTouchListener eventListener );

    PushDown setOnSingleClickListener(View.OnClickListener clickListener);
}