package sg.edu.rp.c346.id21010650.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonPeter;
    Button buttonMary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPeter = findViewById(R.id.buttonPeter);
        buttonMary = findViewById(R.id.buttonMary);

        registerForContextMenu(buttonPeter);
        registerForContextMenu(buttonMary);

        buttonPeter.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent intentCallPeter = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + 92240336));
        startActivity(intentCallPeter);

        buttonMary.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent intentCallMary = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + 89675543));
        startActivity(intentCallMary);
    }
} );}} );}}