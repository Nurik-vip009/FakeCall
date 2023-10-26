package com.example.fakecall.main

import android.os.Looper
import com.example.fakecall.model.CallModel
import com.example.fakecall.view.CallView

class CallPresenter(private val view: CallView, private val model: CallModel) {


    fun onViewCreated() {
        val randomCaller = model.generateRandomCaller()
        val callerName = randomCaller.name
        val callType = randomCaller.callType
        val phoneNumber = randomCaller.phoneNumber

        view.showFakeCall(callerName, callType, phoneNumber)

        android.os.Handler(Looper.getMainLooper()).postDelayed({
            view.finishView()
        }, 5000)
    }

}
