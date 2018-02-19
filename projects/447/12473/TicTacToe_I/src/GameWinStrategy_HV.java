

public class GameWinStrategy_HV {
	boolean isWon;
	char winChar;
	public Result check(char[][] cells)
	{
		int size = cells.length;
		char content = ' ';
		int x = 0;
		int y = 0;
		for(int i = 0;i < cells.length;i++){
			for(int j = 0;j <cells[0].length;j++){
				if(cells[i][j] != '_'){
					content = cells[i][j];
					x = i;
					y = j;
					for(int k = 0;k < 4;k++){
						switch(k){
						case 0:
							isWon = left(cells, x, y, content);
							break;
						case 1:
							isWon = right(cells, x, y, content);
							break;
						case 2:
							isWon = up(cells, x, y, content);
							break;
						case 3:
							isWon = down(cells, x, y, content);
							break;
						}
						if(isWon){
							break;
						}
					}
					if(isWon){
						break;
					}
				}
			}
			if(isWon){
				break;
			}
		}
		if(isWon){
			winChar = content;
			switch(winChar){
			case 'X':return Result.X_WIN;
			case 'O':return Result.O_WIN;
			default : break;
			}
		}
		for(int i = 0; i < size ; ++i)
		{
			for(int j = 0; j < size; ++j)
			{
				if(cells[i][j] == '_')
					return Result.GAMING;
			}
		}
		return Result.DRAW;

	}
	private boolean left(char[][] cells,int x,int y,char content){
		boolean isSuccessful = false;
		int time = 1;
		int i = x;
		int j = y;
		for(int k = 0;k < 3;k++){
			if((i > 0)&&(j > 0)){
				if(cells[i][--j] == content){
					time++;
					if(time == 3){
						isSuccessful = true;
					}
				
				}
			}else{
				break;
			}
		}
		return isSuccessful;
	}
	private boolean right(char[][] cells,int x,int y,char content){
		boolean isSuccessful = false;
		int time = 1;
		int i = x;
		int j = y;
		for(int k = 0;k < 3;k++){
			if((i > 0)&&(j < (cells[0].length - 1))){
				if(cells[i][++j] == content){
					time ++;
					if(time == 3){
						isSuccessful = true;
					}
				
				}
			}else{
				break;
			}
		}
		return isSuccessful;
	}
	private boolean up(char[][] cells,int x,int y,char content){
		boolean isSuccessful = false;
		int time = 1;
		int i = x;
		int j = y;
		for(int k = 0;k < 3;k++){
			if((i > 0)&&(j > 0)){
				if(cells[--i][j] == content){
					time++;
					if(time == 3){
						isSuccessful = true;
					}
				
				}
			}else{
				break;
			}
		}
		return isSuccessful;
	}
	private boolean down(char[][] cells,int x,int y,char content){
		boolean isSuccessful = false;
		int time = 1;
		int i = x;
		int j = y;
		for(int k = 0;k < 3;k++){
			if((i < (cells.length - 1))&&(j > 0)){
				if(cells[++i][j] == content){
					time++;
					if(time == 3){
						isSuccessful = true;
					}
				
				}
			}else{
				break;
			}
		}
		return isSuccessful;
	}
}
