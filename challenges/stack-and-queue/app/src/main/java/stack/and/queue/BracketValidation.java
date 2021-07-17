package stack.and.queue;

public class BracketValidation {

    public boolean validateBrackets(String bracket){
        Stack<Character> stack=new Stack<>();

        char[] bracketArr= bracket.toCharArray();

        for (char charr:bracketArr
             ) {
            if("{}(){}".contains(""+charr)){
                if("[({".contains(""+charr)){
                    stack.push(charr);
                }else if(
                        charr==']' && stack.peek().equals("[")||
                        charr==')' && stack.peek().equals("(")||
                        charr=='}' && stack.peek().equals("{")
                ){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
