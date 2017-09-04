package pers.wang.accountbook.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by winnw on 2017/9/4.
 */

public class HomePagerAdapter extends PagerAdapter {

    private List<View> pagelist;

    public HomePagerAdapter(List<View> pagelist) {
        this.pagelist = pagelist;
    }

    @Override
    public int getCount() {
        return pagelist.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(pagelist.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(pagelist.get(position));
        return pagelist.get(position);
    }
}
