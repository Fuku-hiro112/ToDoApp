package com.example.todo.service;

import java.util.List;

import com.example.todo.entity.Task;

/**
 * タスク関連のサービスを提供するインターフェースです。
 */
public interface TaskService {
	
    /**
     * すべてのタスクを取得します。
     *
     * @return タスクのリスト
     */
	List<Task> findAll();

}
