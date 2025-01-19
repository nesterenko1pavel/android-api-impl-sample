package ru.evolinc.main.domain.usecase

import ru.evolinc.main.domain.repository.MainRepository

class MainSendDataUseCaseImpl(
    private val mainRepository: MainRepository,
) : MainSendDataUseCase {

    override fun invoke(param: String) {
        mainRepository.sendData(param)
    }
}
