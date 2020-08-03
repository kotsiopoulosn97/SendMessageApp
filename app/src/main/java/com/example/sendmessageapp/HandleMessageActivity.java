package com.example.sendmessageapp;
import android.content.Intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HandleMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_handle_message);
    Intent intent = getIntent(); //μόνο μία φορά
    // Ανάκτηση από την πρόθεση του κειμένου του email και εμφάνισή του
     String emailText = intent.getStringExtra("email");
    TextView emailView = (TextView) findViewById(R.id.emailTextView);
    emailView.setText(emailText);
    //Ανάκτηση από την πρόθεση του κειμένου του subject και εμφάνισή του
    String subjectText = intent.getStringExtra("subject");
    TextView subjectView = (TextView)findViewById(R.id.subjectTextView);
    subjectView.setText(subjectText);
    //Ανάκτηση από την πρόθεση του κειμένου του message και εμφάνισή του
    String messageText = intent.getStringExtra("message");
    TextView messageView = (TextView)findViewById(R.id.messageTextView);
    messageView.setText(messageText);
    }
}

