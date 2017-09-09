package pers.wang.accountbook.activitiy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import pers.wang.accountbook.R;
import pers.wang.accountbook.applicant.MyApplicant;

public class ListActivity extends Activity {

    private Switch switch_locked;
    MyApplicant applicant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initView();
    }

    private void initView() {
                applicant = (MyApplicant) getApplication();
        switch_locked = (Switch) findViewById(R.id.switch_locked);
        if(applicant.isFingerPrintLock()){
            switch_locked.setChecked(true);
        }else{
            switch_locked.setChecked(false);
        }
        switch_locked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    applicant.setFingerPrintLock(true);
                }else{
                    applicant.setFingerPrintLock(false);
                }
            }
        });
    }


}
