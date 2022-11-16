package com.ToDoList.todolist.todolistitem

import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.stereotype.Service

interface ToDoListItemService {
    fun getToDoList(): List<String>
}
@Service
class ToDoListItemServiceImpl(val toDoListItemRepo: ToDoListItemRepo):ToDoListItemService{
    override fun getToDoList(): List<String> {
        return toDoListItemRepo.getToDoList()
    }
}