package QueueTest;


public class queuetest2 {
    public static String postfixtoinfix(String exp) {
    String result = "";
    StackChecking stk = new StackChecking(10);

    for(int i=0; i<exp.length(); i++) {
        char c = exp.charAt(i);
        if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^' ) {
            String p = stk.peek();
            stk.pop();
            String q = stk.peek();

            String val = q + c + p ;
            stk.push(val);
        }

        else {
        stk.push("" + c);
        }
    }
    result = result + stk.pop();



    return result;
    }




    public static void main(String [] args) {
        String a = "ab*c*d+k-";
        System.out.println(postfixtoinfix(a));

    }



}
