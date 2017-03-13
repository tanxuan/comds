package com.code.data.download;

import com.code.data.model.Config;
import com.code.data.model.ItemCode;

/**
 * Created by Administrator on 2017/3/13.
 */
public interface IConfigHandle {

      void   load();  // 装载配置文件

      void  uninstall();  // 卸载配置文件

      boolean  removeItem(String key);  // 删除节点

      void   addItem(ItemCode item);  // 添加节点

      void   updataItem(String key,ItemCode itemCode);  //  修改节点





}
