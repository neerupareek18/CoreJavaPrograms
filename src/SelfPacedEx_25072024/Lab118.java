package SelfPacedEx_25072024;

import java.util.Arrays;
import java.util.Scanner;

public class Lab118 {
    public static void main(String[] args) {
                String[] strs=new String[5];
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<strs.length;i++){
                    strs[i]=sc.nextLine();
                    System.out.println(strs[i]);
                }
                System.out.println(strs[4]);
System.out.println(Arrays.toString(strs));

            }

        }
