class GreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();

        int[] res = new int[nums2.length];
        int[] ans = new int[nums1.length];

        for(int i = nums2.length - 1; i >= 0; i--){
            if(i == nums2.length - 1){
                res[i] = -1;
                st.push(nums2[i]);
            }

            else if(!st.isEmpty() && st.peek() > nums2[i]){
                res[i] = st.peek();
                st.push(nums2[i]);
            }

            else{
                while(!st.isEmpty() && st.peek() <= nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    res[i] = -1;
                }

                else{
                    res[i] = st.peek();
                }

                st.push(nums2[i]);
            }
        }

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    ans[i] = res[j];
                }
            }
        }

        return ans;
    }
}
