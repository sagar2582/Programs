import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        //base condition
        if(n == 0){
            return;
        }
        //work
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

}