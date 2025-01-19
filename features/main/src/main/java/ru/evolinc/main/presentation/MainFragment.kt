package ru.evolinc.main.presentation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.evolinc.core.asFragmentActivityStub
import ru.evolinc.core.getCommunicatorsManager
import ru.evolinc.main.R
import ru.evolinc.profileapi.communicator.ProfileCommunicator

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this, MainViewModelFactory())[MainViewModel::class.java]
        view.findViewById<Button>(R.id.main_navigate_button).setOnClickListener {
            getCommunicatorsManager().retrieve<ProfileCommunicator>(ProfileCommunicator::class)
                .openProfileScreen(requireActivity().asFragmentActivityStub())

        }
    }

    companion object {

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }
}