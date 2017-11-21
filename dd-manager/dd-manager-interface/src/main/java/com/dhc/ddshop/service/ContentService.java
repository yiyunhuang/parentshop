package com.dhc.ddshop.service;

import com.dhc.ddshop.pojo.po.TbContent;

import java.util.List;

public interface ContentService  {
    List<TbContent> listContentsByCid(Long id);
}
