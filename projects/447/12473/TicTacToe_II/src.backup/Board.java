

public class Board {
	/*
	 * ��Ա�����ĳ�ʼ���������޸ģ������ѡ���ʼ����ʽ
	 */
	protected char[][] cells;
	protected GameChessStrategy chessStrategy;
	protected GameWinStrategy_HVD winStrategyHVD;
	protected GameWinStrategy_HV winStrategyHV;
	protected Player player = Player.X;

	/*
	 * ���޸Ĺ��췽��������Ӻ��ʵĹ��췽��
	 */
	public Board(){
		cells = new char[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				cells[i][j] = '_';
			}
		}
		
		chessStrategy = new GameChessStrategy();
		winStrategyHVD = new GameWinStrategy_HVD();
		winStrategyHV = new GameWinStrategy_HV();
	}
	public Board(int size){
		cells = new char[size][size];
		for(int i = 0;i < size;i++){
			for(int j = 0;j < size;j++){
				cells[i][j] = '_';
			}
		}
		chessStrategy = new GameChessStrategy();
		winStrategyHVD = new GameWinStrategy_HVD();
		winStrategyHV = new GameWinStrategy_HV();
	}
	
	public Board(int boardSize, GameChessStrategy chessStrategy, GameWinStrategy_HVD winStrategy){
		cells = new char[boardSize][boardSize];
		for(int i=0; i<boardSize; i++){
			for(int j=0; j<boardSize; j++){
				cells[i][j] = '_';
			}
		}
		
		chessStrategy = new GameChessStrategy();
		winStrategyHVD = new GameWinStrategy_HVD();
		winStrategyHV = new GameWinStrategy_HV();
	}

	
	public Result nextMove(String move,String gameMode,String str,int step) {
		if((gameMode.charAt(0) == '0')&&(gameMode.charAt(1) == '0')){
			chessStrategy.putChess(cells, nextPlay(), move);
			return winStrategyHVD.check(cells);
		}else if((gameMode.charAt(0) == '0')&&(gameMode.charAt(1) == '1')){
			chessStrategy.putChess(cells, nextPlay(), move);
			return winStrategyHV.check(cells);
		}else if((gameMode.charAt(0) == '1')&&(gameMode.charAt(1) == '0')){
			chessStrategy.putchessFive(cells, nextPlay(), move, str, step);
			return winStrategyHVD.check(cells);
		}else if((gameMode.charAt(0) == '1')&&(gameMode.charAt(1) == '1')){
			chessStrategy.putchessFive(cells, nextPlay(), move, str, step);
			return winStrategyHV.check(cells);
		}
		return Result.GAMING;
	}
	
	protected Player nextPlay(){
		Player res = player;
		player = player == Player.X ? Player.O : Player.X;
		return res;
	}
	
	/*
	 * ����������޸�
	 */
	public void print(){
		String[] first = {
				"  A B C",
				"  A B C D",
				"  A B C D E",
				"  A B C D E F",
				"  A B C D E F G",
				"  A B C D E F G H",
				"  A B C D E F G H I",
		};
		int size = cells.length;
		System.out.println(first[size - 3]);
		for(int i=0 ;i<size; i++){
			System.out.print(i+1);
			for(int j=0; j<size; j++){
				System.out.print(" "+cells[i][j]);
			}
			System.out.println();
		}
	}
}
