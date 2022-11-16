package com.ToDoList.todolist.todolistitem

class StubToDoListItemRepo: ToDoListItemRepo {
    var getToDoList_returnValue: List<String> = emptyList()

    override fun getToDoList(): List<String> {
        return getToDoList_returnValue
    }
}
