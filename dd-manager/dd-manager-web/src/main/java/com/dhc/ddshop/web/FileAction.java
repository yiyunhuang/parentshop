package com.dhc.ddshop.web;

import com.dhc.ddshop.service.FileService;
import com.dhc.ddshop.service.impl.FileServiceImpl;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import sun.nio.ch.IOUtil;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;

@Controller
public class FileAction {
    @Autowired
    private FileService fileService;

    @ResponseBody
    @RequestMapping(value="/file/upload" , method = RequestMethod.GET)
    public void config(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        System.out.println("config");
        //设置请求流和响应流字符集、内容类型
        request.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/josn");

        String action =request.getParameter("action");
        if("config".equals((action))){
            PrintWriter out =response.getWriter();
            InputStream inputStream =this.getClass().getClassLoader().getResourceAsStream("config.json");
            IOUtils.copy(inputStream,out,"UTF-8");
        }

    }
    @RequestMapping(value = "/file/upload",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> upload(MultipartFile upfile){
        System.out.println(upfile);
        return fileService.uploadImages(upfile);
    }

}
