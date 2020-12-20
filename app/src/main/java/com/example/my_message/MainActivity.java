package com.example.my_message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextEntermsg);
    }

    public void click(View view) {
        String msg=editText.getText().toString();
        Intent intent=new Intent(this,TextMassage.class);
        intent.putExtra("name",msg);
        startActivity(intent);

}

    }

