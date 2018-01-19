package com.example.android.sunshine.sync;
// DONE (9) Create a class called SunshineSyncUtils

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class SunshineSyncUtils {
    //  DONE (10) Create a public static void method called startImmediateSync
    public static void startImmediateSync(Context context) {
        //  DONE (11) Within that method, start the SunshineSyncIntentService
        Intent intent = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intent);

    }
}