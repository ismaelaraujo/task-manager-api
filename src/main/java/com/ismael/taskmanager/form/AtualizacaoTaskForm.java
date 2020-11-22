package com.ismael.taskmanager.form;

import com.ismael.taskmanager.model.Status;
import com.ismael.taskmanager.model.Task;
import com.ismael.taskmanager.repository.TaskRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class AtualizacaoTaskForm {

	private String titulo;
	private String descricao;
	private Status status;
	
	public Task atualizar(Long id, TaskRepository taskRepository) {
		Task task = taskRepository.getOne(id);
		task.setTitulo(this.getTitulo());
		task.setDescricao(this.getDescricao());
		task.setStatus(this.getStatus());
		return task;
	}
	
}
