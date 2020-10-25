package com.service99.ui.utilities;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.telephony.SmsManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.service99.ui.activities.FailedActivity;
import com.service99.ui.activities.SuccessActivity;


public class SendSms extends Activity {

    //+919993445411 neeraj
    //+918964950828 me

    private Context mContext;
    private Activity mActivity;
    private String phoneNumber = "+919993445411", message;
    private static final int SMS_PERMISSION_CODE = 100;
    private BroadcastReceiver sentReceiver, deliveredReceiver;

    public SendSms(Context context, Activity activity, String message) {

        this.message = message;
        mContext = context;
        mActivity = activity;

        String hno = SharedPref.read("hno", "");
        FirebaseAuth auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() == null) {
            //Help.signIn_dialog(context);
        } else if (hno.equals("") || hno.isEmpty()) {
            //Help.address_dialog(context);
        } else {
            checkPermission(
                    Manifest.permission.SEND_SMS,
                    SMS_PERMISSION_CODE);
        }
    }

    // Function to check and request permission
    public void checkPermission(String permission, int requestCode) {

        // Checking if permission is not granted
        if (ContextCompat.checkSelfPermission(
                mContext,
                permission)
                == PackageManager.PERMISSION_DENIED) {
            ActivityCompat
                    .requestPermissions(mActivity,
                            new String[]{permission},
                            requestCode);
        } else {
            sendsms();
        }
    }

    // This function is called when user accept or decline the permission.
    // Request Code is used to check which permission called this function.
    // This request code is provided when user is prompt for permission.

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode,
                permissions,
                grantResults);

        if (requestCode == SMS_PERMISSION_CODE) {

            // Checking whether user granted the permission or not.
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //SMS Permission Granted
                // Showing the toast message
                Toast.makeText(mContext,
                        "SMS Permission Granted",
                        Toast.LENGTH_SHORT)
                        .show();
                //now sending sms
                sendsms();
            } else {
                Toast.makeText(mContext,
                        "SMS Permission Denied. Please grant us sms permissions to " +
                                "send your request.",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        }

    }

    private void sendsms() {

        String SENT = "SMS_SENT";
        String DELIVERED = "SMS_DELIVERED";
        PendingIntent sentPI = PendingIntent.getBroadcast(mContext, 0, new Intent(SENT), 0);
        PendingIntent deliveredPI = PendingIntent.getBroadcast(mContext, 0, new Intent(DELIVERED), 0);

        // ---when the SMS has been sent---
        sentReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context arg0, Intent arg1) {
                Intent i;
                switch (getResultCode()) {
                    case Activity.RESULT_OK:
                        //sms sent
                        i = new Intent(mContext, SuccessActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(i);
                        unregisterSent();
                        break;

                    case SmsManager.RESULT_ERROR_NO_SERVICE:
                        Toast.makeText(mContext, "No Service!",
                                Toast.LENGTH_LONG).show();
                        i = new Intent(mContext, FailedActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(i);
                        unregisterSent();
                        break;

                    case SmsManager.RESULT_ERROR_NULL_PDU:
                        // null pdu
                        Toast.makeText(mContext, "NULL PDU",
                                Toast.LENGTH_LONG).show();
                        i = new Intent(mContext, FailedActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(i);
                        unregisterSent();
                        break;

                    case SmsManager.RESULT_ERROR_RADIO_OFF:
                        Toast.makeText(mContext, "Please turn off aeroplane mode and try again.",
                                Toast.LENGTH_LONG).show();
                        i = new Intent(mContext, FailedActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(i);
                        unregisterSent();
                        break;

                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        // sms failed
                        Toast.makeText(mContext, "GENERIC FAILURE",
                                Toast.LENGTH_LONG).show();
                        i = new Intent(mContext, FailedActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(i);
                        unregisterSent();
                        break;

                }
            }
        };
        mContext.registerReceiver(sentReceiver, new IntentFilter(SENT));

        // ---when the SMS has been delivered---
        deliveredReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context arg0, Intent arg1) {
                switch (getResultCode()) {
                    case Activity.RESULT_OK:

                    case Activity.RESULT_CANCELED:
                        unregisterDelivered();
                        break;
                }
            }
        };
        mContext.registerReceiver(deliveredReceiver, new IntentFilter(DELIVERED));

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, sentPI, deliveredPI);

    }

    private void unregisterSent() {
        mContext.unregisterReceiver(sentReceiver);
    }

    private void unregisterDelivered() {
        mContext.unregisterReceiver(deliveredReceiver);
    }
}
