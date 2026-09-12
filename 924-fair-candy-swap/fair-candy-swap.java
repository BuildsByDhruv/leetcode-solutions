class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int SumAlice=0,SumBob=0;

        for(int i=0;i<aliceSizes.length;i++)
        {
            SumAlice+=aliceSizes[i];
        }

        for(int i=0;i<bobSizes.length;i++)
        {
            SumBob+=bobSizes[i];
        }

        Arrays.sort(bobSizes);

        int diff=(SumBob-SumAlice)/2;

        for(int i=0;i<aliceSizes.length;i++)
        {
            int target=aliceSizes[i]+diff;
            int lo=0,hi=bobSizes.length-1;

            while(lo<=hi)
            {
                int mid=lo+(hi-lo)/2;

                if(bobSizes[mid]==target) return new int[]{aliceSizes[i],target};
                if(bobSizes[mid]<target) lo=mid+1;
                else hi=mid-1;
            }
        }
        return new int[]{};
    }
}