import java.util.Stack;
public class nextGreaater{
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int NxtGreater[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
              s.pop();


            }
          
            if(s.isEmpty()){
            NxtGreater[i]=-1;
            }
            else{
                NxtGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
for(int i=0;i<NxtGreater.length;i++){
    System.out.print(NxtGreater[i]+" ");
}
System.out.println();     
 
    }
    
}
