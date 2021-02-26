
package com.example.nlji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button setting;
ListView list;
String[]  births = {
       "2013.02.25", "1995.09.02"
};
String[] names = {
     "박진아", "백충원"
};
Integer[] images = {
         R.drawable.jinaxx, R.drawable.sample
};
Integer[] images2 = {
R.drawable.ic_gold, R.drawable.ic_svg_silver
};
Integer[] records={
        5,6
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList adapter = new CustomList(MainActivity.this);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        setting = (Button)findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, settingActivity.class);
                startActivity(intent);

            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {//Toast.makeText(getBaseContext(), names[+position],Toast.LENGTH_LONG).show();
                if (position == 0) {
                    Intent in = new Intent(MainActivity.this, naviActivity.class);
                    in.putExtra("key", names[position]);
                    startActivity(in);

                }
                if(position ==1 ){
                    Intent in1 = new Intent(MainActivity.this, sampleActivity.class);
                    in1.putExtra("key", names[position]);
                    startActivity(in1);

                }
            }
        });
    }
    public class CustomList extends ArrayAdapter<String>{
        private final Activity context;
        public CustomList(Activity context){
            super(context, R.layout.listitem,names);
            this.context = context;
        }

        public View getView(int position, View view, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.listitem,null,true);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            ImageView medalImage = (ImageView) rowView.findViewById(R.id.medalImage);
            TextView name = (TextView) rowView.findViewById(R.id.name);
            TextView birth = (TextView) rowView.findViewById(R.id.birth);
            TextView record = (TextView) rowView.findViewById(R.id.record);


            birth.setText(births[position]);
            imageView.setImageResource(images[position]);
            medalImage.setImageResource(images2[position]);
            name.setText(names[position]);
            record.setText(records[position]+"건의 성장 기록");

            return rowView;
        }
    }
}
