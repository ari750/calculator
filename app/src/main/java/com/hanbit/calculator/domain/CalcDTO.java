package com.hanbit.calculator.domain;

/**
 * Created by hb2012 on 2016-12-10.
 */

//은닉한 시키는 것은 상속과 구현하지 않는다. POJO -> 마틴파울러
public class CalcDTO {
    private int num1, num2;

    //Read
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    //Write
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
