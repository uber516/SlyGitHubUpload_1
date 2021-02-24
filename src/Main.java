import java.security.GuardedObject;
import java.util.Scanner;
import java.awt.Graphics;
import  java.lang.Object;
public class Main {







public static char slyCooperGridAndPosition(char[][]array1,int row,int column){
        for(int z=6;6>z;z=z-3){
        if(z==3){

        int x=0;

        int y=0;


        if(z==3)
        array1[3][3]='O';

        row=array1.length;
        column=array1[0].length;

        array1[x][y]='X';


        for(x=0;x<row; x++){
        //row iteration

        for(y=0;y<column; y++){
//column iteration

        System.out.print(array1[y][x]='X');
        }
        System.out.println();//use this for new line to
        //print array in matrix format
        return array1[3][3]='O';

        }
        }

        }
        int x=0;
        int y=0;
        row=array1.length;
        column=array1[0].length;

        array1[x][y]='X';


        for(x=0;x<row; x++){
        //row iteration

        for(y=0;y<column; y++){
//column iteration

        System.out.print(array1[y][x]='X');

        // System.out.println(array1[3][3] = 'O');
        }
        System.out.println();//use this for new line to
        //print array in matrix format


        }
        // slyCurrentPosition(array1[][], row, column );

        //end of one cycle for loop
        return'o';
        }


        int y;

public void attack(boolean x){

        }

public void jump(boolean x){

        }

public void runForward(boolean x){

        }

public void runBackward(boolean x){


        }

public void runLeft(boolean x){

        }

public void runRight(boolean x){

        }

public static void slyCurrentPosition(char array[][],int row,int column){
        array[3][3]='O';


        }

public static void main(String args[]){
GUI_Gameboard gameboard = new GUI_Gameboard();
String[] initialization = new String[0];
gameboard.main(initialization);
Maze map = new Maze();
map.printMap();

        char[][]gridLayout=new char[5][5];

        int length1=gridLayout.length;
        int length2=gridLayout[0].length;
        Scanner scan=new Scanner(System.in);
        gridLayout[length1-3][length2-3]='O';


        System.out.println("Turn on Console? ");

        System.out.println("Press 1, otherwise press any key.");
        int yes=1;
        String d="d",a="a",w="w",q="q",f="f",s="s";
        if(yes==1){

        slyCooperGridAndPosition(gridLayout,length2-3,length1-3);
        // int layout [][] = new int[10][10];


        while(true){
//slyCooperGridAndPosition(gridLayout, length1 - 3, length2 -3);

        System.out.println(gridLayout.length+" grid length");
        System.out.println("Choose which action Sly wants to use ");

        System.out.println("");
        System.out.println(
        "-----------------"+
        "-----------------"+
        "-----------------"+
        "-----------------"+
        "-----------------"+
        "-----------------"+
        "-----------------"+
        "-----------------"+
        "-----------------");
        System.out.println("");

        System.out.println("");
        System.out.println("Controls: ");
        System.out.println("");

        System.out.println("f = attack");
        System.out.println("s = run backward");
        System.out.println("w = run forward");
        System.out.println("q = jump");
        System.out.println("a = run left");
        System.out.println("d = run right");
        Scanner input=new Scanner(System.in);

        String action=input.nextLine();
        Main Move=new Main();
        if(action.equals(s)){
        Move.runBackward(action.equals(s));
        System.out.println("Sly spins around and runs backward");
        System.out.println("");
        slyCooperGridAndPosition(gridLayout,length1-1,length2-1);
        gridLayout[length1-3][length2-3]='O';


        //slyPosition(int tiles[x][y]);


        System.out.println("");
        }else if(action.equals(w)){
        Move.runForward(action.equals(w));
        System.out.println("Sly sprints forward");
        System.out.println("");
        }else if(action.equals(a)){
        Move.runLeft(action.equals(a));
        System.out.println("Sly dashes to the left");
        System.out.println("");
        }else if(action.equals(d)){
        Move.runRight(action.equals(d));
        System.out.println("Sly dashes to the right");
        System.out.println("");
        }else if(action.equals(q)){
        Move.jump(action.equals(q));
        System.out.println("Sly performs a tactical jump");
        System.out.println("");
        }else if(action.equals(f)){
        Move.attack(action.equals(f));
        System.out.println("Sly swipes viciously with his cain");
        System.out.println("");
        }else{

        System.out.println("Invalid key stroke");


        }
        System.out.println("The console remains off.");
        }

        }


        }


    }








