package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(nrGirls( new  int[]  {4, 5, 6, 6, 7, 6, 6, 1} ));
    }

    public static int nrGirls(int v[])
    {
        int c = 0;
        for (int roll : v)
        {
            if(roll!= 6)
                c++;
        }
        if(v[v.length-1] == 6)
            c = -1;
            return c;
    }
}
