package com.ToDoList.todolist.todolistitem

class StubToDoListItemService: ToDoListItemService {
    var getToDoList_returnValue:List<String> = emptyList()

    override fun getToDoList(): List<String> {
        return getToDoList_returnValue
    }
}