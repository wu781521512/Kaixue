package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mybutterknife.BindView;
import com.example.mybutterknife.Binding;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.mTvFirst)
    TextView mTvTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding.INSTANCE.bind(this);
        mTvTextView.setText("改变了");
    }
}
