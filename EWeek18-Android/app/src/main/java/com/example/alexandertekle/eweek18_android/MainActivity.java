package com.example.alexandertekle.eweek18_android;

        import android.os.Bundle;
        import android.support.design.widget.TabLayout;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstancesDrawer();

        mListView = (ListView)findViewById(R.id.events_listview);
        String items[] = new String[10];

        for (int i=0;i<items.length;i++)
        {
            items[i]="Event " + i;
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.activity_main)
    }

    private void initInstancesDrawer() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab One"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab Two"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab Three"));
    }
}
