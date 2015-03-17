package com.toukubo.workflow;
import java.util.Collection;

import com.evernote.edam.type.Notebook;
import com.toukubo.e2h.Note;
import com.toukubo.e2h.Notes;
public class MoveNotesOfANotebook{
	public MoveNotesOfANotebook(Notebook notebook) {
		if(notebook.getName().endsWith("del")){
			String cleanName = ProjectTagging.removeDelString(notebook.getName());
			String query = "notebook:"+notebook.getName() + " tag:"+cleanName;

			Collection<com.toukubo.e2h.Note> notes = new Notes(query).getOurNotes();
			for (Note note : notes) {
				note.moveToArchiveTag();
			}
		}
	}
}
