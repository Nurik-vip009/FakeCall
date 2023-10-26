package com.example.fakecall.main

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fakecall.R
import com.example.fakecall.model.CallModel
import com.example.fakecall.view.CallView

class MainActivity : AppCompatActivity(), CallView {

    private lateinit var presenter: CallPresenter

    private lateinit var callerImageView: ImageView
    private lateinit var callerNameTextView: TextView
    private lateinit var callTypeTextView: TextView
    private lateinit var phoneNumberTextView: TextView
    private lateinit var callerInfoTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callerImageView = findViewById(R.id.callerImageView)
        callerNameTextView = findViewById(R.id.callerNameTextView)
        callTypeTextView = findViewById(R.id.callTypeTextView)
        phoneNumberTextView = findViewById(R.id.phoneNumberTextView)
        callerInfoTextView = findViewById(R.id.callerInfoTextView)

        presenter = CallPresenter(this, CallModel())
        presenter.onViewCreated()
    }

    override fun showFakeCall(callerName: Any?, callType: String, phoneNumber: String) {
        if (callerName is String) {
            callerNameTextView.text = callerName
        } else {
            callerNameTextView.text = "Неизвестный звонящий"
        }

        callTypeTextView.text = callType
        phoneNumberTextView.text = phoneNumber
    }

    override fun showFakeCall(callerName: String, callType: String, phoneNumber: String) {

    }


    override fun showFakeCall(caller: Caller) {
        val callerName = caller.name
        val callType = caller.callType
        val phoneNumber = caller.phoneNumber
        val imageResId = caller.imageResId

        callerInfoTextView.text = "Дополнительная информация о звонящем"
    }

    private fun getFakeCallerImage(): Int {
        val images = listOf(R.drawable.elon, R.drawable.chonguk, R.drawable.ulukmanapo, R.drawable.habib, R.drawable.sezim)
        val randomIndex = images.indices.random()
        return images[randomIndex]
    }



    override fun finishView() {
        finish()
    }
}
