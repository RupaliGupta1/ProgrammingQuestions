989. Add to Array-Form of Integer

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum*10+num[i];
        }
        sum=sum+k;
         ArrayList<Integer> list = new ArrayList<>();
        while(sum>0){
            int d=sum%10;
            list.add(0,d);
            sum/=10;
        }

        return list;
    }
}
