import java.util.Arrays;
import java.util.Scanner;

/**
 * 矩阵类，实现矩阵的加法，矩阵乘法，点乘以及转置方法
 * 其中加法和点乘方法需要有两种实现方式
 * 1.传入一个MyMatrix对象进行2个矩阵的操作
 * 2.从控制台（console）读入一个矩阵数据，再进行操作
 * 所有的数据均为int型
 * 输入数据均默认为正确数据，不需要对输入数据进行校验
 * @author Ray Liu & Qin Liu
 *
 */
public class MyMatrix {

	private int[][] data;
	private int m; //矩阵的第一维长度
	private int n; //矩阵的第二维长度
	
	/**
	 * 构造函数，参数为2维int数组
	 * a[i][j]是矩阵中的第i+1行，第j+1列数据
	 * @param a
	 */
	public MyMatrix(int[][] a){
		this.data = a;
		m=a.length;
		n=a[0].length;
	}

	/**
	 * 返回2维int矩阵
	 * @return int[][]
	 */
	public int[][] getArray(){
		return data;
	}

	/**
	 * 返回矩阵的第一维长度
	 * @return int
	 */
	public int getM(){
		return m;
	}

	/**
	 * 返回矩阵的第二维长度
	 * @return
	 */
	public int getN(){
		return n;
	}
	
	/**
	 * 实现矩阵加法，返回一个新的矩阵
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
	 * 实现矩阵乘法，返回一个新的矩阵
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
	 * 实现矩阵的点乘，返回一个新的矩阵
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
	 * 实现矩阵的转置，返回一个新的矩阵
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
	 * 从控制台读入矩阵数据，进行矩阵加法，读入数据格式如下：
	 * m n
	 * m * n 的数据方阵，以空格隔开
	 * example:
	 * 4 3
	 * 1 2 3 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 返回一个新的矩阵
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
	 * 输入格式同上方法相同
	 * 实现矩阵的乘法
	 * 返回一个新的矩阵
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
	 * 打印出该矩阵的数据
	 * 起始一个空行，结束一个空行
	 * 矩阵中每一行数据呈一行，数据间以空格隔开
	 * example：
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
	 * 判断是否相等的方法，考生不要修改！！
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
