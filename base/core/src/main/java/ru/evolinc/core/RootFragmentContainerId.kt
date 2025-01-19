package ru.evolinc.core

import androidx.annotation.IdRes

object RootFragmentContainerId {

    private var _rootContainerId: Int? = null
    val rootContainerId: Int by lazy { requireNotNull(_rootContainerId) }

    fun setRootFragmentContainerId(@IdRes idRes: Int) {
        if (_rootContainerId != null) throw IllegalAccessException("Unable to set root id twice")
        _rootContainerId = idRes
    }
}