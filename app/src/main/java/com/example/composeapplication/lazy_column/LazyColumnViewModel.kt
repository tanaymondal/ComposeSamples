package com.example.composeapplication.lazy_column

import androidx.lifecycle.ViewModel

class ComposeViewModel : ViewModel() {
    var list = mutableListOf<Message>()
        private set

    init {
        List(30) { i ->
            list.add(Message(id = i, name = "Tanay $i", message = "Hey.. What's up?"))
        }
    }
}

data class Message(
    val id: Int,
    val name: String,
    val message: String,
    var isSelected: Boolean = false
)