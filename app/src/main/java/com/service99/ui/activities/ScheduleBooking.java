package com.service99.ui.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.service99.R;
import com.service99.ui.auth.AddressActivity;
import com.service99.ui.auth.LoginActivity;
import com.service99.ui.utilities.Help;
import com.service99.ui.utilities.SharedPref;
import com.vivekkaushik.datepicker.DatePickerTimeline;
import com.vivekkaushik.datepicker.OnDateSelectedListener;

import java.util.Calendar;
import java.util.Objects;

public class ScheduleBooking extends AppCompatActivity {

    String name, when = "Within 90 min", msg, Title, Price, date, time, m, s;
    Calendar calendar = Calendar.getInstance();
    TextView scheduledonTV;
    int dateselected, monthselected, yearselected,
            todaydate, todaymonth, todayyear,
            currenthour, selectedhour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_now);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Schedule Booking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        dateselected = todaydate = calendar.get(Calendar.DATE);
        monthselected = todaymonth = calendar.get(Calendar.MONTH);
        yearselected = todayyear = calendar.get(Calendar.YEAR);
        int h = calendar.get(Calendar.HOUR);
        int min = calendar.get(Calendar.MINUTE);
        int a = calendar.get(Calendar.AM_PM);
        currenthour = selectedhour = calendar.get(Calendar.HOUR_OF_DAY);

        if (a == 0) {
            time = h + ":" + min + " AM";
        } else {
            time = h + ":" + min + " PM";
        }

        scheduledonTV = findViewById(R.id.sheduled_on);
        updateScheduleTV();

        name = SharedPref.read(SharedPref.NAME, "");
        TextView title, price;
        title = findViewById(R.id.tv_title);
        price = findViewById(R.id.tv_price);

        Intent i = getIntent();
        Title = i.getStringExtra("title");
        Price = i.getStringExtra("price");
        title.setText(Title);

        if (Price.equals("0")) {
            price.setVisibility(View.GONE);
        } else {
            price.setText(Price);
        }

        Log.d("CURRENT DATE/TIME", "Calendar.getInstance().getTime(): " + calendar);
        //DatePickerTimeline
        DatePickerTimeline datePickerTimeline = findViewById(R.id.dateTimeline);
        // Set current date as Start date
        datePickerTimeline.setInitialDate(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE)
        );
        // Set active date
        datePickerTimeline.setActiveDate(calendar);
        // Set a date Selected Listener
        datePickerTimeline.setOnDateSelectedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(int year, int month, int day, int dayOfWeek) {
                // Do Something with selected date
                monthselected = month;
                dateselected = day;
                yearselected = year;

                updateScheduleTV();
            }

            @Override
            public void onDisabledDateSelected(int year, int month, int day, int dayOfWeek, boolean isDisabled) {
                // Do Something on disabled date selected
            }
        });
        //Change DatePickerTimeline Colors
        datePickerTimeline.setDateTextColor(Color.BLACK);
        datePickerTimeline.setDayTextColor(Color.BLUE);
        datePickerTimeline.setMonthTextColor(Color.BLUE);

        // Time Picker
        TimePicker timePicker = findViewById(R.id.timepicker);
        timePicker.setIs24HourView(false);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // do something when time is changed
                selectedhour = hourOfDay;
                if (hourOfDay == 0)
                    time = "12:" + minute + " AM";
                else if (hourOfDay == 12)
                    time = "12:" + minute + " PM";
                else if (hourOfDay < 12)
                    time = hourOfDay + ":" + minute + " AM";
                else
                    time = (hourOfDay - 12) + ":" + minute + " PM";

                updateScheduleTV();
            }
        });

        // confirm button
        final Button btn = findViewById(R.id.cnf_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dateselected == todaydate &&
                        monthselected == todaymonth &&
                        yearselected == todayyear) {
                    if (selectedhour < currenthour) {
                        Help.past_dialog(ScheduleBooking.this);
                    } else {
                        if (selectedhour >=8  && selectedhour < 20) {
                            bookNow();
                            //Toast.makeText(getApplicationContext(),"Booked",Toast.LENGTH_SHORT).show();
                        }else {
                            Help.time_dialog(ScheduleBooking.this);
                        }
                    }
                } else {
                    if (selectedhour >=8  && selectedhour <20) {
                        bookNow();
                        //Toast.makeText(getApplicationContext()," Booked ",Toast.LENGTH_SHORT).show();
                    }else {
                        Help.time_dialog(ScheduleBooking.this);
                    }
                }
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void bookNow() {

        FirebaseAuth auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() == null) {
            startActivity(new Intent(this, LoginActivity.class));
        }else if(SharedPref.read(SharedPref.HNO,"").equals("")){
            startActivity(new Intent(this, AddressActivity.class));
        } else {

            String hno, locality, area, phone,name;
            hno = SharedPref.read(SharedPref.HNO, "");
            locality = SharedPref.read(SharedPref.LOCALITY, "");
            area = SharedPref.read(SharedPref.AREA, "");
            phone = SharedPref.read(SharedPref.PHONE, "");
            name = SharedPref.read(SharedPref.NAME, "");
            String msg = "Service99" +
                    "\nService: " + Title +
                    "\nName: " + name +
                    "\nPhone: " + phone +
                    "\nScheduled: " + s +
                    "\nAddress: " + hno + ", "
                    + locality + ", " + area + ", bhopal" +
                    "\nPrice: " + Price ;

            Help.send_gmail(ScheduleBooking.this, msg);

        }
    }

    private void updateScheduleTV() {

        if (monthselected == 0)
            m = "JAN";
        else if (monthselected == 1)
            m = "FEB";
        else if (monthselected == 2)
            m = "MAR";
        else if (monthselected == 3)
            m = "APR";
        else if (monthselected == 4)
            m = "MAY";
        else if (monthselected == 5)
            m = "JUN";
        else if (monthselected == 6)
            m = "JUL";
        else if (monthselected == 7)
            m = "AUG";
        else if (monthselected == 8)
            m = "SEP";
        else if (monthselected == 9)
            m = "OCT";
        else if (monthselected == 10)
            m = "NOV";
        else if (monthselected == 11)
            m = "DEC";

        date = m + " " + dateselected + "," + yearselected;

        s = date + "  " + time;
        scheduledonTV.setText(s);
    }

}
