package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hp on 2018/8/29.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinCode() {
        return provinCode;
    }

    public void setProvinCode(int provinCode) {
        this.provinCode = provinCode;
    }
}
