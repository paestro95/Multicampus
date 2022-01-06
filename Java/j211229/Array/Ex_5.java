package j211229.Array;
// 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.    
public class Ex_5 {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i = arr.length-1; i >=0; i--){
            System.out.println(arr[i]);
        }
        
        
    }
}
