package com.kocjan.nightly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button shareLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareLocation = (Button)findViewById(R.id.share_location_button);
        shareLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, SelectionActivity.class);
                startActivity(intent);

            }
        });
    }
}
