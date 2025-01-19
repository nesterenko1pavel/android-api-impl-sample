package ru.evolinc.core

import androidx.fragment.app.FragmentActivity
import ru.evolinc.corejava.FragmentActivityStub

fun FragmentActivityStub.retrieve(): FragmentActivity {
    return when (this) {
        is FragmentActivityStubImpl -> activity
        else -> throw IllegalStateException("Unable to retrieve activity from stub")
    }
}

fun FragmentActivity.asFragmentActivityStub(): FragmentActivityStub {
    return FragmentActivityStubImpl(this)
}

class FragmentActivityStubImpl(
    val activity: FragmentActivity,
) : FragmentActivityStub