package com.example.ridehop_intership_project.Notifications

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationReciever : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        context.sendBroadcast(Intent("NEW_NOTIFICATION"))
    }
}