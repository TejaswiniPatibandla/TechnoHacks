 import java.util.Scanner;
 class TicTacToe {
    public static void printfun(char[][] b){
 for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print("["+b[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
    public static boolean won(char[][] b,char p){
         for(int i=0;i<b.length;i++){
            if(b[i][0]==p && b[i][1]==p && b[i][2]==p){
                return true;
            }
        }
        for(int j=0;j<b[0].length;j++){
                if(b[0][j]==p && b[1][j]==p && b[2][j]==p){
                    return true;
                }
            }

            if(b[0][0]==p && b[1][1]==p && b[2][2]==p){
                return true;
            }
            if(b[0][2]==p && b[1][1]==p && b[2][0]==p){
                return true;
            }
            return false;
        
    }
    public static boolean isfull(char[][] b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                if(b[i][j]==' '){
                    return false;
                }}}
                return true;
    }
    public static void main(String args[]){
        char b[][]=new char[3][3];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j]=' ';
            }
        }
        char p='A';
        boolean game=false;
        Scanner sc=new Scanner(System.in);
        while(!game){
            printfun(b);
            System.out.println("player "+p+" enter: ");
            int i=sc.nextInt();
            int j=sc.nextInt();
            System.out.println();
            if(b[i][j]==' '){
             b[i][j]=p;
             game=won(b,p);
             if(!game && isfull(b)){
                System.out.println("match draw");
                break;
             }
             if(game){
                System.out.println("player "+p+" won");
             }
             else{
                if(p=='A')
                p='B';
                else
                p='A'; 

             }
            }
            else{
                System.out.println("Invalid move.play again");
            }
        }
        printfun(b);
        
    }
}
