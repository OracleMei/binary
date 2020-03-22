package cn.tedu.bin;

import org.apache.commons.lang.StringUtils;

public class Demo06 {

	public static void main(String[] args) {
		for(int i=-50; i<=50; i++){
			String bin = Integer.toBinaryString(i);
			String str = 
				StringUtils.leftPad(bin, 32, "0");
			System.out.println(str);
 		}
	}

}
