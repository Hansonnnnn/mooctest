

/**
 * �жϸ�����һ�����ǲ���3��ָ������
 * ����27=3^3���������27����true
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
