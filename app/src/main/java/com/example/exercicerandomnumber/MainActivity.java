package com.example.exercicerandomnumber;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.textViewChoseNumber = findViewById(R.id.textViewChoseNumber);
        this.mViewHolder.textViewSelectNumber = findViewById(R.id.textViewSelectedNumber);
        this.mViewHolder.buttonPlay = findViewById(R.id.buttonPlay);

        this.mViewHolder.buttonPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonPlay){
           sortearNumero();
        }
    }

    private void sortearNumero() {
        int randomNumer = new Random().nextInt(11);
        this.mViewHolder.textViewSelectNumber.setText("Numero: " + randomNumer);
    }

    private static class ViewHolder {
        TextView textViewChoseNumber;
        Button buttonPlay;
        TextView textViewSelectNumber;
    }

}