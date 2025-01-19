package ru.evolinc.profile.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.evolinc.core.getCommunicatorsManager
import ru.evolinc.mainapi.communicator.MainCommunicator
import ru.evolinc.profile.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ProfileViewModelFactory(
            mainLoadMainResponseUseCase = getCommunicatorsManager()
                .retrieve<MainCommunicator>(MainCommunicator::class)
                .mainLoadMainResponseUseCase
        )
        val viewModel = ViewModelProvider(this, factory)[ProfileViewModel::class.java]

    }

    companion object {

        fun newInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }
}