package Bactracking;
boolean solveTill(int[][] maze,int x,int y,int[][] sol){
    if(x==N-1 && y==N-1 && maze[x][y]==1){
       sol[x][y]=1;
       return true;
    }
    if(isSafe(maze,x,y)==true){
        if(sol[x][y]==1){
            return false;
        }
        sol[x][y]=1;
        if(isSafe(maze,x,y-1)){
            return true;
        }
        if(isSafe(maze,x,y+1)){
            return true;
        }
        if(isSafe(maze,x+1,y)){
            return true;
        }
        if(isSafe(maze,x-1,y)){
            return true;
        }
        sol[x][y]=0;
        return false;
   }
}