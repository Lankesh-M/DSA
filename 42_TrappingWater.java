class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] forward = new int[n];
        int[] backward = new int[n];

        forward[0] = height[0];
        for(int i = 1; i<n; i++){
            if(forward[i-1] > height[i])
                forward[i] = forward[i-1];
            else
                forward[i] = height[i];

        }

        backward[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            if(backward[i+1] > height[i])
                backward[i] = backward[i+1];
            else
                backward[i] = height[i];
        }
   
        int trapped = 0;
        boolean notSame = true;
        for(int i = 0; i<n; i++){
            if(forward[i] != backward[i] && notSame){
                trapped += forward[i] - height[i];
            }
            else{
                notSame = false;
                trapped += backward[i] - height[i];
            }

        }
        return trapped;
    }
}
