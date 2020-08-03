package com.example.sendmessageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ComposeMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);
    }
    public void onClickSend(View view) {
        EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
        String emailText = emailEditText.getText().toString();
        EditText subjectEditText = (EditText) findViewById(R.id.subjectEditText);
        String subjectText = subjectEditText.getText().toString();
        EditText messageEditText = (EditText) findViewById(R.id.messageEditText);
        String messageText = messageEditText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + emailText));
        intent.putExtra(Intent.EXTRA_SUBJECT, subjectText);
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        startActivity(intent);


    }

    }
