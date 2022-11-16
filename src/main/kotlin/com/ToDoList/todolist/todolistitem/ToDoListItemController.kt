package com.ToDoList.todolist.todolistitem

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todolist")
class ToDoListItemController(val toDoListItemService: ToDoListItemService) {

    @GetMapping
    fun getToDoList(): List<String> {
        return toDoListItemService.getToDoList()
    }
}