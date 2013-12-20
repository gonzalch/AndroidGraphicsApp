package com.example.cs375___hw1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MyActivity extends Activity {
    EditText squareText;
    EditText rectText;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        squareText = (EditText)findViewById(R.id.square_side);
        rectText = (EditText)findViewById(R.id.rect_color);
    }

    public void squareButtonClick(View view) {

        Toast.makeText(this, "square clicked", Toast.LENGTH_SHORT).show();

        Intent squareIntent = new Intent(MyActivity.this, SquareActivity.class);
        Bundle squareBundle = new Bundle();
        squareBundle.putInt("key", Integer.parseInt(squareText.getText().toString()));
        squareIntent.putExtras(squareBundle);
        MyActivity.this.startActivity(squareIntent);
    }

    public void rectButtonClick(View view) {
        Toast.makeText(this, "rectangle clicked", Toast.LENGTH_SHORT).show();

        Intent rectIntent = new Intent(MyActivity.this, RectActivity.class);
        Bundle rectBundle = new Bundle();
        rectBundle.putString("key", rectText.getText().toString());
        rectIntent.putExtras(rectBundle);
        MyActivity.this.startActivity(rectIntent);
    }

    public void crinklyButtonClick(View view) {
        Toast.makeText(this, "crinkly clicked", Toast.LENGTH_SHORT).show();

        Intent crinklyIntent = new Intent(MyActivity.this, CrinklyActivity.class);
        MyActivity.this.startActivity(crinklyIntent);
    }

    public void animatedButtonClick(View view) {
        Toast.makeText(this, "animated clicked", Toast.LENGTH_SHORT).show();

        Intent animatedIntent = new Intent(MyActivity.this, AnimatedActivity.class);
        MyActivity.this.startActivity(animatedIntent);
    }

    public void cubeButtonClick(View view) {
        Toast.makeText(this, "cube clicked", Toast.LENGTH_SHORT).show();

        Intent cubeIntent = new Intent(MyActivity.this, CubeActivity.class);
        MyActivity.this.startActivity(cubeIntent);
    }
}
