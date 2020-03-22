package cn.tedu.bin;

import org.apache.commons.lang.StringUtils;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 输出0~50实际的存储情况:
		 */
		for(int i=0; i<=50; i++){
			String bin = 
					Integer.toBinaryString(i);
			String s = StringUtils
					.leftPad(bin, 32, "0");
			System.out.println(s);
		}
	}
}
