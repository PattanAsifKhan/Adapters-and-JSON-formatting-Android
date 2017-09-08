package asifcoffe.adapterandjsonpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
     adapter adapter;
    ArrayList<item> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list);
        arrayList=new ArrayList<>();
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        arrayList.add(new item(R.drawable.image,"image adapter","Asif"));
        adapter=new adapter(this,arrayList);
        listView.setAdapter(adapter);
    }
}
