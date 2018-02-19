public class TicTacToe_I {
    /**
     * Game�Ľӿڷ��������ǻ�ͨ���÷������в���
     * @param sΪ����Ĳ�������
     * @return ��Ϸ���
     */
	public Result playGame(String s){
		Board board = new Board();
		String[] moves = s.split(",");
    	Result res = Result.GAMING;
    	for(String move: moves){
    		
    		res = board.nextMove(move);
    		board.print();
    		// ��Ϸ����
    		if( !res.equals(Result.GAMING) )
    			break;
    	}
    	return res;
	}
	public Result playGame(String gameMode, String moveStr, int size){
    	Board board = new Board(size);
    	
    	String[] moves = moveStr.split(",");
    	Result res = Result.GAMING;
    	int step = 0;
    	for(String move: moves){
    		step++;
    		res = board.nextMove(move,gameMode,moveStr,step);
    		board.print();
    		// ��Ϸ����
    		if( !res.equals(Result.GAMING) )
    			break;
    	}
    	return res;
    }
    
}
