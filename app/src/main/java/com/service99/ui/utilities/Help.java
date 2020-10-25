package com.service99.ui.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.View;

import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import com.creativityapps.gmailbackgroundlibrary.BackgroundMail;
import com.service99.MainActivity;
import com.service99.R;
import com.service99.ui.activities.FailedActivity;
import com.service99.ui.activities.ScheduleBooking;
import com.service99.ui.activities.SuccessActivity;
import com.service99.ui.home.HomeFragment;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Help {

    public static void schedule(final Context context, String serviceTitle, String servicePrice) {

        if (serviceTitle.contains("Service:")) {
            serviceTitle = serviceTitle.replace("Service:", "");
        }

        Intent i = new Intent(context, ScheduleBooking.class);
        i.putExtra("title", serviceTitle);
        i.putExtra("price", servicePrice);
        context.startActivity(i);

    }

    public static void schedule(final Context context, String serviceTitle) {

        if (serviceTitle.contains("Service:")) {
            serviceTitle = serviceTitle.replace("Service:", "");
        }
        if (serviceTitle.contains("\n")) {
            serviceTitle = serviceTitle.replaceAll("\n", "");
        }

        Intent i = new Intent(context, ScheduleBooking.class);
        i.putExtra("title", serviceTitle);
        i.putExtra("price", "0");
        context.startActivity(i);

    }

    public static void signIn_dialog(final Context context) {
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Please Sign in")
                .setContentText("Our services are best availed after signing in.")
                .show();
    }

    public static void address_dialog(Context context) {
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Please Add Address")
                .setContentText("Did you forgot to add address and Phone ?")
                .show();
    }

    public static void time_dialog(Context context) {
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("8 AM - 8 PM")
                .setContentText("Our Services are only available between " +
                        "8 AM in the morning and 8 PM in the evening.")
                .show();
    }

    public static void past_dialog(Context context) {
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Time Travelling")
                .setContentText("We cannot provide services into the past ! ")
                .show();
    }

    public static void send_gmail(final Context context, String msg) {

        BackgroundMail.newBuilder(context)
                .withUsername("example@gmail.com")
                .withPassword("example@123")
                .withSenderName("Service99")
                .withMailTo("service99admin@gmail.com")  //receiver's email
                .withType(BackgroundMail.TYPE_PLAIN)
                .withSubject("Service99")
                .withBody(msg)
                //.withAttachments(Environment.getExternalStorageDirectory().getPath() + "/test.txt")
                .withSendingMessage("Please Wait")
                .withOnSuccessCallback(new BackgroundMail.OnSendingCallback() {
                    @Override
                    public void onSuccess() {
                        // do some magic
                        context.startActivity(
                                new Intent(
                                        context,
                                        SuccessActivity.class
                                )
                        );
                    }

                    @Override
                    public void onFail(Exception e) {
                        // do some magic
                        Log.d("GMAILBACKGROUND::::", e.toString());

                        context.startActivity(
                                new Intent(
                                        context,
                                        FailedActivity.class
                                )
                        );
                    }
                })
                .send();

    }

    public static SweetAlertDialog loadDialog(Context context){
        SweetAlertDialog pDialog = new SweetAlertDialog(context, SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Please Wait");
        pDialog.setCancelable(false);
        pDialog.show();
        return pDialog;
    }


}
