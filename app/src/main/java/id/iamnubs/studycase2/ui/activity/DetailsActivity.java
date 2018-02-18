package id.iamnubs.studycase2.ui.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import id.iamnubs.studycase2.R;
import id.iamnubs.studycase2.ui.model.MenuModel;

/**
 * Created by iamnubs on 18/02/2018.
 */

public class DetailsActivity extends BaseActivity {

    @BindView(R.id.nama)
    TextView nama;

    @BindView(R.id.harga)
    TextView harga;

    @BindView(R.id.foto)
    ImageView foto;

    @BindView(R.id.komposisi)
    TextView komposisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MenuModel item = getIntent().getParcelableExtra("data");
        if (item != null){
            komposisi.setText(item.getKomposisi());
            nama.setText(item.getName());
            harga.setText(String.valueOf(item.getHarga()));
            foto.setImageDrawable(getResources().getDrawable(item.getPhoto()));
        }
    }

    @Override
    public int getContent() {
        return R.layout.activity_detail;
    }
}
