class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX=0,closestY=0;

        if(xCenter<x1) closestX=x1;
        else if(xCenter>x2) closestX=x2;
        else closestX=xCenter;

        if(yCenter<y1) closestY=y1;
        else if(yCenter>y2) closestY=y2;
        else closestY=yCenter;

        int dis2=((xCenter-closestX)*(xCenter-closestX))+((yCenter-closestY)*(yCenter-closestY));

        if(dis2<=(radius*radius)) return true;
        return false;
    }
}