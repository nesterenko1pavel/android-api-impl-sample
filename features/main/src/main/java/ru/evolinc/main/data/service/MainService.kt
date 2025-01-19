package ru.evolinc.main.data.service

import ru.evolinc.mainapi.domain.model.MainResponse

interface MainService {

    fun loadAvatar(): MainResponse

    fun sendData(param: String)
}