

/**
 * 判断给定的一个数是不是3的指数次幂
 * 比如27=3^3，因此输入27返回true
 */
public class PowerOfThree {

	public boolean isPowerOfThree(int num) {
		if( num <= 0 ) return false;
		if( num == 1 ) return true;
		
		int base = num;
		int remain = 0;
		while( base >= 3 && remain == 0 ){
			remain = base % 3;
			base = base/3;
		}
		
		if(remain != 0)
			return false;
		else
			return true;
	}

}
