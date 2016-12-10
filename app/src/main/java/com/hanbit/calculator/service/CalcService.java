package com.hanbit.calculator.service;

import com.hanbit.calculator.domain.CalcDTO;

/**
 * Created by hb2012 on 2016-12-10.
 */

public interface CalcService {
    public abstract int plus(CalcDTO param);
    public abstract int minus(CalcDTO param);
    public abstract int multi(CalcDTO param);
    public abstract int divid(CalcDTO param);
    public abstract int mod(CalcDTO param);
}
