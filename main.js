const fruits = ["Banana", "Orange", "Apple", "Mango"];
const cost = [70, 15, 15, 40];

let total = cost.reduce((sum, price) => sum + price, 0);
console.log("Total cost:", total);
