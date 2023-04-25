package com.spotify.spotifysimulator.domain;

import java.time.Duration;

public class Track implements Reproducible {

    private String name;
    private Duration duration;

    public Track(String name, String minutes, String seconds) {
        this.name = name;
        this.duration = Duration.parse("PT" + minutes + "M" + seconds + "S");
    }

    public Duration getDuration() {
        return duration;
    }

    @Override
    public Duration calculateDuration(Duration duration) {
        return duration;
    }
}
