package ru.evolinc.mainapi.communicator

import ru.evolinc.corejava.FragmentActivityStub
import ru.evolinc.mainapi.domain.MainLoadMainResponseUseCase

interface MainCommunicator {

    val mainLoadMainResponseUseCase: MainLoadMainResponseUseCase

    fun openMainScreen(fragmentActivityStub: FragmentActivityStub)
}