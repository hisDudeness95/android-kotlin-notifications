package com.example.android.eggtimernotifications

import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService {

    override fun onMessageRecieved(remoteMessage: RemoteMessage?) {
        log.d(TAG, "From: ${remoteMessage?.from}")
    }
}