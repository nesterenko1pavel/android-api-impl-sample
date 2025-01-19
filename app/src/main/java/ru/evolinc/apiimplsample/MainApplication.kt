package ru.evolinc.apiimplsample

import android.app.Application
import ru.evolinc.apiimplsample.communicator.CommunicatorsManagerImpl
import ru.evolinc.core.CommunicatorsManager
import ru.evolinc.core.MainApp

class MainApplication : Application(), MainApp {

    override fun getCommunicatorsManager(): CommunicatorsManager {
        return CommunicatorsManagerImpl()
    }
}