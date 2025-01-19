package ru.evolinc.core

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

interface MainApp {

    fun getCommunicatorsManager(): CommunicatorsManager
}

fun FragmentActivity.getCommunicatorsManager(): CommunicatorsManager {
    return (application as MainApp).getCommunicatorsManager()
}

fun Fragment.getCommunicatorsManager(): CommunicatorsManager {
    return (requireActivity().application as MainApp).getCommunicatorsManager()
}