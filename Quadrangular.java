package Practice_problem_2;

import java.util.Scanner;

public class Quadrangular {
    public void Squre(int x) {
        int p = x * x;
        System.out.println("The area of a the square is: \n " + "("+x+")^2 \n ="+ p + " unit square");

    }
    public void Rectangle(int x,int y) {
        int p = x * y;
        System.out.println("The area of a the Rectangle is: \n " + "("+x+"x"+y+") \n ="+ p + " unit square");

    }
    public void Parallelogram(int x,int y) {
        int p = x * y;
        System.out.println("The area of a the Parallelogram is: \n " + "("+x+"x"+y+") \n ="+ p + " unit square");

    }
    public void Rhombus(int x,int y) {
        float p = (float) (.5 * x * y);
        System.out.println("The area of a the Rhombus is: \n " + ".5x"+x+"x"+y+" \n ="+ p + " unit square");

    }
    public void Trapezium(int x,int y, int z) {
        float p = (float) (.5 * (x + y) * z);
        System.out.println("The area of a the Trapezium is: \n " + ".5x("+x+"+"+y+")x"+z+" \n ="+ p + " unit square");

    }
    public void Kite(int x,int y) {
        float p = (float) (.5 * x * y);
        System.out.println("The area of a the Kite is: \n " + ".5x"+x+"x"+y+" \n ="+ p + " unit square");

    }
    public static void main(String[] args) {
        Quadrangular qua = new Quadrangular();
        Scanner ss = new Scanner(System.in);
        System.out.print("What type of Quadrangular's area do you want to calculate? \n 1.Square \n 2.Rectangle \n 3.Parallelogram \n 4.Rhombus \n 5.Trapezium \n 6.Kite \n Type a number which you want:");
        int p = ss.nextInt();
        if (p==1){
            System.out.println("You have chosen Square for counting area... \n put a side of square:");
            int x = ss.nextInt();
            qua.Squre(x);
        } else if (p==2){
            System.out.println("You have chosen Rectangle for counting area... \n put the height of the Rectangle:");
            int x = ss.nextInt();
            System.out.println("put the width of the Rectangle:");
            int y = ss.nextInt();
            qua.Rectangle(x,y);
        } else if (p==3){
            System.out.println("You have chosen Parallelogram for counting area... \n put the base of the Parallelogram:");
            int x = ss.nextInt();
            System.out.println("put the height of the Parallelogram:");
            int y = ss.nextInt();
            qua.Parallelogram(x,y);
        } else if (p==4){
            System.out.println("You have chosen Rhombus for counting area... \n put a diagonal of the Rhombus:");
            int x = ss.nextInt();
            System.out.println("put the other diagonal of the Rhombus:");
            int y = ss.nextInt();
            qua.Rhombus(x,y);
        } else if (p==5){
            System.out.println("You have chosen Trapezium for counting area... \n put a length of a parallel side  of the Trapezium:");
            int x = ss.nextInt();
            System.out.println("put the length of other parallel side of the Trapezium: ");
            int y = ss.nextInt();
            System.out.println("Put the distance of these parallel sides:");
            int z = ss.nextInt();
            qua.Trapezium(x,y,z);
        } else if (p==6){
            System.out.println("You have chosen Kite for counting area... \n put a diagonal of the Kite:");
            int x = ss.nextInt();
            System.out.println("put the other diagonal of the Kite:");
            int y = ss.nextInt();
            qua.Kite(x,y);
        }
        else {
            System.out.println("Error value. \nYOU HAVE TO PUT FROM 1 TO 6..... ");

        }
    }
}

