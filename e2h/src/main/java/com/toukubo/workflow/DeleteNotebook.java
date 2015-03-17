package com.toukubo.workflow;

import java.util.Collection;

import com.evernote.edam.type.Notebook;
import com.toukubo.e2h.Notes;

public class DeleteNotebook {
	public DeleteNotebook(Notebook notebook){
		if(notebook.getName().endsWith("del")){
			String query = "notebook:"+notebook.getName();
			Collection<com.toukubo.e2h.Note> notes = new Notes(query).getOurNotes();
			if(notes.size()>0){
				
			}

		}
	}
}
