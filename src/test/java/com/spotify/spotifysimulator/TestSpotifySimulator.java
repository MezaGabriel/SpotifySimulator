package com.spotify.spotifysimulator;

import com.spotify.spotifysimulator.domain.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class TestSpotifySimulator {

	Track track1 = new Track("Imagine", "3", "25");
	Track track2 = new Track("Riders on the Storm", "5", "41");
	Track track3 = new Track("12 Bar Original", "2", "59");
	Album album = new Album("Gabo's Album",
		List.of(
				track1, track2, track3
		)
	);
	Playlist playlist = new Playlist("Gabo's Playlist");

	@Test
	void testSongs() {
		assertThat(track1)
				.hasFieldOrPropertyWithValue("name", "Imagine");

		assertThat(track2)
				.hasFieldOrPropertyWithValue("name", "Riders on the Storm");

		assertThat(track3)
				.hasFieldOrPropertyWithValue("name", "12 Bar Original");
	}

	@Test
	void testAlbums(){
		assertThat(album)
				.hasFieldOrPropertyWithValue("name", "Gabo's Album");
		assertThat(album.getTime())
				.isEqualTo("0:12:5");
	}

	@Test
	void testPlaylists(){
		playlist.importMusic(track1);
		playlist.importMusic(album);
		playlist.importMusic(track2);
		playlist.importMusic(playlist);
		playlist.importMusic(track3);
		assertThat(playlist)
				.hasFieldOrPropertyWithValue("name", "Gabo's Playlist");
		assertThat(playlist.getTime())
				.isEqualTo("0:45:21");
	}


}
