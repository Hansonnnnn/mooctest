/*
 * ������޸Ļ���չ����
 */
import java.util.ArrayList;


public class GameChessStrategy {
	
	public void putChess(char[][] cells, Player currentPlayer, String chessPos)
	{
		int i = chessPos.charAt(1) - '1';
		int j = chessPos.charAt(0) - 'A';
		cells[i][j] = currentPlayer == Player.X ? 'X' : 'O';
	}
	public void putchessFive(char[][] cells, Player currentPlayer, String chessPos,String str,int step){
		ArrayList<String> list = new ArrayList<String>();
		String[] moves = str.split(",");
		for(String move:moves){
			list.add(move);
		}
		if((step / 2)>5){
			int a = list.get(step - 5).charAt(1) - '1';
			int b = list.get(step - 5).charAt(0) - 'A';
			cells[a][b] = currentPlayer == Player.X ? 'X' : 'O';
		}
		int i = chessPos.charAt(1) - '1';
		int j = chessPos.charAt(0) - 'A';
		cells[i][j] = currentPlayer == Player.X ? 'X' : 'O';
	}
}
