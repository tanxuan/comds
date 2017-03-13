package com.code.data.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/13.
 */


public class Config {

    private String onlyCode;

    private Integer ip;

    private Map<String ,ItemCode>   itemCodeMap ;


    public Map<String, ItemCode> getItemCodeMap() {
        return itemCodeMap;
    }

    public void setItemCodeMap(Map<String, ItemCode> itemCodeMap) {
        this.itemCodeMap = itemCodeMap;
    }

    public String getOnlyCode() {
        return onlyCode;
    }

    public void setOnlyCode(String onlyCode) {
        this.onlyCode = onlyCode;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }
}
