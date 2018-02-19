import java.util.Arrays;
import java.util.Scanner;

/**
 * �����࣬ʵ�־���ļӷ�������˷�������Լ�ת�÷���
 * ���мӷ��͵�˷�����Ҫ������ʵ�ַ�ʽ
 * 1.����һ��MyMatrix�������2������Ĳ���
 * 2.�ӿ���̨��console������һ���������ݣ��ٽ��в���
 * ���е����ݾ�Ϊint��
 * �������ݾ�Ĭ��Ϊ��ȷ���ݣ�����Ҫ���������ݽ���У��
 * @author Ray Liu & Qin Liu
 *
 */
public class MyMatrix {

	private int[][] data;
	private int m; //����ĵ�һά����
	private int n; //����ĵڶ�ά����
	
	/**
	 * ���캯��������Ϊ2άint����
	 * a[i][j]�Ǿ����еĵ�i+1�У���j+1������
	 * @param a
	 */
	public MyMatrix(int[][] a){
		this.data = a;
		m=a.length;
		n=a[0].length;
	}

	/**
	 * ����2άint����
	 * @return int[][]
	 */
	public int[][] getArray(){
		return data;
	}

	/**
	 * ���ؾ���ĵ�һά����
	 * @return int
	 */
	public int getM(){
		return m;
	}

	/**
	 * ���ؾ���ĵڶ�ά����
	 * @return
	 */
	public int getN(){
		return n;
	}
	
	/**
	 * ʵ�־���ӷ�������һ���µľ���
	 * @param B
	 * @return
	 */
	public MyMatrix plus(MyMatrix B){
		MyMatrix A = new MyMatrix(this.getArray());
		int[][] aTrix = A.data;
		int[][] bTrix = B.data;
		for(int i = 0; i < A.m; i++){
			for(int j = 0; j < A.n; j++){
				aTrix[i][j] += bTrix[i][j];
			}
		}
		A.data = aTrix;
		return A;
	}
	
	/**
	 * ʵ�־���˷�������һ���µľ���
	 * @param B
	 * @return
	 */
	public MyMatrix times(MyMatrix B){
		MyMatrix A = new MyMatrix(this.getArray());
		int[][] result = new int[A.m][B.n]; 
		for(int reInX = 0;reInX < A.m;reInX++){
			for(int i = 0;i < A.n;i++){
				for(int j = 0;j < B.m;j++){
					result[i][j] += A.data[i][j] * B.data[j][i]; 	
				}
			}
	}
		A.data = result;
		return A;
	}
	
	/**
	 * ʵ�־���ĵ�ˣ�����һ���µľ���
	 * @param b
	 * @return
	 */
	public MyMatrix times(int b){
		MyMatrix A = new MyMatrix(this.getArray());
		int[][] aTrix = A.data;
		for(int i = 0;i < A.m; i++){
			for(int j = 0; j < A.n; j++){
				aTrix[i][j] = aTrix[i][j] * b;
			}
		}
		A.data = aTrix;
		return A;
	}
	
	/**
	 * ʵ�־����ת�ã�����һ���µľ���
	 * @return
	 */
	public MyMatrix transpose(){
		MyMatrix A = new MyMatrix(this.getArray());
		int[][] aTrix1 = A.data;
		int[][] aTrix2 = new int[A.n][A.m];
		for(int i = 0; i < A.m;i++){
			for(int j = 0;j < A.n;j++){
				aTrix2[j][i] = aTrix1[i][j]; 
			}
		}
		A.data = aTrix2;
		return A;
	}
	
	/**
	 * �ӿ���̨����������ݣ����о���ӷ����������ݸ�ʽ���£�
	 * m n
	 * m * n �����ݷ����Կո����
	 * example:
	 * 4 3
	 * 1 2 3 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * ����һ���µľ���
	 * @return
	 */
	public MyMatrix plusFromConsole(){
		MyMatrix A = new MyMatrix(this.data);
		Scanner sc = new Scanner(System.in);
		String mn = sc.nextLine();
		int m = Integer.parseInt(mn.split(" ")[0]);
		int n = Integer.parseInt(mn.split(" ")[1]);
		int[][] result = new int[m][n];
		String[] data;
		for(int i = 0;i < m;i++){
			data = sc.nextLine().split(" ");
			for(int j = 0;j < n;j++){
				result[i][j] = Integer.parseInt(data[j]);
			}
		}
		sc.close();
		A.data = result;
		return plus(A);
	}
	
	/**
	 * �����ʽͬ�Ϸ�����ͬ
	 * ʵ�־���ĳ˷�
	 * ����һ���µľ���
	 * @return
	 */
	public MyMatrix timesFromConsole(){
		MyMatrix A = new MyMatrix(this.data);
		Scanner sc = new Scanner(System.in);
		String mn = sc.nextLine();
		int m = Integer.parseInt(mn.split(" ")[0]);
		int n = Integer.parseInt(mn.split(" ")[1]);
		int[][] result = new int[m][n];
		String[] data;
		for(int i = 0;i < m;i++){
			data = sc.nextLine().split(" ");
			for(int j = 0;j < n;j++){
				result[i][j] = Integer.parseInt(data[j]); 
			}
		}
		sc.close();
		A.data = result;
		return times(A);
	}
	
	/**
	 * ��ӡ���þ��������
	 * ��ʼһ�����У�����һ������
	 * ������ÿһ�����ݳ�һ�У����ݼ��Կո����
	 * example��
	 * 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 
	 */
	public void print(){
		System.out.println();
		for(int i = 0;i < this.m;i++){
			for(int j = 0;j < this.n;j++){
				if(j != this.n - 1){
					System.out.print(this.data[i][j] + " ");
				}else{
					System.out.print(this.data[i][j]);
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println();
	}
	
	/**
	 * �ж��Ƿ���ȵķ�����������Ҫ�޸ģ���
	 */
	public boolean equals(Object obj){
		
		if(obj instanceof MyMatrix){
			MyMatrix matrix = (MyMatrix) obj;
			
			if(this.data.length != matrix.data.length){
				return false;
			}
			
			for(int i=0 ; i<this.data.length ; ++i){
				if(!Arrays.equals(this.data[i], matrix.data[i])){
					return false;
				}
			}
			
			return true;
			
		}else{
			return false;
		}
	}
	
}
