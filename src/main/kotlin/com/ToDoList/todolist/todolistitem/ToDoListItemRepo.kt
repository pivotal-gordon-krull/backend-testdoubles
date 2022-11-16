package com.ToDoList.todolist.todolistitem

import org.springframework.stereotype.Repository

interface ToDoListItemRepo {
    fun getToDoList():List<String>
}

@Repository
class ToDoListItemRepoImpl : ToDoListItemRepo{
    override fun getToDoList(): List<String> {
        return listOf("Buy groceries", "Watch Boat Race")
    }
}
