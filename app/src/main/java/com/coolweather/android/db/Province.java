package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by YJJ on 2018/4/9.
 * 数据库
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getCode() {
        return provinceCode;
    }

    public void setCode(int code) {
        this.provinceCode = code;
    }
}