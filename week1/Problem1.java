package week1;

public class Problem1 {
    int minPrice=Integer.MAX_VALUE; // yaha pe hum sabse kam price track kar rahe hai (best din buy)
int maxProfit=0; // yaha max profit store karenge

for(int price:prices){ // saare prices ek ek krke dekh lenge
    if(price<minPrice){
        minPrice=price; // agar koi aur sasta mila to buy ka din update
    }else{
        // agar sasta mil chuka aur ab price bada mila to profit calculate
        maxProfit=Math.max(maxProfit,price-minPrice);
    }
}

return maxProfit; // final mai best profit return
}
}
