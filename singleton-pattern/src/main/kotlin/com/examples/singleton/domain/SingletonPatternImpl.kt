package com.examples.singleton.domain

/**
 * Implementation of the Singleton.
 *
 * @author [Lorenzo Carnevale](mailto:lorenzocarnevale@gmail.com)
 */
class SingletonPatternImpl: SingletonPattern {

    init {
        println("The SingletonPattern is instanced")
    }

    override fun useIt() {
        println("... and I use it.")
    }

}