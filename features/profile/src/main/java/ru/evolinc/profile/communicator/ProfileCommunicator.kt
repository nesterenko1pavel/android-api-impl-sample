package ru.evolinc.profile.communicator

import ru.evolinc.core.RootFragmentContainerId
import ru.evolinc.core.retrieve
import ru.evolinc.corejava.FragmentActivityStub
import ru.evolinc.profile.presentation.ProfileFragment
import ru.evolinc.profileapi.communicator.ProfileCommunicator

class ProfileCommunicatorImpl : ProfileCommunicator {

    override fun openProfileScreen(fragmentActivityStub: FragmentActivityStub) {
        val tag = ProfileFragment::class.java.simpleName
        fragmentActivityStub.retrieve()
            .supportFragmentManager
            .beginTransaction()
            .replace(
                RootFragmentContainerId.rootContainerId,
                ProfileFragment.newInstance(),
                tag
            )
            .addToBackStack(tag)
            .commit()
    }
}