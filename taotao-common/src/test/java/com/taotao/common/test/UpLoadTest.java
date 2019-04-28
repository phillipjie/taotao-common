package com.taotao.common.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

/**
 * 
 * 测试图片的上传功能
 * @author Phillip Rade Xu
 * @date 创建时间：2019年4月26日 下午10:14:01
 * @version 1.0
 */

public class UpLoadTest {
	@Test
	public  void upL() throws SocketException, IOException {
		FTPClient ftpc=new FTPClient();
		ftpc.connect("localhost", 21);
		ftpc.login("fzftp", "fzftp");
		FileInputStream inputStream = new FileInputStream(new File("e:\\t.jpeg"));
		//ftpc.changeWorkingDirectory("/home");
		//以字节流上传，否则出现图片编码错误
		//获取图片md5，需要依赖commons.codec的jar包
		String md5 = DigestUtils.md5Hex(inputStream);
		IOUtils.closeQuietly(inputStream);
		FileInputStream inputStream2 = new FileInputStream(new File("e:\\t.jpeg"));
		String basePath="/img";
		ftpc.changeWorkingDirectory(basePath);
//		String filePath="/2016/09/12";
//		if (!ftpc.changeWorkingDirectory(basePath+filePath)) {
//			//如果目录不存在创建目录
//			String[] dirs = filePath.split("/");
//			String tempPath = basePath;
//			for (String dir : dirs) {
//				if (null == dir || "".equals(dir)) continue;
//				tempPath += "/" + dir;
//				if (!ftpc.changeWorkingDirectory(tempPath)) {
//					if (!ftpc.makeDirectory(tempPath)) {
//					} else {
//						ftpc.changeWorkingDirectory(tempPath);
//					}
//				}
//			}
//		}
		ftpc.setFileType(FTPClient.BINARY_FILE_TYPE);
		ftpc.storeFile(md5+".jpg", inputStream2);
		ftpc.logout();
	}
}
