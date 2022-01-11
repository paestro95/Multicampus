package j211229.Array;

public class Ex_10 {
    public static void main(String[] args) {
     int [] numArr = new int[10];
     
     for(int i=0; i<numArr.length;i++){
         numArr[i]=i;
         System.out.println(numArr[i]);
     }
     System.out.println();
     System.out.println();

     for(int i=0; i<5; i++){
         int n = (int)(Math.random()*10);
         int tmp = numArr[0];
         numArr[0] = numArr[n];
         numArr[n] = tmp;
     }
     for (int i =0; i<numArr.length; i++){
         System.out.println(numArr[i]);
     }
    }
}
