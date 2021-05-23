public class Peg {
    public static void main(String[] args) {
        String[][] pegArray;
        pegArray=new String[11][11];
        int locNumOfPegs=1;

        for (int y=1; y<=5; y++) {                               
            for (int x=0; x<=9; x++) {
                if (locNumOfPegs%2==0) {
                    pegArray[y][x]=" ";
                    pegArray[y][4]="X";  
                    pegArray[y][6]="X"; 
                    if (locNumOfPegs%4==0) {
                        pegArray[y][2]="X";  
                        pegArray[y][8]="X"; 
                    } else {

                    }
                } else {                             
                    pegArray[y][x]=" ";
                    pegArray[y][5]="X";  
                    if (locNumOfPegs==3) {
                        pegArray[y][3]="X";  
                        pegArray[y][7]="X";                            
                    } else {
                        pegArray[5][3]="X";  
                        pegArray[5][7]="X";   
                        pegArray[5][1]="X";  
                        pegArray[5][9]="X";                           
                    }
                   
                }            
            }
            locNumOfPegs++;
        }

        for (int y=1; y<=5; y++) {
            for (int x=1; x<=9; x++) {
                System.out.print(pegArray[y][x]);
            }
            System.out.println("");
        }
    }

}
/*
    dovoljene poteze
        f(x,y) -> f(x+2 or x-2,     y) x+1 mora biti zaseden
        f(x,y) -> f(x+1 or x-1,     y+2) x+1, y+1 oz. x-x, y-1 morata biti zasedena

*/