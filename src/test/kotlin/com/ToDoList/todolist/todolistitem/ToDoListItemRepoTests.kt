package com.ToDoList.todolist.todolistitem

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ToDoListItemRepoTests {

    lateinit var repository: ToDoListItemRepoImpl

    @BeforeEach
    internal fun setUp() {
        repository = ToDoListItemRepoImpl()
    }

    @Test
    internal fun getToDoList_returnsHardcodedValue() {
        assertEquals(repository.getToDoList(), listOf("Buy groceries", "Watch Boat Race"))
    }
}