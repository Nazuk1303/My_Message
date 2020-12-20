package com.example.my_message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.net.URISyntaxException;

public class TextMassage extends AppCompatActivity {
    TextView textView;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_massage);
        textView=findViewById(R.id.textView);
        Bundle bundle=getIntent().getExtras();
        String inputmsg=bundle.getString("name").toString();
        textView.setText(inputmsg);
    }
    public void click(View view) {
        String text=textview.getText().toString();
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("name", text);
        startActivity(intent);


}
    }