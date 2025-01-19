package ru.evolinc.apiimplsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.evolinc.core.RootFragmentContainerId
import ru.evolinc.core.asFragmentActivityStub
import ru.evolinc.core.getCommunicatorsManager
import ru.evolinc.mainapi.communicator.MainCommunicator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            RootFragmentContainerId.setRootFragmentContainerId(R.id.root_fragment_container)

            getCommunicatorsManager()
                .retrieve<MainCommunicator>(MainCommunicator::class)
                .openMainScreen(this.asFragmentActivityStub())
        }
    }
}