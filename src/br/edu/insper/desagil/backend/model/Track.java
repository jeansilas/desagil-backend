package br.edu.insper.desagil.backend.model;

public class Track {
	protected Artist artist;
	private String name;
	private double duration;
	
	public Track(Artist artist, String name, double duration) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public Artist getArtist() {
		return artist;
	}

	public double getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		int minuto = (int) this.duration/60  ;
		int segundo = (int) this.duration % 60;
		String minutoS = String.valueOf(minuto);
		String segundoS = String.valueOf(segundo);
		
		if (segundo < 10) {
			segundoS = "0"+segundoS;
		}
		
		String duration = minutoS+ ":"+ segundoS;
		
		return duration;
	}
	
	public String getFullArtistName() {
		return this.name;
	}
}
