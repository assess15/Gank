package material.com.submit.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;

import material.com.submit.R;

import material.com.base.BaseActivity;

/**
 * 提交页
 * Created by cangwang on 2017/4/1.
 */
@Route(path = "/gank_submit/1")
public class SubmitActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit_activity);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tr = fm.beginTransaction();
        SubmitButterFragment sf = new SubmitButterFragment();
        tr.replace(R.id.submit_activity,sf);
        tr.commitAllowingStateLoss();
    }
}
