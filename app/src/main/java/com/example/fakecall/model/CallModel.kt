package com.example.fakecall.model

import com.example.fakecall.R
import com.example.fakecall.main.Caller

class CallModel {

    fun generateRandomCaller(): Caller {
        val randomCallerName = generateRandomCallerName()
        val randomCallType = getRandomCallType()
        val randomPhoneNumber = generateRandomPhoneNumber()
        val randomImageResId = getFakeCallerImage()

        return Caller(randomCallerName, randomCallType, randomPhoneNumber, randomImageResId)
    }

    private fun generateRandomCallerName(): String {
        val names = listOf("Elon Mask", "Чонгук", "ULUKMANAPO", "Habib", "Sezim")
        return names.random()
    }
    private fun getFakeCallerImage(): Int {
        val images = listOf(R.drawable.elon, R.drawable.chonguk, R.drawable.ulukmanapo, R.drawable.habib, R.drawable.sezim)
        return images.random()
    }

    private fun getRandomCallType(): String {
        val callTypes = listOf("Incoming", "Outgoing", "Missed")
        return callTypes.random()
    }

    private fun generateRandomPhoneNumber(): String {
        val phoneNumbers = listOf("123456789", "987654321", "555555555")
        return phoneNumbers.random()
    }

    fun getRandomCaller() {

    }

}