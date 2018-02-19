

public class Game {
    /**
     * Game的接口方法，我们会通过该方法进行测试
     * @param gameMode为游戏模式,有四种可能，00,01,10,11
     * @param moveStr为落子序列
     * @param size棋盘大小，size最小为3， 最大为9
     * @return 游戏结果
     */
	/*
	 * 请修改该方法
	 */
	public Result playGame(String gameMode, String moveStr, int size){
    	Board board = new Board(size);
    	
    	String[] moves = moveStr.split(",");
    	Result res = Result.GAMING;
    	int step = 0;
    	for(String move: moves){
    		step++;
    		res = board.nextMove(move,gameMode,moveStr,step);
    		board.print();
    		// 锟斤拷戏锟斤拷锟斤拷
    		if( !res.equals(Result.GAMING) )
    			break;
    	}
    	return res;
    }
}
