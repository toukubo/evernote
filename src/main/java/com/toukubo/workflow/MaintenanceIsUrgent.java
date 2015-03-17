package com.toukubo.workflow;

import com.toukubo.e2h.Tagging;

public class MaintenanceIsUrgent {
	public MaintenanceIsUrgent(){
		new Tagging("+urgent", "-tag:+urgent tag:+maintenance");
	}
}
