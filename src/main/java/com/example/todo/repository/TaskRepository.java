package com.example.todo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.todo.entity.Task;
import com.example.todo.mapper.TaskMapper;


/**
 * タスク情報にアクセスするためのリポジトリクラスです。
 */
@Repository
public class TaskRepository {
	
	private final TaskMapper taskMapper;
	
	/**
     * コンストラクタ
     *
     * @param taskMapper タスクデータへのマッパー
     */
    public TaskRepository(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    /**
     * 全てのタスクを取得します。
     *
     * @return タスクのリスト
     */
    public List<Task> findAll() {
        return taskMapper.findAll();
    }

}

