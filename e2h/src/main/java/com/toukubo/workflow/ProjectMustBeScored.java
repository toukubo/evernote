package com.toukubo.workflow;

import com.toukubo.e2h.Tagging;

public class ProjectMustBeScored {
	public ProjectMustBeScored(){
		new Tagging("-scored", "-tag:+scored tag:+project");
	}
}
