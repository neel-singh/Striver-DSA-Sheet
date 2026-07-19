class SortStack{
  public void sortStack(Stack<Integer> st){
    sort(st);
  }

  public void sort(Stack<Integer> st){
    if(st.isEmpty()){
      return;
    }

    int ele = st.pop();
    sort(st);
    insert(st, ele);
  }

  public void insert(Stack<Integer> st, int ele){
    if(st.isEmpty() || st.peek() <= ele){
      s.push(ele);
      return;
    }

    int top = st.pop();
    insert(st, ele);
    st.push(top);
  }
}
