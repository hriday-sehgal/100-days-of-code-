// 1342. Number of Steps to Reduce a Number to Zero
// link - https://rb.gy/gs2pw
// Given an integer num, return the number of steps to reduce it to zero.
// In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

class Solution {
  public int numberOfSteps(int num) {
    int count = 0;
    while(num > 0){
      if(num%2 == 1)
      num--;
      else num/=2;
      count++;
    }
    return count;
  }
  }

