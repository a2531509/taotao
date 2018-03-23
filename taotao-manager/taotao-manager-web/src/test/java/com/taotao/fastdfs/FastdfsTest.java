package com.taotao.fastdfs;

import org.csource.fastdfs.*;
import org.testng.annotations.Test;

/**
 * @author HeisenberXu
 * @create 2018- 03- 23 下午 14:14
 */
public class FastdfsTest {

    @Test
    public void testUpload() throws Exception {
        // 1、把FastDFS提供的jar包添加到工程中
        // 2、初始化全局配置。加载一个配置文件。
        ClientGlobal.init("E:\\ideaFile\\taotao\\taotao-manager\\taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
        // 3、创建一个TrackerClient对象。
        TrackerClient trackerClient = new TrackerClient();
        // 4、创建一个TrackerServer对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 5、声明一个StorageServer对象，null。
        StorageServer storageServer = null;
        // 6、获得StorageClient对象。
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        // 7、直接调用StorageClient对象方法上传文件即可。
        String[] strings = storageClient.upload_file("C:\\Users\\Administrator\\Desktop\\201995-120HG1030762.jpg", "jpg", null);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void testFastDfsClient() throws Exception {
        FastDFSClient client = new FastDFSClient("E:\\ideaFile\\taotao\\taotao-manager\\taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
        String uploadFile = client.uploadFile("C:\\Users\\Administrator\\Desktop\\u=3588772980,2454248748&fm=27&gp=0.jpg", "jpg");
        System.out.println(uploadFile);
    }


}
