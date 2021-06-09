package com.app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.app.dto.Task;

public class TaskServiceImpl implements TaskService {

	List<Task> taskList = new ArrayList<Task>();

	public TaskServiceImpl() {

		for (int i = 1; i <= 5; i++) {
			Task task = new Task();

			task.setDescription("TASK-" + i);
			;

			long runTime = new Date().getTime() + 10 * i;

			task.setTaskStartTime(new Date(runTime));
			taskList.add(task);
		}

	}

	public Task findTask(final String taskName) {

		System.out.println("findTask() - start");

		Optional<Task> taskOption = taskList.stream().filter(task -> {
			return task.getDescription().equalsIgnoreCase(taskName);
		}).findFirst();

		Task task = taskOption.get();

		System.out.println("findTask() - end");
		return task;
	}

}
