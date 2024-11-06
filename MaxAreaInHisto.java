import java.util.Stack;

public class MaxAreaInHisto{
    public static void MaxArea(int arr[]){
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];

        //Next smaller right
        Stack<Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();

            }
            s.push(i);
        } 
        //next smaller in left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nsl[i]=-1;

            }
            else{
                nsl[i]=s.peek();

            }
            s.push(i);
        }
        //currArea: width=j-i-1=nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int h=arr[i];
            int w=nsr[i]-nsl[i]-1;
            int currArea=h*w;

            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("maximum area in histogram is "+maxArea);
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};
MaxArea(arr);
    }
}