
import java.util.ArrayList;

public class CheckStrategy {
	private int x;
	private int y;
	
	public boolean checkStrategy(int e, ArrayList<Integer> list){
		boolean isN_QUEEN = true;
		x = e%10;
		y = e/10;
		if((y == 1)&&(x == 1)){
			isN_QUEEN = checkRightHorizontal(e,list);//向右
			isN_QUEEN = checkRightAndDown(e,list);//向右下
			isN_QUEEN = checkDownVertical(e, list);//向下
		}else if((y == 1)&&(x == 8)){
			isN_QUEEN = checkRightHorizontal(e,list);//向右
			isN_QUEEN = checkRightAndUp(e, list);//向右上
			isN_QUEEN = checkUpVertical(e, list);//向上
		}else if((y == 8)&&(x == 1)){
			isN_QUEEN = checkLeftHorizontal(e,list);//向左
			isN_QUEEN = checkLeftAndDown(e, list);//向左下
			isN_QUEEN = checkDownVertical(e, list);//向下
		}else if((y == 8)&&(x == 8)){
			isN_QUEEN = checkLeftHorizontal(e,list);//向左
			isN_QUEEN = checkUpVertical(e, list);//向上
			isN_QUEEN = checkLeftAndUp(e, list);//向左上
		}else if(x == 1){
			isN_QUEEN = checkDownVertical(e,list);//向下
			isN_QUEEN = checkRightHorizontal(e, list);//向右
			isN_QUEEN = checkLeftHorizontal(e, list);//向左
			isN_QUEEN = checkLeftAndDown(e, list);//向左下
			isN_QUEEN = checkRightAndDown(e, list);//向右下
		}else if(x == 8){
			isN_QUEEN = checkUpVertical(e,list);//向上
			isN_QUEEN = checkRightHorizontal(e, list);//向右
			isN_QUEEN = checkLeftHorizontal(e, list);//向左
			isN_QUEEN = checkLeftAndUp(e, list);//向左上
			isN_QUEEN = checkRightAndUp(e, list);//向右上
		}else if(y == 1){
			isN_QUEEN = checkRightHorizontal(e,list);//向右
			isN_QUEEN = checkUpVertical(e, list);//向上
			isN_QUEEN = checkDownVertical(e, list);//向下
			isN_QUEEN = checkRightAndUp(e, list);//向右上
			isN_QUEEN = checkRightAndDown(e, list);//向右下
		}else if(y == 8){
			isN_QUEEN = checkLeftHorizontal(e,list);//向左
			isN_QUEEN = checkUpVertical(e, list);//向上
			isN_QUEEN = checkDownVertical(e, list);//向下
			isN_QUEEN = checkLeftAndUp(e, list);//向左上
			isN_QUEEN = checkLeftAndDown(e, list);//向左下
		}else{
			isN_QUEEN = checkUpVertical(e, list);//向上
			isN_QUEEN = checkDownVertical(e, list);//向下
			isN_QUEEN = checkLeftHorizontal(e,list);//向左
			isN_QUEEN = checkRightHorizontal(e,list);//向右
			isN_QUEEN = checkLeftAndUp(e, list);//向左上
			isN_QUEEN = checkLeftAndDown(e, list);//向左下
			isN_QUEEN = checkRightAndUp(e, list);//向右上
			isN_QUEEN = checkRightAndDown(e, list);//向右下
		}
		return isN_QUEEN;
	}
	
	private boolean checkRightHorizontal(int e,ArrayList<Integer> list){
		boolean isH_QUEEN = true;
		int a = e / 10;//列
		int b = e % 10;//行
		int times = 5;
		for(Integer i:list){
			a = e / 10;
			b = e % 10;
			times = 5;
			if(!isH_QUEEN){
				break;
			}
			while(times > 0){
				if((int)i == ((++a) * 10 + b)){
					isH_QUEEN = false;
					break;
				}
				times--;
			}
		}
		return isH_QUEEN;
	}
	

	private boolean checkLeftHorizontal(int e,ArrayList<Integer> list){
		boolean isH_QUEEN = true;
		int a = e / 10;//列
		int b = e % 10;//行
		int times = 5;
		for(Integer i:list){
			a = e / 10;
			b = e % 10;
			times = 5;
			if(!isH_QUEEN){
				break;
			}
			while(times > 0){
				if((int)i == ((--a) * 10 + b)){
					isH_QUEEN = false;
					break;
				}times--;
			}
				
		}
		return isH_QUEEN;
	}
	
	private boolean checkDownVertical(int e,ArrayList<Integer> list){
		boolean isV_QUEEN = true;
		int a = e / 10;//列
		int b = e % 10;//行
		int times = 5;
		for(Integer i:list){
			a = e / 10;
			b = e % 10;
			times = 5;
			if(!isV_QUEEN){
				break;
			}
			while(times > 0){
				if((int)i == (a * 10 + (++b))){
					isV_QUEEN = false;
					break;
				}times--;
			}
				
		}
		return isV_QUEEN;
	}
	
	private boolean checkUpVertical(int e,ArrayList<Integer> list){
		boolean isV_QUEEN = true;
		int a = e / 10;//列
		int b = e % 10;//行
		int times = 5;
		for(Integer i:list){
			a = e / 10;
			b = e % 10;
			times = 5;
			if(!isV_QUEEN){
				break;
			}
			while(times > 0){
				if((int)i == (a * 10 + (--b))){
					isV_QUEEN = false;
					break;
				}times--;
			}
				
		}
		return isV_QUEEN;
	}
	
	private boolean checkRightAndDown(int e,ArrayList<Integer> list){
		boolean isRD_QUEEN = true;
		int a = e / 10;//列
		int b = e % 10;//行
		int times = 5;
		for(Integer i:list){
			a = e / 10;
			b = e % 10;
			times = 5;
			if(!isRD_QUEEN){
				break;
			}
			while(times > 0){
				if((int)i == ((++a) *10  + (++b))){
				isRD_QUEEN = false;
				break;
			}
				times--;
			}
			
		}
		return isRD_QUEEN;
	}
	
	private boolean checkLeftAndDown(int e,ArrayList<Integer> list){
		boolean isLD_QUEEN = true;
		int a = e / 10;//列
		int b = e % 10;//行
		int times = 5;
		for(Integer i:list){
			a = e / 10;
			b = e % 10;
			times = 5;
			if(!isLD_QUEEN){
				break;
			}
			while(times > 0){
				int p = (--a) *10  + (++b);
				if((int)i == p){
				isLD_QUEEN = false;
				break;
			}
				times--;
			}
			
		}
		return isLD_QUEEN;
	}
	
	private boolean checkRightAndUp(int e,ArrayList<Integer> list){
		boolean isRU_QUEEN = true;
		int a = e / 10;//列
		int b = e % 10;//行
		int times = 5;
		for(Integer i:list){
			a = e / 10;
			b = e % 10;
			times = 5;
			if(!isRU_QUEEN){
				break;
			}
			while(times > 0){
				if((int)i == ((++a) *10  + (--b))){
				isRU_QUEEN = false;
				break;
			}
				times--;
			}
			
		}
		return isRU_QUEEN;
	}
	
	private boolean checkLeftAndUp(int e,ArrayList<Integer> list){
		boolean isLU_QUEEN = true;
		int a = e / 10;//列
		int b = e % 10;//行
		int times = 5;
		for(Integer i:list){
			a = e / 10;
			b = e % 10;
			times = 5;
			if(!isLU_QUEEN){
				break;
			}
			while(times > 0){
				if((int)i == ((--a) *10  + (--b))){
				isLU_QUEEN = false;
				break;
			}
				times--;
			}
			
		}
		return isLU_QUEEN;
	}

}
