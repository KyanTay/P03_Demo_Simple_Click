package sg.edu.rp.c346.id20037834.p03_demo_simple_click;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button buttonDisplay;
    EditText editInput;
    ToggleButton toggleBtn;
    RadioGroup genderRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.textViewDisplay);
        buttonDisplay = findViewById(R.id.buttonDisplay);
        editInput = findViewById(R.id.editTextInput);
        toggleBtn = findViewById(R.id.toggleButtonEnable);
        genderRadioGroup = findViewById(R.id.radioGroupGender);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.getText().toString();
                String stringResponse = editInput.getText().toString();
               int checkRadioGender = genderRadioGroup.getCheckedRadioButtonId();

                if (checkRadioGender == R.id.radioButtonGenderMale){
                    stringResponse = "He says " + stringResponse;
                }
                else{
                    stringResponse = "She says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }
        });

        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleBtn.isChecked()){
                    editInput.setEnabled(true);
                }
                else{
                    editInput.setEnabled(false);
                }
            }
        });
    }
}
