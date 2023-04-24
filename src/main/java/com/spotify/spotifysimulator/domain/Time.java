package com.spotify.spotifysimulator.domain;

import java.time.LocalTime;

public abstract class Time {

    protected LocalTime time;

    public Time(int second, int minute, int hour) {
        this.time = LocalTime.of(hour, minute, second);
    }

    public Time() {
        this(0, 0, 0);
    }
}
