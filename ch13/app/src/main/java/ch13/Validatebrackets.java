package ch13;

public class Validatebrackets {

    public boolean brackets (String checkString){
        Stack<String> testStack = new Stack<>();
        if (checkString.isEmpty()){
            return true;
        }

        String[] arrToCheck = checkString.split("");

        for (String item: arrToCheck){
            if ((item.equals("}") || item.equals("]") || item.equals(")")) && item.isEmpty()) {
                return false;
            }
            if (item.equals("{") || item.equals("[") || item.equals("(")) {
                testStack.push(item);
            }else if (item.equals("}")) {
                if (testStack.top.value.equals("{")) testStack.pop();
                else return false;
            }else if (item.equals(")")) {
                if (testStack.top.value.equals("(")) testStack.pop();
                else return false;
            }else if (item.equals("]")) {
                if (testStack.top.value.equals("[")) testStack.pop();
                else return false;
            }

        }
        return testStack.isEmpty();


    }
}
