import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 10 rows and 10 columns
    private final int ROWS = 10;
    private final int COLS = 10;
    
    // constants for the location of the 8 cells initially alive
    private final int X1 = 2, Y1 = 0;
    private final int X2 = 2, Y2 = 1;
    private final int X3 = 3, Y3 = 3;
    private final int X4 = 4, Y4 = 3;
    private final int X5 = 4, Y5 = 4;
    private final int X6 = 6, Y6 = 3;
    private final int X7 = 7, Y7 = 7;
    private final int X8 = 8, Y8 = 7;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add Bugs (a type of Actor) to the 8 initial locations
        Bug Bug1 = new Bug();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, Bug1);
        
        Bug Bug2 = new Bug();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, Bug2);
        
        Bug Bug3 = new Bug();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, Bug3);
        
        Bug Bug4 = new Bug();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, Bug4);
        
        Bug Bug5 = new Bug();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, Bug5);
        
        Bug Bug6 = new Bug();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, Bug6);
        
        Bug Bug7 = new Bug();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, Bug7);
        
        Bug Bug8 = new Bug();
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, Bug8);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // insert magic here...
        int alive_neighbors = 0;
        for(int rows = 0;
                rows < 9;
                rows++)
        {
            for (int columns = 0;
                    columns < 9;
                    columns++)
            {
                ArrayList <Location> neighbors = getOccupiedAdjacentLocations(rows, columns); 
                
            }
        }
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
    }

}
