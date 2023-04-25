package com.spotify.spotifysimulator.domain;

import java.time.Duration;
import java.util.List;

public class Album implements Reproducible {

    private String name;
    private Duration duration;
    private List<Track> album;

    public Album(String name, List<Track> album) {
        this.name = name;
        this.album = album;
        this.duration = calculateDuration(Duration.ofMinutes(0));
    }

    public String getTime() {
        return duration.toHoursPart() + ":" + duration.toMinutesPart() + ":" + duration.toSecondsPart();
    }

    @Override
    public Duration getDuration() {
        return duration;
    }

    @Override
    public Duration calculateDuration(Duration duration) {
        for(Track tracks : album){
            duration = tracks.getDuration().plus(duration);
        }
        return duration;
    }
}
