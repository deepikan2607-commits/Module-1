import java.util.*;
class arryinput{
    
    Scanner sc =new Scanner(System.in);
    int n=sc.newInt();
    int arr[]=new int [n];
    for (int i=0;i<n;i++){
        arr[i]=sc.newInt();
    }
    for(int i=0; i<n;i++){
        System.out.println(arr[i]);
    }
}
