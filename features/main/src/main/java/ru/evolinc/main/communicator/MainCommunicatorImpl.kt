package ru.evolinc.main.communicator

import ru.evolinc.core.RootFragmentContainerId.rootContainerId
import ru.evolinc.core.retrieve
import ru.evolinc.corejava.FragmentActivityStub
import ru.evolinc.main.presentation.MainFragment
import ru.evolinc.mainapi.communicator.MainCommunicator
import ru.evolinc.mainapi.domain.MainLoadMainResponseUseCase

class MainCommunicatorImpl(
    override val mainLoadMainResponseUseCase: MainLoadMainResponseUseCase
) : MainCommunicator {

    override fun openMainScreen(fragmentActivityStub: FragmentActivityStub) {
        fragmentActivityStub.retrieve()
            .supportFragmentManager
            .beginTransaction()
            .replace(
                rootContainerId,
                MainFragment.newInstance(),
                MainFragment::class.java.simpleName
            )
            .commit()
    }
}
