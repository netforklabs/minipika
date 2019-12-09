package com.poseidon.model.timer;

import com.poseidon.framework.timer.Timer;
import com.poseidon.framework.timer.TimerManager;

/**
 * Create by 2BKeyboard on 2019/12/6 22:21
 */
public class TimerExample {

    public static void main(String[] args) {
        TimerManager manager = TimerManager.getManager();
        Timer timer1 = new Timer1();
        Timer timer2 = new Timer2();
        manager.submit(timer1);
        manager.submit(timer2);
    }

}
