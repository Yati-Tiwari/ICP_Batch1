// Brute force


// class Solution {
//     public int findTheWinner(int n, int k) {
//         List<Integer> ll=new ArrayList<>();
//         for(int i=1;i<=n;i++){
//             ll.add(i);
//         }
//         int idx=0;
//         while(ll.size()>1){
//             int r=(idx+k-1)%ll.size();
//             ll.remove(r);
//             idx=r;
//         }
//         return ll.get(0);
//     }
// }