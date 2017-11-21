package com.dhc.ddshop.portal.web;

import com.dhc.ddshop.common.util.PropKit;
import com.dhc.ddshop.pojo.po.TbContent;
import com.dhc.ddshop.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PortalIndexAction {

    @Autowired
    private ContentService contentService;
    @RequestMapping("/")
    public String portalIndex(Model model ){
        //第一步：使用service去查，根据tb_content_category的ID去查
        Long id = PropKit.use("ftp.properties").getLong("ftp.gallery");
        List<TbContent> list = contentService.listContentsByCid(id);
        //第二步：存放到model中
        model.addAttribute("ad1List",list);
        //第三步：返回首页
        return "index";
    }
}
