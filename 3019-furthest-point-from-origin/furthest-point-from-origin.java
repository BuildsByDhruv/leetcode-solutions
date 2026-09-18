class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count=0;
        int empty=0;

        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L') count++;
            else if(moves.charAt(i)=='R') count--;
            else empty++;
        }
        count=Math.abs(count)+empty;
        return count;
    }
}