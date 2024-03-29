package com.hanbit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.calculator.domain.CalcDTO;
import com.hanbit.calculator.service.CalcService;
import com.hanbit.calculator.service.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    EditText etNum1, etNum2;
    Button btPlus, btMinus, btMul, btDiv, btMod, btEqual;
    TextView tvResult;
    int result;
    CalcService servcie;
    CalcDTO cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = (EditText)findViewById(R.id.etNum1);
        etNum2 = (EditText)findViewById(R.id.etNum2);
        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMul = (Button) findViewById(R.id.btMul);
        btDiv = (Button) findViewById(R.id.btDiv);
        btMod = (Button) findViewById(R.id.btMod);
        btEqual = (Button) findViewById(R.id.btEqual);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMul.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btEqual.setOnClickListener(this);
        servcie = new CalcServiceImpl();
        cal = new CalcDTO();
    }

    @Override
    public void onClick(View v) {

        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        cal.setNum1(num1);
        cal.setNum2(num2);

        switch (v.getId()){
            case R.id.btPlus:
                result = servcie.plus(cal);
                break;
            case R.id.btMinus:
                result = servcie.minus(cal);
                break;
            case R.id.btMul:
                result =servcie.multi(cal);
                break;
            case R.id.btDiv:
                result = servcie.divid(cal);
                break;
            case R.id.btMod:
                result = servcie.mod(cal);
                break;
            case R.id.btEqual:
                tvResult.setText("RESULT :"+result);
                break;
        }

    }
}
