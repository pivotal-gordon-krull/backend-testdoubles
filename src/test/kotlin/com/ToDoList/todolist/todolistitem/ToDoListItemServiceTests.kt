package com.ToDoList.todolist.todolistitem

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ToDoListItemServiceTests {

    lateinit var  stubToDoListItemRepo: StubToDoListItemRepo
    lateinit var  service: ToDoListItemService

    @BeforeEach
    fun setup(){
        stubToDoListItemRepo = StubToDoListItemRepo()
        service = ToDoListItemServiceImpl(stubToDoListItemRepo)
    }

    @Test
    fun getToDoListItem_returnsEmptyList(){
        //when
        val result = service.getToDoList()

        //then
        assertEquals(result.size, 0)
    }

    @Test
    fun getToDoListItem_returnsToDoListItems(){
        // given
        stubToDoListItemRepo.getToDoList_returnValue = listOf("Buy groceries", "Watch Boat Race")

        // when
        val result = service.getToDoList()

        // then
        assertEquals(result.size,2)
        assertEquals(result[0],"Buy groceries")
        assertEquals(result[1],"Watch Boat Race")

    }
}