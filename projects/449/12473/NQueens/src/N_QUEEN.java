import java.util.ArrayList;

/**
8皇后问题是一个以国际象棋为背景的问题：
如何能够在 8×8 的国际象棋棋盘上放置8个皇后，使得任何一个皇后都无法直接吃掉其他的皇后？
为了达到此目的，任两个皇后都不能处于同一条横行、纵行或斜线上。

一、根据我们输入的棋盘大小和8个皇后的位置，判断是否合法(即任何一个皇后都无法直接吃掉其他的皇后)
我们会输入一个位置的字符串，用","分割每个皇后的位置，每个皇后的位置用字母加数字的形式表达
字母代表列，数字代表行。

二、给定棋盘大小，自己生成任意一种满足8皇后的棋盘状态，输出形式为字符串，规格同上述参数position

样例：
————————————————————————————————
isN_QUEEN方法
参数position: 
d8,g7,c6,h5,b4,e3,a2,f1

应返回：
true
————————————————————————————————
generateN_QUEEN方法
参数：无 

可返回：
d8,g7,c6,h5,b4,e3,a2,f1
————————————————————————————————

*/

public class N_QUEEN {
	public boolean isN_QUEEN(String position){
		boolean isN_QUEEN = false;
		ArrayList<Integer> poList = new ArrayList<Integer>();
		poList = poInt(position);
		for(Integer e:poList){
			CheckStrategy cs = new CheckStrategy();
			isN_QUEEN = cs.checkStrategy((int)e,poList);
		}
		return isN_QUEEN;
	}
	private ArrayList<Integer> poInt(String position){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int poInt = 0; 
		String[] po = position.split(",");
		for(String s:po){
			switch(s.charAt(0)){
			case 'a':
				poInt = 10 + (s.charAt(1) - '0');
				list.add(poInt);
				break;
			case 'b':
				poInt = 20 + (s.charAt(1) - '0');
				list.add(poInt);
				break;
			case 'c':
				poInt = 30 + (s.charAt(1) - '0');
				list.add(poInt);
				break;
			case 'd':
				poInt = 40 + (s.charAt(1) - '0');
				list.add(poInt);
				break;
			case 'e':
				poInt = 50 + (s.charAt(1) - '0');
				list.add(poInt);
				break;
			case 'f':
				poInt = 60 + (s.charAt(1) - '0');
				list.add(poInt);
				break;
			case 'g':
				poInt = 70 + (s.charAt(1) - '0');
				list.add(poInt);
				break;
			case 'h':
				poInt = 80 + (s.charAt(1) - '0');
				list.add(poInt);
				break;
			}
		}
		return list;
	}
	public String generateN_QUEEN(){
		int num = (int) (Math.random() * 5);
		String[] kind = {
				"f1,a2,e3,b4,h5,c6,g7,d8",
				"h6,g1,f5,e2,8d,c3,g7,a4",
				"c8,h7,d6,g5,a4,f3,b2,e1",
				"d1,f2,h3,b4,g5,a6,c7,e8",
				"h4,g6,f8,e2,d7,c1,b3,a5",
		};
		return kind[num];
	}
}
