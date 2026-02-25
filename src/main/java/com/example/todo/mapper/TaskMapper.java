package com.example.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.todo.entity.Task;

/**
 * タスクエンティティにアクセスするための MyBatis マッパーインターフェースです。
 */
@Mapper
public interface TaskMapper {
	
    /**
     * 全てのタスクを取得します。
     *
     * @return タスクのリスト
     */
    List<Task> findAll();
}