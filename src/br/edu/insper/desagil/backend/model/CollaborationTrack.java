package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;
	
	public CollaborationTrack(Artist artist,String name, double duration, List<Artist> collaborators) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	@Override
	public String getFullArtistName() {
		List<String> collab = new ArrayList<>();
		for (Artist col: this.collaborators) {
			collab.add(col.getName());
		}
		String collabs = String.join(",", collab);
		
		String nome = this.artist.getName();
		
		return nome+ " (feat. "+ collabs+")";
	}
	
	
}
