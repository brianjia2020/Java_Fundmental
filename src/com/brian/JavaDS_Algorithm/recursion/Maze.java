package com.brian.JavaDS_Algorithm.recursion;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        //tow dimensional array to simulate the maze
        int[][] maze = new int[8][7];
        //use 1. means there is a block
        //set the blocks
        for(int i=0;i<7;i++){
            maze[0][i] = 1;
            maze[7][i] = 1;
        }
        for(int i=0;i<8;i++){
            maze[i][0] = 1;
            maze[i][6] = 1;
        }
        maze[3][1] = 1;
        maze[3][2] = 1;


        //block all the way to show backtracking
//        maze[1][2] = 1;
//        maze[2][2] = 1;

        //print the maze
        for(int [] num: maze){
            System.out.println(Arrays.toString(num));
        }

        boolean b = setWay2(maze, 1, 1);
        System.out.println();
        //reprint the maze
        for(int [] num: maze){
            System.out.println(Arrays.toString(num));
        }
    }

    /**
     * 1. the initial i,j is the starting point
     * 2. the ending point is 6,5 at which the search will stop
     * 3. when maze[i][j] is 0, the point has not been touched
     *                    is 1, it is a block hence cannot go that way
     *                    is 2, it is a way
     *                    is 3, it has been tried but cannot find it like a dead end
     * 4. the search strategy is based on:
     *      left, then right, then top, the left
     *      later on we may replace it with "(x1-x2)^2+(y1-y2)^2" the absolute distance
     *
     * @param maze the maze to be searched
     * @param i the current row position
     * @param j the current col position
     * @return true if found, false if there is no way
     */
    public static boolean setWay(int[][] maze, int i, int j){
        if(maze[6][5]==2) { //found it
            return true;
        } else {
            if(maze[i][j]==0) { //if current pos has not been searched
                maze[i][j] = 2; //assume it can be a way
                if(setWay(maze,i+1,j)) { // down
                    return true;
                } else if (setWay(maze,i,j+1)){ // right
                    return true;
                } else if (setWay(maze,i-1,j)){ // up
                    return true;
                } else if (setWay(maze,i,j-1)){ // down
                    return true;
                } else {
                    //this is a dead end
                    maze[i][j] = 3;
                    return false;
                }
            } else { // if maze[i][j] != 0, it could be 1,2,3
                return false;
            }
        }
    }

    //change the strategy to up,right,down,left
    public static boolean setWay2(int[][] maze, int i, int j){
        if(maze[6][5]==2) { //found it
            return true;
        } else {
            if(maze[i][j]==0) { //if current pos has not been searched
                maze[i][j] = 2; //assume it can be a way
                if(setWay2(maze,i-1,j)) { // up
                    return true;
                } else if (setWay2(maze,i,j+1)){ // right
                    return true;
                } else if (setWay2(maze,i+1,j)){ // down
                    return true;
                } else if (setWay2(maze,i,j-1)){ // left
                    return true;
                } else {
                    //this is a dead end
                    maze[i][j] = 3;
                    return false;
                }
            } else { // if maze[i][j] != 0, it could be 1,2,3
                return false;
            }
        }
    }
}
