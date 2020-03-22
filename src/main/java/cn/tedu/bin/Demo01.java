package cn.tedu.bin;

public class Demo01 {
	public static void main(String[] args) {
		//i在内存中存储的是2进制数据
		//Java 编译器在编译的时候将 "50"
		//计算(Integer.parseInt)为2进制的 110010, 在运行期间
		//i 的值是 110010, 在输出时候 println
		//会自动的调用算法(Integer.toString())
		//将2进制 110010 转换为10进制字符串 "50"
		//显示出来.
		int i = 50;
		//显示i在内存中的2进制存储情况
		System.out.println(
				Integer.toBinaryString(i));
		System.out.println(i); //50
		
		for(i=0; i<=50; i++){
			System.out.println(
				Integer.toBinaryString(i));
		}
	}
}




