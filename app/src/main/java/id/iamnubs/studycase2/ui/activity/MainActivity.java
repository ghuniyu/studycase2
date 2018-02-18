package id.iamnubs.studycase2.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;
import es.dmoral.toasty.Toasty;
import id.iamnubs.studycase2.R;

/**
 * Created by iamnubs on 16/02/2018.
 */

public class MainActivity extends BaseActivity {

    @BindView(R.id.rg)
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Menampilkan Toast
        Toasty.info(this, "GHUNIYU 1202150107", Toast.LENGTH_SHORT).show();
    }

    //Melisten btn pesan ketika di klik dengan memerika Radio Button Pilihan
    @OnClick(R.id.btn_pesan)
    void onPesan() {
        switch (rg.getCheckedRadioButtonId()) {
            case R.id.rb_dinein:
                startActivity(new Intent(this, DineInActivity.class));
                break;
            case R.id.rb_takeaway:
                startActivity(new Intent(this, TakeAwayActivity.class));
                break;
            default:
                Toasty.error(this, "Anda Harus Memilih Salah Satu").show();
        }
    }

    @Override
    public int getContent() {
        return R.layout.activity_main;
    }
}
