package com.code.data.model;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ItemCode {

    private String  url ;  //  入口

    private String  itemName;  //  节点名称

    private String itemId;  //  节点id

    private Integer itemType;//  抓取类型

    private String loginName;  // 登陆帐号

    private String loginPwd; // 登陆密码

    private List<String>  elements; // 页面元素

    private List<String>  jsCodes;  // 页面js

    private Map<String,String> headers; // 请求头参数

    private Proxy  proxy;  // 代理

    private Integer overtime;// 超时时间

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    public List<String> getJsCodes() {
        return jsCodes;
    }

    public void setJsCodes(List<String> jsCodes) {
        this.jsCodes = jsCodes;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
}
