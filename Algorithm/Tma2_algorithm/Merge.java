/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tma2_algorithm;

/**
 *
 * @author HP
 */
public class Merge {
    
 public static void MergeQueue(int[] Q1, int[] Q2){
 int c= 0;
int[] Q = new int[(Q1.length + Q2.length)];
 for(int x=0;x<Q1.length;x++){
 Q[c] = Q1[x];
 c++;
  }
  for(int y=0;y<Q2.length;y++){
 Q[c] = Q2[y];
 c++;
}
 printQueue(Q);
}
public static void printQueue(int[] Q){
for(int x=0;x<Q.length;x++){
System.out.println(Q[x]);
}
}

public static void main(String[] args) {
int[] Q1 = {1,4,6,9};
int[] Q2 = {2, 7, 5};
MergeQueue(Q1, Q2);
}

    
   
   

}
