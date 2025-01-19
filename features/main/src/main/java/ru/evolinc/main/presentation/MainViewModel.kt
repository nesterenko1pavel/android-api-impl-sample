package ru.evolinc.main.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.evolinc.main.data.repository.MainRepositoryImpl
import ru.evolinc.main.data.service.MainService
import ru.evolinc.main.domain.usecase.MainLoadMainResponseUseCaseImpl
import ru.evolinc.main.domain.usecase.MainSendDataUseCase
import ru.evolinc.main.domain.usecase.MainSendDataUseCaseImpl
import ru.evolinc.mainapi.domain.MainLoadMainResponseUseCase
import ru.evolinc.mainapi.domain.model.MainResponse

class MainViewModel(
    private val mainLoadMainResponseUseCase: MainLoadMainResponseUseCase,
    private val mainSendDataUseCase: MainSendDataUseCase,
) : ViewModel() {

    init {
        val mainResponse = mainLoadMainResponseUseCase()
    }
}

class MainViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val service = object : MainService {
            override fun loadAvatar(): MainResponse = MainResponse("test")
            override fun sendData(param: String) = Unit
        }
        val repository = MainRepositoryImpl(service)
        return MainViewModel(
            mainLoadMainResponseUseCase = MainLoadMainResponseUseCaseImpl(repository),
            mainSendDataUseCase = MainSendDataUseCaseImpl(repository)
        ) as T
    }
}