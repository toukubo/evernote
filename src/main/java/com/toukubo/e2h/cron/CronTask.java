package com.toukubo.e2h.cron;

import java.util.Date;

import com.toukubo.workflow.DeleteNotebook;
import com.toukubo.workflow.NodesTobeLinked;
import com.toukubo.workflow.ProjectIsNode;
import com.toukubo.workflow.ProjectMustBeScored;
import com.toukubo.workflow.ProjectTagging;
import com.toukubo.workflow.ResourceTagging;
import com.toukubo.workflow.TagVarientsFix;

public class CronTask implements Runnable {

	public void run() {
		System.out.println(new Date()+": Hello cron4j!");
		NodesTobeLinked nodesTobeLinked = new NodesTobeLinked();
		ProjectTagging projectTagging  = new ProjectTagging();
		ResourceTagging resourceTagging = new ResourceTagging();
		ProjectIsNode projectIsNode  = new ProjectIsNode();
		ProjectMustBeScored projectMustBeScored = new ProjectMustBeScored();
		TagVarientsFix tagVarientsFix = new TagVarientsFix();
		
//		DeleteNotebook deleteNotebook = new DeleteNotebook(null);
		
	}
	public static void main(String[] args) {
		CronTask cronTask = new CronTask();
		cronTask.run();
	}

}
