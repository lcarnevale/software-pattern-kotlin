package com.examples.singleton.domain

/**
 * Interface where the Singleton is defined.
 *
 * @author [Lorenzo Carnevale](mailto:lorenzocarnevale@gmail.com)
 */
interface SingletonPattern {

    /**
     * For more details, give a look at the overrode method.
     */
    fun useIt()

    companion object {
        private var singletonPattern: SingletonPattern? = null
        fun getInstance(): SingletonPattern {
            if ( singletonPattern == null )
                singletonPattern =
                    SingletonPatternImpl()
            return singletonPattern!!
        }
    }

}