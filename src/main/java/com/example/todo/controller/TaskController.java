package com.example.todo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.todo.entity.Task;
import com.example.todo.service.TaskService;


/**
 * Webアプリケーションのタスク関連機能を担当するControllerクラスです。
 * タスクの一覧表示、登録、変更などの機能が含まれています。
 *
 */
@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * タスクの一覧を表示するメソッドです。
     * 
     * @param model タスク一覧をViewに渡すためのSpringのModelオブジェクト
     * @return "task/index" - タスク一覧表示用のHTMLテンプレートのパス
     */
	//@RequestMapping(value = "/task/list", method = RequestMethod.GET)
	@GetMapping("/task/list")
	public String showTask(Model model) {
		System.out.println("★★ list controller called ★★");
		//タスクの一覧を取得
		List<Task> taskList = taskService.findAll();		
		model.addAttribute("taskList", taskList);
		
		return "task/index";
	}

}


