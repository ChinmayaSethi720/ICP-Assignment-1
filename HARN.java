import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Shape{
    public int length,breadth;
    public Shape(int length, int breadth){
        this.length= length;
        this.breadth= breadth;
    }
    public void area(){
        System.out.println(length+" "+breadth);
    }
}
class Rectangle extends Shape{
    Rectangle(int l, int b){
        super(l,b);
    }
    @Override
    public void area() {
        System.out.println("\n"+length*breadth);
    }
}
public class hackerrank {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        Shape s= new Shape(l, b);
        s.area();
        Shape rect = new Shape(l, b);
        rect.area();
    }
}
