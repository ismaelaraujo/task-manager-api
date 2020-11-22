package com.ismael.taskmanager.form;

import com.ismael.taskmanager.model.Task;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TaskForm {
	
	private String titulo;
	private String descricao;
	
	public Task converter() {
		return new Task(titulo, descricao);
	}

}
