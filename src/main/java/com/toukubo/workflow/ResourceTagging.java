package com.toukubo.workflow;

import com.toukubo.e2h.Tagging;

public class ResourceTagging {
	public ResourceTagging(){
		String resourceTag = "resource";
		new Tagging(resourceTag, "-tag:resource tag:ifttt tag:tumblr");
		new Tagging(resourceTag, "-tag:resource tag:ifttt tag:\"iOS Photos\"");
		new Tagging(resourceTag, "image/*");
		new Tagging(resourceTag, "notebook:tumblr-drafts");
//		new Tagging(resourceTag, "-tag:resource tag:ifttt");
//		new Tagging(resourceTag, "-tag:resource tag:ifttt");
	}
	public static void main(String[] args) {
		new ResourceTagging();
	}
}
