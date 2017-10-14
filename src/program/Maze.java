package program;

public class Maze
{
	public Maze()
	{
// No action
}
	
	/** 
	* This prints the maze on the console
	*/
	public void printMaze()
	{
	
	//string [row][column]      size
	String[][] maze = new String [5][5];
	final int firstRow = 0;
	final int secondRow = 1;
	final int thirdRow = 2;
	final int fourthRow = 3;
	
	// populate maze
	for(int row = 0; row < maze.length; row++)
	{
		if (row == firstRow)
		{
			maze[row][0] = "X";
		}
		else if (row == 4)
		{
			maze[row][0] = "X";
		}
		else if (row == 3)
		{
			maze[row][0] = " ";		
		}
		else  (row == 2);
		{
			maze[row][0] = " ";
	}
		else (row == 1);
		{
			maze[row][0] = " ";
		}
		
}}}