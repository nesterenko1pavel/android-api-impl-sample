package ru.evolinc.main.domain.usecase

import ru.evolinc.mainapi.domain.MainLoadMainResponseUseCase
import ru.evolinc.main.domain.repository.MainRepository
import ru.evolinc.mainapi.domain.model.MainResponse

class MainLoadMainResponseUseCaseImpl(
    private val mainRepository: MainRepository,
) : MainLoadMainResponseUseCase {

    override operator fun invoke(): MainResponse {
        return mainRepository.loadMainResponse()
    }
}
