package setflag.utils;

import java.util.UUID;

public class UUIDUtils {
	/**
	 * 随机生成id
	 * @return
	 */
	public static String getId(){
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	
	/**
	 * 生成随机码
	 * @return
	 */
	public static String getCode(){
		return getId();
	}
	
	 public static int getRandom() {
		return (int)(1+Math.random()*(9-1+1));
	}
	
	public static void main(String[] args) {
		System.out.println(getRandom());
		System.out.println(getRandom());
		System.out.println(getRandom());
		System.out.println(getRandom());
	}
}
