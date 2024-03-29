package com

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com")
                .mainClass(Application.javaClass)
                .start()
    }
}