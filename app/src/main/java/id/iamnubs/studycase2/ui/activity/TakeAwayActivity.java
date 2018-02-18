package id.iamnubs.studycase2.ui.activity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.OnClick;
import id.iamnubs.studycase2.R;

/**
 * Created by iamnubs on 18/02/2018.
 */

public class TakeAwayActivity extends BaseActivity {

    @BindView(R.id.date)
    EditText tv_date;

    @BindView(R.id.time)
    EditText tv_time;


    @OnClick(R.id.btn_pesan)
    void pesan() {
        startActivity(new Intent(this, MenuActivity.class));
    }

    @OnClick(R.id.date)
    void showDate() {
        final DatePickerDialog date = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                tv_date.setText(String.format("%02d-%02d-%04d", d, m, y));
            }
        }, 2018, 2, 18);

        date.show();
    }

    @OnClick(R.id.time)
    void showTime() {
        final TimePickerDialog time = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int h, int m) {
                tv_time.setText(String.format("%02d:%02d", h, m));
            }
        }, 0, 0, true);
        time.show();
    }

    @Override
    public int getContent() {
        return R.layout.activity_takeaway;
    }
}
