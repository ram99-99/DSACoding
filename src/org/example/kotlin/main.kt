package org.example.kotlin

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000)
        println("Task done")
    }
    println("Main thread")
}