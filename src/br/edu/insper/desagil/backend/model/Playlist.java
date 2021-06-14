package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String,Integer> ratings;
	
	public Playlist(int id) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String nome, int rate) {
		this.ratings.put(nome, rate);
	}
	
	public double averageRatings() {
		double avg = 0.0;
		for (int value: this.ratings.values()) {
			avg = avg + value;
		}
		
		avg = avg/this.ratings.size();
		
		int i = (int) avg;
		double d = avg - i;
		
		double finalRating = i;
		
		if (d < 0.26) {
			finalRating = finalRating + 0.0;
		}
		
		else if (d >= 0.26 && d < 0.74) {
			finalRating = finalRating + 0.5;
		}
		
		else if (d >= 0.74) {
			finalRating = finalRating + 1.0;
		}
		
		return finalRating;
		
	}
	
}
