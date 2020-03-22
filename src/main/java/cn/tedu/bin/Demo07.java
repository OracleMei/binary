package cn.tedu.bin;

import java.io.RandomAccessFile;

public class Demo07 {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(
				Integer.toBinaryString(max));
			int min = Integer.MIN_VALUE;
		System.out.println(
				Integer.toBinaryString(min));
		//如何使用16进制简写 最大值和最小值
// max = 01111111 11111111 11111111 11111111
//		 7   f    f   f    f   f    f   f
		max = 0x7fffffff;
		min = 0x80000000;
		
 
	}
}








