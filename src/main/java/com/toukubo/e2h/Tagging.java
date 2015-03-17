package com.toukubo.e2h;

import java.util.Collection;

public class Tagging {
	public Tagging(String tag,String query){
		Collection<com.toukubo.e2h.Note> notes = new Notes(query).getOurNotes();
		for (Note note : notes) {
			note.addTag(tag);
		}
	}
}
