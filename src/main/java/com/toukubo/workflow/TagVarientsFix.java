package com.toukubo.workflow;

import com.toukubo.e2h.Tagging;

public class TagVarientsFix {
	
	public TagVarientsFix(){
		appendCommandTag("project");
		appendCommandTag("urgent");
		appendContextTag("readlater");
	}
	private void appendContextTag(String baseTag) {
		new Tagging("@"+baseTag, "tag:"+baseTag + " -tag:"+"@"+baseTag);
	}
	private void appendCommandTag(String baseTag) {
		new Tagging("+"+baseTag, "tag:"+baseTag + " -tag:"+"+"+baseTag);
	}
	public static void main(String[] args) {
		new TagVarientsFix();
	}
}
