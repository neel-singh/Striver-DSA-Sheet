class InfixToPrefix {
    static String infixToPrefix(String sb) {
          
        Stack<Character> st = new Stack<>();
        
        StringBuilder ans = new StringBuilder();
        
        sb = reverse(sb);
        
        StringBuilder s = new StringBuilder(sb);
        
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'){
                s.setCharAt(i, '(');
            }
            
            else if(s.charAt(i) == '('){
                s.setCharAt(i, ')');
            }
        }

        for(int i = 0; i < s.length(); i++){
            
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
            (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
            (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                
                ans.append(s.charAt(i));
                
            }
            
            
            else if(s.charAt(i) == '('){
                
                st.push(s.charAt(i));
                
            }
            
            
             else if (s.charAt(i) == ')') {

                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }

                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            else {

                while (!st.isEmpty() &&
                       (precedency(st.peek()) > precedency(s.charAt(i)) ||
                       (precedency(st.peek()) == precedency(s.charAt(i)) &&
                        s.charAt(i) == '^'))) {

                    ans.append(st.pop());
                }

                st.push(s.charAt(i));
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        
        String res = reverse(ans.toString());
        
        return res;
    }
    
    static String reverse(String s){
        int i = 0;
        int j = s.length() - 1;
        
        StringBuilder sb = new StringBuilder(s);
        
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            
            i++;
            j--;
        }
        
        return sb.toString();
    }
    
    static int precedency(char ele){
        if(ele == '^'){
            return 3;
        }
        
        else if(ele == '*' || ele == '/'){
            return 2;
        }
        
        else if(ele == '+' || ele == '-'){
            return 1;
        }
        
        else{
            return -1;
        }
    }
}
