package com.poseidon.model.timer;

import com.poseidon.framework.timer.Timer;
import com.poseidon.framework.tools.TimeUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Create by 2BKeyboard on 2019/12/9 11:19
 */
public class Timer2 implements Timer {

    private int count;

    @Override
    public void run() {
        if(count == 2){
            ArrayList a = null;
            a.clear();
        }
        System.err.println("timer2");
        count++;
    }

    @Override
    public long time() {
        return TimeUtils.SECOND * 2;
    }
}
