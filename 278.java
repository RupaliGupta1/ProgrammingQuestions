278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        int badNum=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(isBadVersion(mid)){
              badNum=mid;
              right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return badNum;
    }
}
