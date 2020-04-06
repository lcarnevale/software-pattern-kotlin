package com.examples.abstractfactory.domain

/**
 * Interface where the Abstract Factory is defined.
 *
 * @author [Lorenzo Carnevale](mailto:lorenzocarnevale@gmail.com)
 */
interface AbstractFactory {

    /**
     * For more details, give a look at the overrode method.
     */
    fun useIt()

    companion object {
        fun getInstance(): AbstractFactory {
            return AbstractFactoryImpl()
        }
    }

}
