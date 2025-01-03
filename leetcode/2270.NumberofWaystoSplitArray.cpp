class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        long prefix = 0,total=0;
        int res= 0 ;
        for (int i : nums){
            total += i;
        }
        for(int i =0 ; i < nums.size()-1;i++){
            prefix += nums[i];
            if(prefix >= total - prefix ){
                res++; 
            }
     
      }
      return res;  
    }
};
