/*
node InterviewSolution.js   node.js is required
JavaScript is dynamic Type language means you can create any Type of variable with var , let , const 
java is static Type each variable need datatype

= assign operator
== Loose check operator type conversion operator
=== Strict check operator , Type + values

var global scope can be redeclare revalue
let block scope can not redeclare but revalue
const block scope can not redeclare and revalue

*/

//find number of character from string
let name = "help";
let count = 0;
for (let i = 0; i < name.length; i++) {
  count++;
}
console.log(count);
console.log("--------------");

//find number of integer from array
let arr = [5, 4, 1, 3, 5, 7];
let counter = 0;
for (let i = 0; i < arr.length; i++) {
  counter++;
}
console.log(counter);
console.log("--------------");

//find largest , 2nd largest , smallest , 2nd smallest integer from array
let find = [5, 4, 6, 6, 7, 6, 7, 8, 1];
let largest = -Infinity;
let secondLarge = -Infinity;
let smallest = Infinity;
let secondSmall = Infinity;
for (let i = 0; i < find.length; i++) {
  if (largest < find[i]) {
    secondLarge = largest;
    largest = find[i];
  } else if (secondLarge < find[i] && find[i] != largest) {
    secondLarge = find[i];
  }
  if (smallest > find[i]) {
    secondSmall = smallest;
    smallest = find[i];
  } else if (secondSmall < find[i] && find[i] != smallest) {
    secondSmall = find[i];
  }
}
console.log("largest: " + largest);
console.log("secondLarge: " + secondLarge);
console.log("smallest: " + smallest);
console.log("secondSmall: " + secondSmall);
console.log("--------------------");

//find target character from string and print index
let naming = "completed";
let target = "e";
for (let i = 0; i < naming.length; i++) {
  if (target === naming[i]) {
    console.log(i);
  }
}
console.log("--------------------");

//find number of times target character occurs in string
let times = "prettier";
let targeted = "t";
let counti = 0;
for (let i = 0; i < times.length; i++) {
  if (targeted === times[i]) {
    counti++;
  }
}
console.log(counti);
