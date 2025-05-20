package com.utfpr_fpoo.semaphore.control.simple;

import java.time.LocalTime;

import com.utfpr_fpoo.semaphore.util.TurnOnOff;

public interface SemaphoreControl extends TurnOnOff {

    void setGreenSeconds(int seconds);
    void setYellowSeconds(int seconds);
    void setRedSeconds(int seconds);

    void setAlertPeriod(LocalTime start,
                        LocalTime end);
}