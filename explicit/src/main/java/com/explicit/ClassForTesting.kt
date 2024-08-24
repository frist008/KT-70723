package com.explicit

import androidx.annotation.VisibleForTesting

public class ClassForTesting {

    // TODO KT-70723 Feature request
    //  @VisibleForTesting
    //  fun doSomething(): Nothing {
    //      throw RuntimeException()
    //  }

    // Expect behavior: Don't work
    @VisibleForTesting
    private fun doSomethingPrivate(): Nothing {
        throw RuntimeException()
    }

    // Incorrect encapsulation
    @VisibleForTesting
    internal fun doSomethingInternal(): Nothing {
        throw RuntimeException()
    }

    // Incorrect encapsulation
    @VisibleForTesting
    public fun doSomethingPublic(): Nothing {
        throw RuntimeException()
    }
}