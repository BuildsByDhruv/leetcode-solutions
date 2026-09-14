class Solution {
    public boolean isRectangleOverlap(int[] A, int[] B) {
        if(A[2]<=B[0]) return false;
        if(B[2]<=A[0]) return false;
        if(A[3]<=B[1]) return false;
        if(B[3]<=A[1]) return false;
        return true;
    }
}