package ru.evolinc.mainapi.domain

import ru.evolinc.mainapi.domain.model.MainResponse

interface MainLoadMainResponseUseCase {

    operator fun invoke(): MainResponse
}