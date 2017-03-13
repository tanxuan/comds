package com.code.data.download;

import com.code.data.model.ItemCode;

import java.awt.*;

/**
 * Created by Administrator on 2017/3/13.
 */
public enum DefaultConfigHandle implements IConfigHandle {

    INTERFACE ;

    @Override
    public void load() {

    }

    @Override
    public void uninstall() {

    }

    @Override
    public boolean removeItem(String key) {
        return false;
    }

    @Override
    public void addItem(ItemCode item) {

    }

    @Override
    public void updataItem(String key, ItemCode itemCode) {

    }
}
