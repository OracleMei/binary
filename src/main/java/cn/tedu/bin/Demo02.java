package cn.tedu.bin;

import org.apache.commons.lang.StringUtils;

public class Demo02 {

	public static void main(String[] args) {
		String str = "12";	
		// 在 str 的左侧填充字符 0 填充以后
		// 总的长度是 10 个字符
		// 0000000012
		String s=
			StringUtils.leftPad(str, 10, "0");
		System.out.println(s);
		str = "123";
		s=StringUtils.leftPad(str, 10, "0");
		System.out.println(s);
	}
}






