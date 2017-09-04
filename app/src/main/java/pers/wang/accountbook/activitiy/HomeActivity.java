package pers.wang.accountbook.activitiy;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import pers.wang.accountbook.R;
import pers.wang.accountbook.adapter.HomePagerAdapter;

public class HomeActivity extends Activity {

    private ViewPager homeViewPager;

    private View page1, page2;
    private List<View> pagelist;
    private HomePagerAdapter homePagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        homeViewPager = (ViewPager) findViewById(R.id.viewpager_home_categroy);
        LayoutInflater inflater = getLayoutInflater();
        page1 = inflater.inflate(R.layout.page1, null);
        page2 = inflater.inflate(R.layout.page2, null);
        pagelist = new ArrayList<View>();
        pagelist.add(page1);
        pagelist.add(page2);

        homePagerAdapter = new HomePagerAdapter(pagelist);
        homeViewPager.setAdapter(homePagerAdapter);
    }
}
