package ru.evolinc.profile.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.evolinc.mainapi.domain.MainLoadMainResponseUseCase

class ProfileViewModel(
    private val mainLoadMainResponseUseCase: MainLoadMainResponseUseCase,
) : ViewModel() {

    init {
        Log.i("testapp", "ProfileViewModel: ${mainLoadMainResponseUseCase()}")
    }

}

class ProfileViewModelFactory(
    private val mainLoadMainResponseUseCase: MainLoadMainResponseUseCase,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProfileViewModel(mainLoadMainResponseUseCase) as T
    }
}