public class RatMazeAWD {

    int locStartPosX;
    int locStartPosY;

    int locFinishPosX;
    int locFinishPosY;   
    
    static int globalFound=0;
    
    public int[][] initializeMaze() {        
        int maze[][]={  {2,1,1,1,1}, 
                        {1,0,0,0,1}, 
                        {1,0,1,1,1},
                        {0,0,1,1,3} };
        return maze;
    }

    public int[][] initializeSolution(){
        int maze[][]={  {0,0,0,0,0}, 
                        {0,0,0,0,0}, 
                        {0,0,0,0,0},
                        {0,0,0,0,0} };
        return maze;        
    }

    public void printMaze (int[][] pMaze) {             
        for (int x=0; x<pMaze.length; x++) {
            for (int y=0; y<pMaze[x].length; y++) {
                System.out.print(pMaze[x][y]);
            }
            System.out.println("");
        }

    }

    public void getStartFinishPos (int[][] pMaze) {
        for (int x=0; x<pMaze.length; x++){
            for (int y=0; y<pMaze[x].length; y++) {
                if (pMaze[x][y]==2) {
                    locStartPosX=x;
                    locStartPosY=y;
                }
                if (pMaze[x][y]==3) {
                    locFinishPosX=x;
                    locFinishPosY=y; 
                }                
            }
        }
    }

    public int[][]  searchSolution(int[][] pInitialMaze, int[][] pSolution, int pPosX, int pPosY, int pStatus ) {
        if (pStatus==1) {
            return pSolution;
        } 


        if (pPosX>=pInitialMaze.length || pPosX<0) {
            return pSolution;
        }
        else {
            if (pPosY>=pInitialMaze[pPosX].length || pPosY<0) {
                return pSolution;
            }
        }

        if (pInitialMaze[pPosX][pPosY]==0) {
            return pSolution;
        }

        pSolution[pPosX][pPosY]=1;

        try {
            Thread.sleep(2000);     
            System.out.println(pPosX+":"+pPosY);
            this.printMaze(pSolution);   
            System.out.println("");    
        } catch (InterruptedException e) {
            e.printStackTrace();
        }        
        

        pSolution=searchSolution(pInitialMaze, pSolution, pPosX+1, pPosY, globalFound );
        pSolution=searchSolution(pInitialMaze, pSolution, pPosX, pPosY +1, globalFound);     
//        pSolution=searchSolution(pInitialMaze, pSolution, pPosX-1, pPosY, globalFound );   

        if (pInitialMaze[pPosX][pPosY]==3) {
//            this.printMaze(pSolution);

            globalFound=1;
        }

        return pSolution;
    }

    public static void main (String[] args) {         
        int[][] locSolution;
        RatMazeAWD locRatMaze = new RatMazeAWD();
        int[][] locInitialMaze=locRatMaze.initializeMaze();
        int[][] locSolutionMaze=locRatMaze.initializeSolution();
        locRatMaze.getStartFinishPos(locInitialMaze);        
        locRatMaze.printMaze(locInitialMaze);
        


    }
} 