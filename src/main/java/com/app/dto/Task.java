package com.app.dto;

import java.util.Date;

public class Task {

	private String description;

	private Date taskStartTime;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	@Override
	public String toString() {
		return "Task [description=" + description + ", taskStartTime=" + taskStartTime + "]";
	}

}
