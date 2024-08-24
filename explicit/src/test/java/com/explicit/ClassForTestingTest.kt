package com.explicit

import org.junit.Assert.assertThrows
import org.junit.Test


class ClassForTestingTest {

    private val classFotTesting = ClassForTesting()

    // TODO KT-70723 Feature request
    //  @Test
    //  fun `test doSomething`() {
    //      assertThrows(RuntimeException::class.java) {
    //          classFotTesting.doSomething()
    //      }
    //  }

    @Test
    fun `test doSomethingPrivate`() {
        // Expect behavior: Don't work
        // assertThrows(RuntimeException::class.java) {
        //     classFotTesting.doSomethingPrivate()
        // }
    }

    @Test
    fun `test doSomethingInternal`() {
        assertThrows(RuntimeException::class.java) {
            // Incorrect encapsulation
            classFotTesting.doSomethingInternal()
        }
    }

    @Test
    fun `test doSomethingPublic`() {
        assertThrows(RuntimeException::class.java) {
            // Incorrect encapsulation
            classFotTesting.doSomethingPublic()
        }
    }
}