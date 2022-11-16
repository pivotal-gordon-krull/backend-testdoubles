package com.ToDoList.todolist.todolistitem

import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders


class ToDoListItemControllerTests {

    lateinit var stubToDoListItemService: StubToDoListItemService
    lateinit var mockMvc: MockMvc

    @BeforeEach
    fun setUp() {
        stubToDoListItemService = StubToDoListItemService()
        mockMvc = MockMvcBuilders.standaloneSetup(ToDoListItemController(stubToDoListItemService)).build()
    }

    @Test
    internal fun getToDoList_returns200() {
        mockMvc.perform(get("/todolist")).andExpect(status().isOk)
    }

    @Test
    internal fun getToDoList_returnsEmptyList() {
        mockMvc.perform(get("/todolist")).andExpect(jsonPath("$.size()", equalTo(0)))
    }

    @Test
    internal fun getToDoList_returnsToDoListItems() {
        // given
        stubToDoListItemService.getToDoList_returnValue = listOf("Buy groceries", "Watch Boat Race")

        //when
        mockMvc.perform(get("/todolist"))

        //then
                .andExpect(jsonPath("$.size()", equalTo(2)))
                .andExpect(jsonPath("$[0]", equalTo("Buy groceries")))
                .andExpect(jsonPath("$[1]", equalTo("Watch Boat Race")))
    }
}