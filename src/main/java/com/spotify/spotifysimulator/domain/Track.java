package com.spotify.spotifysimulator.domain;

import java.time.Duration;
import java.time.LocalTime;

public class Track extends Time{

    private String name;

    public Track(String name, int second, int minute, int hour) {
        super(second, minute, hour);
        this.name = name;
    }

    public Track() {}

    public LocalTime getDuration() {
        return time;
    }

    public LocalTime calculateTime(LocalTime increase) {
        LocalTime defaultValue = LocalTime.of(0, 0, 0);
        LocalTime resp = increase.plus(Duration.between(defaultValue, getDuration()));
        return resp;
    }
}
