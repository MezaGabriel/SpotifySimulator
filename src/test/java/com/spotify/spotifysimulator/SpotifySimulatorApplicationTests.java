package com.spotify.spotifysimulator;

import com.spotify.spotifysimulator.domain.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SpotifySimulatorApplicationTests {

	@Test
	void addSongs() {

		// Creating Songs
		Track track = new Track("Imagine", 38, 2, 0);
		assertThat(track)
				.hasFieldOrPropertyWithValue("name", "Imagine");
		Track track2 = new Track("Riders on the Storm", 15, 1, 0);
		assertThat(track2)
				.hasFieldOrPropertyWithValue("name", "Riders on the Storm");
		Track track3 = new Track("12 Bar Original", 54, 4, 0);
		assertThat(track3)
				.hasFieldOrPropertyWithValue("name", "12 Bar Original");

		// Creating Albums And Playlists
		Album album = new Album("Gabo's Album");
		assertThat(album)
				.hasFieldOrPropertyWithValue("name", "Gabo's Album");
		Playlist playlist = new Playlist("Gabo's Playlist");
		assertThat(playlist)
				.hasFieldOrPropertyWithValue("name", "Gabo's Playlist");

		// Adding Some Songs To An Album
		album.addTrack(track);
		album.addTrack(track2);
		album.addTrack(track3);
		assertThat(album.getDuration())
				.isEqualTo("00:08:47");

		// Adding Some Things To A Playlist
		playlist.addTrack(album);
		playlist.addTrack(playlist);
		playlist.addTrack(track);
		playlist.addTrack(playlist);
		playlist.addTrack(track);
		assertThat(playlist.getDuration())
				.isEqualTo("00:43:02");
	}

}
