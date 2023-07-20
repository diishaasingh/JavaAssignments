package com.disha.SpringJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.disha.SpringJDBC.data.service.TodoDataService;
import com.disha.SpringJDBC.model.Todo;

@Component
public class ApplicationRunner implements CommandLineRunner {

	@Autowired
	private TodoDataService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started");
		service.insertTodo(new Todo("Todo1", false));
		service.insertTodo(new Todo("Todo2", true));
		service.insertTodo(new Todo("Todo3", true));
		System.out.println(service.retrieveAllTodos());

	}

}
