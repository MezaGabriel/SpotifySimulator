package com.spotify.spotifysimulator.domain;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Album extends Track {

    private String name;
    private LocalTime duration;
    private List<Track> album;

    public Album(String name) {
        super();
        this.name = name;
        this.duration = LocalTime.of(0, 0, 0);
        this.album = new ArrayList<>();
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void addTrack(Track track) {
        duration = track.calculateTime(duration);
        album.add(track);
    }
}
