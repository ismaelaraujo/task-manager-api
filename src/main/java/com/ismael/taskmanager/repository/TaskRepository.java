package com.ismael.taskmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismael.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByTitulo(String titulo);
}
