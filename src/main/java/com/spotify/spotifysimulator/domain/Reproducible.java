package com.spotify.spotifysimulator.domain;

import java.time.Duration;

public interface Reproducible {

    public Duration calculateDuration(Duration duration);

    public Duration getDuration();
}
