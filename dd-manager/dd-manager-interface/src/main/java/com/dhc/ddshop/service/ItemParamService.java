package com.dhc.ddshop.service;

import com.dhc.ddshop.common.dto.Page;
import com.dhc.ddshop.common.dto.Result;
import com.dhc.ddshop.pojo.po.TbItemParam;
import com.dhc.ddshop.pojo.vo.TbItemParamCustom;

public interface ItemParamService {

    /**
     *对参数规格说明表进行分页操作
     * @param page
     * @return
     */
    Result<TbItemParamCustom> listItemParamsByPage(Page page);
    /**
     * 通过分类的ID查询ItemParam
     * @param cid
     * @return
     */
    TbItemParam getItemParamByCid(Long cid);
}
