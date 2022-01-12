package stack;

public class ITP1 {
	static int precedense(char c) {
		switch(c) {
		case'+':
		case'-':
			return 1;
		case'*':
		case'/':
			return 2;
		case'^':
			return 3;
		}
		return -1;
	}
    static String infixtopostfix(String exp) {
    	String result = "";
    	StackTest stacks = new StackTest(10);
    	for(int i=0;i<exp.length();i++) {
    		char c = exp.charAt(i);
    		if(precedense(c)>0) {
    			while(stacks.isEmpty()==false && precedense(c)>stacks.peek()) {
    				result = result+stacks.pop();	
    			}
    			stacks.push(c);
    		}
    		else if(c=='(') {
    			stacks.push(c);
    		}
    		else if(c==')'){
    			char x = stacks.pop();
    			while(x!='(') {
    				result=result+x;
    				x = stacks.pop();
    				
    			}
    				
    		}
    		else {
    			result= result+c;
    		}
    	}
    	while(!stacks.isEmpty()) {
    		result = result + stacks.pop();
    	}
    	return result;
    }
    public static void main(String[] args) {
    	//infixtopostfix i = new infixtopostfix();
    	System.out.println(infixtopostfix("A+(C*D)"));
    	
    }
}
