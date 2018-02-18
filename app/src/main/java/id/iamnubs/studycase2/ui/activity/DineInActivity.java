package id.iamnubs.studycase2.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.OnClick;
import id.iamnubs.studycase2.R;

/**
 * Created by iamnubs on 18/02/2018.
 */

public class DineInActivity extends BaseActivity {

    @BindView(R.id.sp_meja)
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.meja_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    @OnClick(R.id.btn_pesan)
    void pesan() {
        startActivity(new Intent(this, MenuActivity.class));
    }

    @Override
    public int getContent() {
        return R.layout.activity_dinein;
    }
}
