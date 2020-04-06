package com.syahru.dewa19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
String Negara[] = new String[]{"Indonesia","Italia","Spayol","Malaysia","Amerika"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Negara);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(view.getContext(),Indonesia.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent = new Intent(view.getContext(),Italia.class);
                    startActivityForResult(intent,1);
                }
                if (position==2){
                    Intent intent = new Intent(view.getContext(),Malaysia.class);
                    startActivityForResult(intent,2);
                }
                if (position==3){
                    Intent intent = new Intent(view.getContext(),Spayol.class);
                    startActivityForResult(intent,3);
                }
                if (position==4){
                    Intent intent = new Intent(view.getContext(),Amerika.class);
                    startActivityForResult(intent,4);
                }
            }
        });
    }
}
