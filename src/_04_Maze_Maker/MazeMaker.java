package _04_Maze_Maker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	
	private static Maze maze;
	
	private static Random randGen = new Random();
	private static Stack<Cell> uncheckedCells = new Stack<Cell>();
	
	
	public static Maze generateMaze(int w, int h){
		width = w;
		height = h;
		maze = new Maze(width, height);
		
		//4. select a random cell to start
		
		Cell cellStart = Maze.cells[randGen.nextInt(Maze.cells.length)][randGen.nextInt(Maze.cells.length)];
		//5. call selectNextPath method with the randomly selected cell
		selectNextPath(cellStart);
		
		return maze;
	}

	//6. Complete the selectNextPathMethod
	private static void selectNextPath(Cell currentCell) {
		//A. mark cell as visited
		currentCell.setBeenVisited(true);
		//B. Get an ArrayList of unvisited neighbors using the current cell and the method below
		ArrayList<Cell> c = getUnvisitedNeighbors(currentCell);
	
		//C. if has unvisited neighbors,
		if(c.size() > 0) {
			
			//C1. select one at random.
			currentCell = c[randGen.nextInt(getUnvisitedNeighbors(currentCell).size())][randGen.nextInt(getUnvisitedNeighbors(currentCell).size())];
			
			//C2. push it to the stack
//unvisitedNeighbors(randy.nextInt(unvisitedNeighbors.size())).push();
			//C3. remove the wall between the two cells

			//C4. make the new cell the current cell and mark it as visited
		
			//C5. call the selectNextPath method with the current cell
			
		}
		//D. if all neighbors are visited
		
			//D1. if the stack is not empty
			
				// D1a. pop a cell from the stack
		
				// D1b. make that the current cell
		
				// D1c. call the selectNextPath method with the current cell
				
			
		
	}

	//7. Complete the remove walls method.
	//   This method will check if c1 and c2 are adjacent.
	//   If they are, the walls between them are removed.
	private static void removeWalls(Cell c1, Cell c2) {
		
	}
	
	//8. Complete the getUnvisitedNeighbors method
	//   Any unvisited neighbor of the passed in cell gets added
	//   to the ArrayList
	private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
		/*
		 *	for (int i = c.getX() - 1; i < c.getX() + 1; i++) {
		 *		for (int j = c.getY() - 1; j < c.getY() + 1; j++) {
		 *			if (Maze.cells[i][j].hasBeenVisited() == false) {
		 *				uncheckedCells.add(Maze.cells[i][j]);
		 *			}
		 *		}
		 * 	}
		 */
		return null;
	}
}
