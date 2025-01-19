package ru.evolinc.main.data.repository

import ru.evolinc.main.data.service.MainService
import ru.evolinc.main.domain.repository.MainRepository
import ru.evolinc.mainapi.domain.model.MainResponse

class MainRepositoryImpl(
    private val mainService: MainService,
) : MainRepository {

    override fun loadMainResponse(): MainResponse {
        return mainService.loadAvatar()
    }

    override fun sendData(param: String) {
        mainService.sendData(param)
    }
}