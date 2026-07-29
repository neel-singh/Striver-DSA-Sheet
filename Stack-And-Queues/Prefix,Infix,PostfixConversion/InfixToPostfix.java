class InfixToPostfix {
	public static String infixToPostfix(String s) {

		Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (st.isEmpty() && (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '^')) {
                st.push(ch);
            }

            else if (ch == '(') {
                st.push(ch);
            }

            else if (ch == ')') {

                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }

                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            else if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '^') {

                while (!st.isEmpty() && st.peek() != '(' && (precedency(st.peek()) > precedency(ch) || (precedency(st.peek()) == precedency(ch) && ch != '^'))) {
                    sb.append(st.pop());
                }

                st.push(ch);
            }

            else {
                sb.append(ch);
            }
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

    static int precedency(char ch) {

        if (ch == '^') {
            return 3;
        }

        else if (ch == '*' || ch == '/') {
            return 2;
        }

        else if (ch == '+' || ch == '-') {
            return 1;
        }

        return -1;
    }
}
