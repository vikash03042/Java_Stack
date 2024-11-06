import java.util.Stack;

public class StockSpan {
    public static void   span(int Stocks[],int span[]){
        Stack<Integer>s =new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<Stocks.length;i++){
            int currprice =Stocks[i];
            while(!s.isEmpty()&&currprice>Stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);

        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        span(stocks,span);
        for(int i=1;i<=span.length;i++){
            System.out.println(span[i]+" ");
        }
    }
    
}
