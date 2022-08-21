package sk.skillmea;

import java.util.Arrays;

public class Training01 {
    public static void main(String[] args) {
        int[] poleInt = new int[10];
        for (int i =0; i < poleInt.length; i++) {
//            poleInt= {1,2,3,4,5,6,7,8,9,10};
            poleInt[i] = (int) (Math.random() * 100);

            System.out.println(poleInt[i]);
        }
        Arrays.sort(poleInt);
            System.out.println(Arrays.toString(poleInt));
//            System.out.println(Arrays.toString(poleInt));
        }
    }

