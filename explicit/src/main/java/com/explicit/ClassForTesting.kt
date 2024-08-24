package com.explicit

import android.util.Log
import androidx.annotation.OpenForTesting
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

@OpenForTesting
public class OpenClassForTesting {

    // TODO KT-70723 Feature request
    //  @VisibleForTesting
    //  @OpenForTesting
    //  fun initSomePlatformingCode() {
    //      Log.d("tag", "message")
    //  }

    @VisibleForTesting
    @OpenForTesting
    private fun initSomePlatformingCodePrivate() {
        Log.d("tag", "message")
    }

    @VisibleForTesting
    @OpenForTesting
    protected fun initSomePlatformingCodeProtected() {
        Log.d("tag", "message")
    }

    @VisibleForTesting
    @OpenForTesting
    internal fun initSomePlatformingCodeInternal() {
        Log.d("tag", "message")
    }

    @VisibleForTesting
    @OpenForTesting
    public fun initSomePlatformingCodePublic() {
        Log.d("tag", "message")
    }
}

