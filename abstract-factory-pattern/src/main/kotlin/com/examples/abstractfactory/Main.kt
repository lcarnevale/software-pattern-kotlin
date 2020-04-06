package com.examples.abstractfactory

import com.examples.abstractfactory.domain.AbstractFactory

fun main(args: Array<String>) {
    val iterations = 0..5
    for ( iteration in iterations ) {
        val singletonPattern = AbstractFactory.getInstance()
        singletonPattern.useIt()
    }
}