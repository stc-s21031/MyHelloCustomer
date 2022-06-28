package jp.suntech.s21031.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btNameClear = findViewById(R.id.btNameClear);
        btNameClear.setOnClickListener(listener);
        Button btAddClear = findViewById(R.id.btAddClear);
        btAddClear.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            EditText inputName = findViewById(R.id.tvInputName);
            EditText inputAdd = findViewById(R.id.tvInputAdd);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            switch (id){
                case R.id.btClick:
                    String inputNameStr = inputName.getText().toString();
                    String inputAddStr = inputAdd.getText().toString();
                    output.setText(inputAddStr+"にお住まいの"+inputNameStr+"さん、こんにちは！");
                    break;
                case R.id.btNameClear:
                    inputName.setText("");
                    output.setText("");
                    break;
                case R.id.btAddClear:
                    inputAdd.setText("");
                    output.setText("");
                    break;
            }

        }
    }
}