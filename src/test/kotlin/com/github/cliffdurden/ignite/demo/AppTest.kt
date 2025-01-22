package com.github.cliffdurden.ignite.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun appHasAGreeting() {
        val classUnderTest = App()
        Assertions.assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}