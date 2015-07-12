package com.v_dev.dhanraj.vizagbuzz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends Activity {
      DatabaseHelper db;
    String source1="";
    String destination1="";
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        db=new DatabaseHelper(this);


        Button btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText source = (EditText) findViewById(R.id.editText);
                source1 = source.getText().toString();
                EditText destination = (EditText) findViewById(R.id.editText2);
                destination1 = destination.getText().toString();
                TextView resp = (TextView) findViewById(R.id.textView);
                resp.setText("From " + source1 + " to " + destination1 + " the following are the busses available :");
                TextView tv1 = (TextView) findViewById(R.id.textView2);
                tv1.setText("38T");
                TextView tv2 = (TextView) findViewById(R.id.textView4);
                tv2.setText("400N");

                tv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent("com.v_dev.dhanraj.vizagbuzz.MainActivity3");
                        startActivity(i1);
                    }
                });

tv2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i2 = new Intent("com.v_dev.dhanraj.vizagbuzz.MainActivity4");
        startActivity(i2);

    }
});
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
