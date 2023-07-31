package com.example.ridehop_intership_project.Notifications

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.media.RingtoneManager
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.ridehop_intership_project.Activity.DashboardActivity
import com.example.ridehop_intership_project.R
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.d("dfjkfkjfk", "Refreshed token: $token")
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        Log.d("Tdjfjfjf", "" + remoteMessage)
        if (remoteMessage.notification != null) {
            // Since the notification is received directly
            // from FCM, the title and the body can be
            // fetched directly as below.
            val i = Intent(applicationContext, NotificationReciever::class.java)
            applicationContext.sendBroadcast(i)
            val intent = Intent(Intent.ACTION_SCREEN_OFF)
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);

            showNotification(
                remoteMessage.notification!!.title,
                remoteMessage.notification!!.body
            )
        }
    }

    private fun showNotification(title: String?, body: String?) {
        val intent = Intent(this, DashboardActivity::class.java)
        // Assign channel ID
        val channel_id = "notification_channel"
        // Here FLAG_ACTIVITY_CLEAR_TOP flag is set to clear
        // the activities present in the activity stack,
        // on the top of the Activity that is to be launched
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        // Pass the intent to PendingIntent to start the
        // next Activity
        val pendingIntent = PendingIntent.getActivity(
            this, 0, intent, PendingIntent.FLAG_ONE_SHOT or PendingIntent.FLAG_IMMUTABLE
        )

        // Create a Builder object using NotificationCompat
        // class. This will allow control over all the flags
        val notificationBuilder = NotificationCompat.Builder(this, "channel_id")
            .setContentTitle(title)
            .setContentText(body)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setStyle(NotificationCompat.BigTextStyle())
            .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
            .setSmallIcon(R.mipmap.ic_launcher)
            .setAutoCancel(true)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(0, notificationBuilder.build())
    }
}