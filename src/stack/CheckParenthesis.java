package stack;

public class CheckParenthesis {
	
	public boolean checkBalanced(String exp) {
		
		StackTest stk=new StackTest(5);
		String openbraces="[{(";
		String closedbraces="]})";
		
		for(int i=0;i<exp.length();i++) {
			
			char braces=exp.charAt(i);
			if(braces=='[' || braces=='{' || braces=='(') {
				
				stk.push(braces);
			}
			else {
				char popbracket=stk.pop();
				int closedbracketindex=closedbraces.indexOf(braces);
				char crosspondingOpenbrackt=openbraces.charAt(closedbracketindex);
				
				if(popbracket!=crosspondingOpenbrackt) {
					return false;
				}
			}
			
		}
		if(stk.isEmpty()) {
			return true;
		}
		return false;
		
	}
	
	public static void main (String [] args) {
		
		CheckParenthesis c=new CheckParenthesis();
		System.out.println(c.checkBalanced("{()"));
	}

}
