package com.example.admin.w2d5greendao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.admin.w2d5greendao.MainActivity;
import com.example.admin.w2d5greendao.R;

public class AddActivity extends AppCompatActivity {

    public static final String TITLE = "title";
    public static final String AUTHOR = "author";
    private EditText titleText;
    private EditText authorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        titleText = (EditText) findViewById(R.id.aAddEditTitle);
        authorText = (EditText) findViewById(R.id.aAddEditAuthor);
    }

    public void save(View view) {
        String title = titleText.getText().toString();
        String author = authorText.getText().toString();
        Intent main = new Intent(this,MainActivity.class);
        main.putExtra(TITLE, title);
        main.putExtra(AUTHOR, author);
        startActivity(main);
    }
}

