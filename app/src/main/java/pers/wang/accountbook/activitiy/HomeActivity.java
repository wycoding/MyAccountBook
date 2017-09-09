package pers.wang.accountbook.activitiy;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pers.wang.accountbook.R;
import pers.wang.accountbook.adapter.HomePagerAdapter;

public class HomeActivity extends Activity implements View.OnClickListener {

    private String str;

    private View page1, page2;
    private List<View> pagelist;
    private HomePagerAdapter homePagerAdapter;
    private TextView tv_home_name;
    private ImageView iv_home_menu;
    private ImageView iv_home_setting;
    private RelativeLayout layout_home_title;
    private EditText et_home_num;
    private RelativeLayout layout_home_num;
    private ViewPager viewpager_home_categroy;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button confirm;
    private Button num0;
    private Button delete;
    private LinearLayout layout_home_calc;
    private ImageButton btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        initData();
    }

    private void initData() {
        LayoutInflater inflater = getLayoutInflater();
        page1 = inflater.inflate(R.layout.page1, null);
        page2 = inflater.inflate(R.layout.page2, null);
        btn1 = (ImageButton) page1.findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        pagelist = new ArrayList<View>();
        pagelist.add(page1);
        pagelist.add(page2);

        homePagerAdapter = new HomePagerAdapter(pagelist);
        viewpager_home_categroy.setAdapter(homePagerAdapter);
        et_home_num.setInputType(InputType.TYPE_NULL);
    }

    private void initView() {
        viewpager_home_categroy = (ViewPager) findViewById(R.id.viewpager_home_categroy);

        tv_home_name = (TextView) findViewById(R.id.tv_home_name);
        tv_home_name.setOnClickListener(this);
        iv_home_menu = (ImageView) findViewById(R.id.iv_home_menu);
        iv_home_menu.setOnClickListener(this);
        iv_home_setting = (ImageView) findViewById(R.id.iv_home_setting);
        iv_home_setting.setOnClickListener(this);
        layout_home_title = (RelativeLayout) findViewById(R.id.layout_home_title);
        layout_home_title.setOnClickListener(this);
        et_home_num = (EditText) findViewById(R.id.et_home_num);
        et_home_num.setOnClickListener(this);
        layout_home_num = (RelativeLayout) findViewById(R.id.layout_home_num);
        layout_home_num.setOnClickListener(this);
        viewpager_home_categroy = (ViewPager) findViewById(R.id.viewpager_home_categroy);
        viewpager_home_categroy.setOnClickListener(this);
        num1 = (Button) findViewById(R.id.num1);
        num1.setOnClickListener(this);
        num2 = (Button) findViewById(R.id.num2);
        num2.setOnClickListener(this);
        num3 = (Button) findViewById(R.id.num3);
        num3.setOnClickListener(this);
        num4 = (Button) findViewById(R.id.num4);
        num4.setOnClickListener(this);
        num5 = (Button) findViewById(R.id.num5);
        num5.setOnClickListener(this);
        num6 = (Button) findViewById(R.id.num6);
        num6.setOnClickListener(this);
        num7 = (Button) findViewById(R.id.num7);
        num7.setOnClickListener(this);
        num8 = (Button) findViewById(R.id.num8);
        num8.setOnClickListener(this);
        num9 = (Button) findViewById(R.id.num9);
        num9.setOnClickListener(this);
        confirm = (Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(this);
        num0 = (Button) findViewById(R.id.num0);
        num0.setOnClickListener(this);
        delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(this);
        delete.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                et_home_num.setText("");
                return true;
            }
        });
        layout_home_calc = (LinearLayout) findViewById(R.id.layout_home_calc);
        layout_home_calc.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        str = et_home_num.getText().toString();
        switch (v.getId()) {
            case R.id.num1:
            case R.id.num2:
            case R.id.num3:
            case R.id.num4:
            case R.id.num5:
            case R.id.num6:
            case R.id.num7:
            case R.id.num8:
            case R.id.num9:
            case R.id.num0:
                et_home_num.setText(str + ((Button) v).getText().toString());
                et_home_num.setSelection(et_home_num.getText().length());
            case R.id.confirm:
                break;
            case R.id.delete:
                if (et_home_num.getText().toString().length() > 0) {
                    et_home_num.setText(et_home_num.getText().toString().substring(0, et_home_num.getText().toString().length() - 1));
                }
                break;
            case R.id.iv_home_setting:
                Intent i = new Intent(HomeActivity.this, ListActivity.class);
                startActivity(i);
                break;
            case R.id.btn1:
                btn1.setBackgroundColor(Color.CYAN);
                break;
        }
    }
}
