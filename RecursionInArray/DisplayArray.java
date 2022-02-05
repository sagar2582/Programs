import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        displayArr(a, 0);  // 0 Says that we are starting from the index '0'
    }

    public static void displayArr(int[] a, int idx){
        if(idx == a.length){
            return;
        }
        System.out.println(a[idx]);
        displayArr(a, idx+1);

    }

}