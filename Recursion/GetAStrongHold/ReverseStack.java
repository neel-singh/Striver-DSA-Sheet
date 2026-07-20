class ReverseStack{
  public void reverseStack(Stack<Integer> st){
    reverse(st);
  }

  public void reverse(Stack<Integer> st){
    if(st.isEmpty()){
      return;
    }

    int ele = st.pop();
    reverse(st);
    insert(st, ele);
  }

  public void insert(Stack<Integer> st, int ele){
    if(st.isEmpty()){
      st.push(ele);
      return;
    }

    int top = st.pop();
    insert(st, ele);
    st.push(top);
  }
}
