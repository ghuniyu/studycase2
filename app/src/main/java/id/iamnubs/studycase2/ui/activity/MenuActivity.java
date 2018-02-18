package id.iamnubs.studycase2.ui.activity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import id.iamnubs.studycase2.R;
import id.iamnubs.studycase2.ui.adapter.MenuAdapter;
import id.iamnubs.studycase2.ui.model.MenuModel;

/**
 * Created by iamnubs on 18/02/2018.
 */

public class MenuActivity extends BaseActivity {

    @BindView(R.id.rv_menu)
    RecyclerView rvMenu;

    MenuAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rvMenu.setHasFixedSize(true);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));

        final List<MenuModel> menus = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            menus.add(new MenuModel(R.drawable.upin, "Upin " + String.valueOf(i), 25000, "huehuehue data " + String.valueOf(i)));
        }

        adapter = new MenuAdapter(R.layout.item_menu, menus);
        rvMenu.setAdapter(adapter);

        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                view.getContext().startActivity(new Intent(MenuActivity.this, DetailsActivity.class).putExtra("data", menus.get(position)));
            }
        });
    }

    @Override
    public int getContent() {
        return R.layout.activity_menu;
    }
}
