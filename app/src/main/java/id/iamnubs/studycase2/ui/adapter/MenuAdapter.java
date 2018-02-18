package id.iamnubs.studycase2.ui.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import id.iamnubs.studycase2.R;
import id.iamnubs.studycase2.ui.model.MenuModel;

/**
 * Created by iamnubs on 18/02/2018.
 */

public class MenuAdapter extends BaseQuickAdapter<MenuModel, BaseViewHolder> {

    public MenuAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MenuModel item) {
        helper.setText(R.id.nama, item.getName());
        helper.setText(R.id.harga, String.valueOf(item.getHarga()));
        helper.setImageDrawable(R.id.photo, mContext.getResources().getDrawable(item.getPhoto(), null));
    }
}
