/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tma2_algorithm;

/**
 *
 * @author HP
 */
public class Reverse {
  
public static void Reverse(int[] Q){
for(int x=0; x<((Q.length-1)/2);x++){
int temp = Q[x];
Q[x]=Q[(Q.length-1-x)];
Q[(Q.length-1-x)] = temp;
}
printQueue(Q);
}
public static void printQueue(int[] Q){
for(int x=0;x<Q.length;x++){
System.out.println(Q[x]);
}
}
public static void main(String[] args) {
int[] Q = {1,4,6,9, 2, 7, 5};
Reverse(Q);

        }


}
