package com.dhc.ddshop.service;

import com.dhc.ddshop.pojo.po.TbItem;

import java.util.List;

/**
 * User: DHC
 * Date: 2017/11/6
 * Time: 9:48
 * Version:V1.0
 */
public interface ItemService {

    TbItem getById(Long itemId);

    List<TbItem> listItems();
}
