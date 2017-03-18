package com.mobilerepair.app.customlistview42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    public static final String[] names = new String[] { "abc",
            "xyz", "pqr", "lmn" };

    public static final String[] phone = new String[] {
            "9874561236",
            "9856472135", "9547863214",
            "9745682139" };

    ListView listView;
    List<RowItems> rowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowItems = new ArrayList<RowItems>();
        for (int i = 0; i < names.length; i++) {
            RowItems item = new RowItems(names[i], phone[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.lv);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Toast toast = Toast.makeText(getApplicationContext(),
                "Item " + (position + 1) + ": " + rowItems.get(position),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

    }
}
