package com.example.siren;

import android.app.IntentService;
import android.content.Intent;
import android.os.Looper;
import android.widget.Toast;

public class NotificationIntentService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public NotificationIntentService() {
        super("notificationIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Toast.makeText(getApplicationContext(),"Emergency request has been accepted", Toast.LENGTH_SHORT).show();
    }
}