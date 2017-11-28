package com.yuhyeon.tabhosttestproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {

    TabHost tabHost;
    TabHost.TabSpec tabSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        setTabHost("tab1","TAB 1" , R.id.content1);
        setTabHost("tab2","TAB 2" , R.id.content2);
        setTabHost("tab3","TAB 3" , R.id.content3);
    }
    public void setTabHost(String tabSpec, String indicator, int contentID) {
        tabSet = tabHost.newTabSpec(tabSpec).setIndicator(indicator).setContent(contentID);
        tabHost.addTab(tabSet);
    }
}
