package com.app.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.app.dto.Task;

public class TaskServiceImplTest {

	private TaskServiceImpl impl;

	@Before
	public void setUp() {
		impl = new TaskServiceImpl();

	}

	@Test
	public void testFindTask() {
		Task task = impl.findTask("TASK-1");
		assertNotNull(task);
	}
}
