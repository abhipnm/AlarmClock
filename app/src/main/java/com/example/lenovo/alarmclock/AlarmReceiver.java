package com.example.lenovo.alarmclock;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.content.WakefulBroadcastReceiver;

public class AlarmReceiver extends WakefulBroadcastReceiver {
    MediaPlayer mp;
    @Override
    public void onReceive(final Context context, Intent intent) {
        MainActivity.getTextView2().setText("Enough Rest. Do Work Now!");
     //   Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
       // Ringtone ringtone = RingtoneManager.getRingtone(context, uri);
        //ringtone.play();
        mp=MediaPlayer.create(context,R.raw.tone);
        mp.start();
    }
    public void Roko(){
        System.exit(0);
           }
}
