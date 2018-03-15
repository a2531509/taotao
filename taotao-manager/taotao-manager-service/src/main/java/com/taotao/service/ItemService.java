package com.taotao.service;


import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

    TbItem getItemById(Long itemID);
    EasyUIDataGridResult getItemList(int page, int rows);
}
