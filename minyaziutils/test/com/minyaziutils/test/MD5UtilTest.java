package com.minyaziutils.test;

import org.junit.Test;

import com.minyaziutils.LogUtil;
import com.minyaziutils.MD5Util;

/**
 * MD5工具类Test<br>
 * 
 * @author minyazi
 */
public class MD5UtilTest {
	
	@Test
	public void test() {
		LogUtil.info(MD5Util.getMD5Bytes("test"));
		LogUtil.info("32位小写：" + MD5Util.get32LowerMD5("test"));
		LogUtil.info("32位大写：" + MD5Util.get32UpperMD5("test"));
		LogUtil.info("16位小写：" + MD5Util.get16LowerMD5("test"));
		LogUtil.info("16位大写：" + MD5Util.get16UpperMD5("test"));
		LogUtil.info("一次加密：" + MD5Util.convert("test"));
		LogUtil.info("两次解密：" + MD5Util.convert(MD5Util.convert("test")));
	}
	
}
