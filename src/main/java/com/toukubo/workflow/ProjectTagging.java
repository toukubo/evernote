package com.toukubo.workflow;

import java.util.List;

import com.toukubo.e2h.Notebook;
import com.toukubo.e2h.Tagging;

public class ProjectTagging {
	public ProjectTagging(com.evernote.edam.type.Notebook notebook) {
		String  notebookName = notebook.getName();
		String cleanName = removeDelString(notebookName);
		String query = "notebook:"+notebookName + " -tag:"+cleanName;
		new Tagging(cleanName,query );
		new MoveNotesOfANotebook(notebook);

	}
	public ProjectTagging(){
		Notebook notebookPreperator = new Notebook();
		notebookPreperator.reloadNotebooksToCache();
		List<com.evernote.edam.type.Notebook> notebooks = Notebook.getEvernoteNotebooks();
		for (com.evernote.edam.type.Notebook notebook : notebooks) {
			System.err.println(notebook.getName());
			if(!isInExcludeList(notebook)){
				new ProjectTagging(notebook);
			}
			
		}
	}
	private boolean isInExcludeList(com.evernote.edam.type.Notebook notebook) {
		String[] excluded = getExcludeProject();
		for (String string : excluded) {
			if(notebook.getName().equals(string)){
				return true;
			}
		}
		return false;
	}
	public String[] getExcludeProject(){
		return new String[]{"apcarchive","nodefieldScrfeenshots","Tools","Archive","EverMemo","Transcribe","DOODRI","IFTTT Dropbox","Tumblr","Cilantro","Skitch","Postach.io","Clipboard","FromInbox","inbox","nodefieldScrfeenshots","clientarchived","Readlater","tumblr-drafts","semi-inbox","me"};
	}

	public static void main(String[] args) {
		new ProjectTagging();
	}
	public static String removeDelString(String notebookName) {
		return notebookName.replaceAll("\\.del", "");
	}
}
