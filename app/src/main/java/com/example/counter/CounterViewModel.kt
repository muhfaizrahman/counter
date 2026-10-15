package com.example.counter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var counter by mutableIntStateOf(0)
        private set

    fun up() {
        counter++
    }

    fun down() {
        counter--
    }

    fun reset() {
        counter = 0
    }
}