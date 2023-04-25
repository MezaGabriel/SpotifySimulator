package com.spotify.spotifysimulator.domain;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Reproducible{

    private String name;
    private Duration duration;
    private List<Reproducible> playlist;

    public Playlist(String name) {
        this.name = name;
        this.duration = Duration.ofMinutes(0);
        this.playlist = new ArrayList<>();
    }

    public void importMusic(Reproducible obj){
            playlist.add(obj);
            this.duration = calculateDuration(obj.getDuration());
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
        for(Reproducible track : playlist){
            duration = getDuration().plus(track.getDuration());
        }
        return duration;
    }
}
