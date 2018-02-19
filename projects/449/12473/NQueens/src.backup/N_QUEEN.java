import java.util.ArrayList;

/**
8�ʺ�������һ���Թ�������Ϊ���������⣺
����ܹ��� 8��8 �Ĺ������������Ϸ���8���ʺ�ʹ���κ�һ���ʺ��޷�ֱ�ӳԵ������Ļʺ�
Ϊ�˴ﵽ��Ŀ�ģ��������ʺ󶼲��ܴ���ͬһ�����С����л�б���ϡ�

һ������������������̴�С��8���ʺ��λ�ã��ж��Ƿ�Ϸ�(���κ�һ���ʺ��޷�ֱ�ӳԵ������Ļʺ�)
���ǻ�����һ��λ�õ��ַ�������","�ָ�ÿ���ʺ��λ�ã�ÿ���ʺ��λ������ĸ�����ֵ���ʽ���
��ĸ�����У����ִ����С�

�����������̴�С���Լ���������һ������8�ʺ������״̬�������ʽΪ�ַ��������ͬ��������position

������
����������������������������������������������������������������
isN_QUEEN����
����position: 
d8,g7,c6,h5,b4,e3,a2,f1

Ӧ���أ�
true
����������������������������������������������������������������
generateN_QUEEN����
�������� 

�ɷ��أ�
d8,g7,c6,h5,b4,e3,a2,f1
����������������������������������������������������������������

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
