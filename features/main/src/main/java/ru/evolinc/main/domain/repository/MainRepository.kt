package ru.evolinc.main.domain.repository

import ru.evolinc.mainapi.domain.model.MainResponse

interface MainRepository {

    fun loadMainResponse(): MainResponse

    fun sendData(param: String)
}