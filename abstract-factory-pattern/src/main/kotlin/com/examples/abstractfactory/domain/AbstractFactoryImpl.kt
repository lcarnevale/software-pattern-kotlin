package com.examples.abstractfactory.domain

/**
 * Implementation of the Abstract Factory.
 *
 * @author [Lorenzo Carnevale](mailto:lorenzocarnevale@gmail.com)
 */
class AbstractFactoryImpl: AbstractFactory {

    init {
        println("The AbstractFactory is instanced")
    }

    override fun useIt() {
        println("... and I use it.")
    }

}