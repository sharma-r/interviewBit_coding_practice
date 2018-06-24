//Min Steps in Infinite Grid 


public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
int no_steps=0;
        int x_diff,y_diff;
        int n1=A.size();
        int n2=B.size();

        int x_curr=A.get(0);
        int y_curr=B.get(0);

        for(int i=1;i<n1;i++){
           x_diff=Math.abs(x_curr-A.get(i));
           y_diff=Math.abs(y_curr-B.get(i));

           x_curr=A.get(i);
           y_curr=B.get(i);

           no_steps=no_steps+Math.max(x_diff,y_diff);
        }
       


   

     return no_steps;
         
}

    }