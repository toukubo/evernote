package com.toukubo.workflow;

import com.toukubo.e2h.Tagging;

public class ProjectIsNode {
	public ProjectIsNode() {
		new Tagging("+node", "-tag:+node tag:+project");
	}
	public static void main(String[] args) {
		ProjectIsNode projectIsNode = new ProjectIsNode();
	}
}
