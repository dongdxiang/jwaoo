package com.jwaoo.mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dx.as.common.ILoadListener;
import com.jwaoo.mobile.data.DataDao;
import com.jwaoo.mobile.data.Storys;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataDao.getInit(loadListener).getInfo();
    }

    private ILoadListener<Storys> loadListener = new ILoadListener<Storys>() {
        @Override
        public void onResponse(Storys response, int flg) {
            Storys storys = response;
            System.out.println(storys.getCurrent_page());
        }

        @Override
        public void onFailure(Throwable t) {
            System.out.println(t.toString());
        }
    };
}
