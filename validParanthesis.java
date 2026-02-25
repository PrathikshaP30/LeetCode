class Solution {
    public boolean isValid(String s) {
       Map<Character, Character> braces = Map.of(')','(', '}','{',']','[');
       Deque<Character> stack = new ArrayDeque<>();

       for (char c : s.toCharArray()){
            if (braces.containsKey(c)){
                if (!stack.isEmpty() && stack.peek().equals(braces.get(c)) ){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
       }
       return stack.isEmpty();
    }
}
