package com.dhc.upload;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class FtpUploadTest {
    @Test
    public void testFTPClient() throws Exception{
        //创建FTPClient客户端
        FTPClient ftpClient =new FTPClient();
        //创建FTP连接
        ftpClient.connect("10.31.161.110",21);
        //登录
        ftpClient.login("ftpuser","hyf110hyf");
        //读取本地文件
        FileInputStream fileInputStream = new FileInputStream(new File("d:\\101.gif"));
        //配置上传参数
        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");

        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        //上传文件
        ftpClient.storeFile("hello.gif",fileInputStream);
        //关闭连接
        fileInputStream.close();
        ftpClient.logout();

    }
}
