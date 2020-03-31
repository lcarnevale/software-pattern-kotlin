package com.examples.singleton

import com.examples.singleton.domain.SingletonPattern

fun main(args: Array<String>) {
    val iterations = 0..5
    for ( iteration in iterations ) {
        val singletonPattern = SingletonPattern.getInstance()
        singletonPattern.useIt()
    }
}