package com.jamile.easyspeak_v21;

import android.view.animation.Interpolator;

public class MyBounceInterpolator implements Interpolator {

    private double myAmplitude=1;
    private double myFrequence=10;

    MyBounceInterpolator(double amplitude, double frequency){

        myAmplitude=amplitude;
        myFrequence=frequency;

    }
    @Override
    public float getInterpolation(float time) {
        return (float)(-1*Math.pow(Math.E, - time/myAmplitude)*Math.cos(myFrequence*time)+1);
    }
}
