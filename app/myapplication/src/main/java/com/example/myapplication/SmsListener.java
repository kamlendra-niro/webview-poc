package com.example.myapplication;

import static android.content.Context.MODE_PRIVATE;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.Telephony;
import android.telephony.SmsMessage;

public class SmsListener extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Telephony.Sms.Intents.SMS_RECEIVED_ACTION.equals(intent.getAction())) {
            for (SmsMessage smsMessage : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
                String messageBody = smsMessage.getMessageBody();
                System.out.println("#SmsListener messageBody >>> " + messageBody);
                SharedPreferences.Editor editor = context.getSharedPreferences("MyPref", MODE_PRIVATE).edit();
                editor.putString("messageBody", messageBody);
                editor.apply();
            }
            System.out.println("#SmsListener onReceive 2>>> Outside");
        }
        System.out.println("#SmsListener onReceive 1>>> Outside");

    }


}
