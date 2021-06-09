package com.app;

import com.app.dto.Task;
import com.app.service.TaskServiceImpl;

public class Application {

	public static void main(String[] args) {
		TaskServiceImpl impl = new TaskServiceImpl();
		
		Task task = impl.findTask("TASK-1");
		
		
		System.out.println("task   -> 0"+task);
		
	}

}
