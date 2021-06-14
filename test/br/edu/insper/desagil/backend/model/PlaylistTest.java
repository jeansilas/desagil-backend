package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;

	@BeforeEach
	void setUp() {
	}

	@Test
	void testRoundDownToZero() {
		Playlist play = new Playlist(1);
		play.putRating("Jean", 1);
		play.putRating("Joyce", 2);
		play.putRating("Cintia", 3);
		play.putRating("Raquel", 3);
		assertEquals(play.averageRatings(), 2.0,DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		Playlist play = new Playlist(1);
		play.putRating("Jean", 1);
		play.putRating("Joyce", 2);
		play.putRating("Cintia", 1);
		assertEquals(play.averageRatings(), 1.5,DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		Playlist play = new Playlist(1);
		play.putRating("Jean", 1);
		play.putRating("Joyce", 2);
		play.putRating("Cintia", 2);
		assertEquals(play.averageRatings(), 2.5,DELTA);
	}

	@Test
	void testRoundUpToOne() {
		Playlist play = new Playlist(1);
		play.putRating("Jean", 1);
		play.putRating("Joyce", 2);
		play.putRating("Cintia", 2);
		play.putRating("Raquel", 3);
		assertEquals(play.averageRatings(), 2.0,DELTA);
	}
}
