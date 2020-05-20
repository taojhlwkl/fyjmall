package com.fyj.fyjmall.fyjmallthird_party;

import com.aliyun.oss.OSS;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class FyjmallThirdPartyApplicationTests {

    @Autowired
    private OSS oss;
    @Test
    void contextLoads() throws FileNotFoundException {


// 上传内容到指定的存储空间（bucketName）并保存为指定的文件名称（objectName）。
        String content = "Hello OSS";
        InputStream inputStream = new FileInputStream("E:\\0d40c24b264aa511.jpg");
        oss.putObject("fyjmall", "0d40c24b264aa511.jpg", inputStream);

// 关闭OSSClient。
        oss.shutdown();
        System.out.println("上传完成");
    }
}
