package OOP;

import java.util.ArrayList;

public class Coordinates {
    protected int x, y;

    public Coordinates (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals (Coordinates target) {
        if (target.x == x && target.y == y) return true;
        return false;
    }

    public boolean [] CheckFriendsOnTheWay (ArrayList<BaseHero> friends) {
        boolean [] res = new boolean [4];
        for (BaseHero bh : friends) {
            if (this.x == bh.xy.x+1 & this.y == bh.xy.y) res [0] = true;
            else if (this.x == bh.xy.x-1 & this.y == bh.xy.y) res [1] = true;
            else if (this.x == bh.xy.x & this.y == bh.xy.y+1) res [2] = true; 
            else if (this.x == bh.xy.x & this.y == bh.xy.y-1) res [3] = true; 
        }
        return res;
    }

    
}

// boolean [] temp = CheckFriendsOnTheWay (friends);
// if (dx > dy) {
//     if (this.x > target.x & temp [1] == false) this.x -=1;
//     else if (this.x > target.x & temp [1] == true & this.y > target.y) this.y -=1;
//     else if  
//     else this.x +=1;
