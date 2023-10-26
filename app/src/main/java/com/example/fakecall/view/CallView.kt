package com.example.fakecall.view

import com.example.fakecall.main.Caller

interface CallView {
    fun showFakeCall(caller: Caller)
    fun showFakeCall(callerName: Any?, callType: String, phoneNumber: String)
    fun finishView()
    fun showFakeCall(callerName: String, callType: String, phoneNumber: String)
}