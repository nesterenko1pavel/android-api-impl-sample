package ru.evolinc.apiimplsample.communicator

import kotlin.reflect.KClass
import ru.evolinc.core.CommunicatorsManager
import ru.evolinc.main.communicator.MainCommunicatorImpl
import ru.evolinc.main.data.repository.MainRepositoryImpl
import ru.evolinc.main.data.service.MainService
import ru.evolinc.main.domain.usecase.MainLoadMainResponseUseCaseImpl
import ru.evolinc.mainapi.communicator.MainCommunicator
import ru.evolinc.mainapi.domain.model.MainResponse
import ru.evolinc.profile.communicator.ProfileCommunicatorImpl
import ru.evolinc.profileapi.communicator.ProfileCommunicator

class CommunicatorsManagerImpl : CommunicatorsManager {

    private val service = object : MainService {
        override fun loadAvatar(): MainResponse = MainResponse("test")
        override fun sendData(param: String) = Unit
    }
    private val repository = MainRepositoryImpl(service)
    private val mainLoadMainResponseUseCase = MainLoadMainResponseUseCaseImpl(repository) // sample code (no DI)

    private val communicators = mapOf(
        MainCommunicator::class to MainCommunicatorImpl(mainLoadMainResponseUseCase),
        ProfileCommunicator::class to ProfileCommunicatorImpl()
    )

    override fun <T : Any> retrieve(clazz: KClass<*>): T {
        return communicators[clazz] as T
    }
}
