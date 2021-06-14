package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	@BeforeEach
	void setUp() {
	}

	@Test
	void testZeroSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",5);
		assertEquals("0:05", track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",25);
		assertEquals("0:25", track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",60);
		assertEquals("1:00", track.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",65);
		assertEquals("1:05", track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",85);
		assertEquals("1:25", track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",120);
		assertEquals("2:00", track.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",125);
		assertEquals("2:05", track.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Artist artist = new Artist("Alec Benjamin");
		Track track = new Track(artist,"Two Windows",145);
		assertEquals("2:25", track.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		Artist artistM = new Artist("Anitta");
		Artist artist1 = new Artist("Becky G");
		List<Artist> colabs = new ArrayList<>();
		
		colabs.add(artist1);
		
		CollaborationTrack track = new CollaborationTrack(artistM,"Bang",500,colabs);
		
		assertEquals(track.getFullArtistName(), "Anitta (feat. Becky G)");
	}

	@Test
	void testTwoCollaborators() {
		Artist artistM = new Artist("Anitta");
		Artist artist1 = new Artist("Ludmilla");
		Artist artist2 = new Artist("Snoop Dog");
		List<Artist> colabs = new ArrayList<>();
		
		colabs.add(artist1);
		colabs.add(artist2);
		
		CollaborationTrack track = new CollaborationTrack(artistM,"Bang",500,colabs);
		
		assertEquals(track.getFullArtistName(), "Anitta (feat. Ludmilla,Snoop Dog)");
	}
}
