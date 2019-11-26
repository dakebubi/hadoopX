/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.fangfang.hadoop.file;

/**
 * TODO
 *
 * @author wangzheng
 * @version V1.0
 * @since 2019-11-26 17:06
 */

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Test {

    /**
     * 在 HDFS 中新建一个 test 文件夹
     * @param args
     */
    public static void main(String[] args) {

        FileSystem fileSystem = null;
        try {
            fileSystem = FileSystem.get(new URI("hdfs://localhost:9000/"), new Configuration(), "user1");
            fileSystem.mkdirs(new Path("/test"));
            //fileSystem.delete(new Path("/test"), true);
            fileSystem.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}