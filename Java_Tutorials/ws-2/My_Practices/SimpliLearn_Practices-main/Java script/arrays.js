var arr1=[10,20,30,40,50];
var arr2=new Array(10,20,30,40,50);

document.write(arr1+"<br>");//By default it trats as a string
document.write(arr2+"<br>");
document.write(arr1.join("-")+"<br>");//If you want to separate numbers in array
document.write("size of the array - "+arr1.length+"<br>");
document.write("size of the array - "+arr2.length+"<br>");
arr1.push(100);//add element at last
arr1.push(200);
arr1.unshift(300);//add element at beginning
arr1.unshift(400);
document.write("<br>all elements after added - "+arr1);
document.write("<br>size of the array - "+arr1.length+"<br>");
arr1.pop();//remove from last
arr1.shift();//remove from beginning
document.write("<br>all elements after removed - "+arr1);
//we can add, remove, replace elements from array
//1st parameter is index position
//2nd parameter id deleteCount
// arr1.splice(2,1);//2nd index position deleted
// document.write("<br>elements are - "+arr1)
// arr1.splice(2,3);//from 2nd index position 3 elements delete
// document.write("<br>elements are - "+arr1)
// arr1.splice(2,1,1000);//2nd position element delete and add 1000
// arr1.splice(2,1,1000);
// document.write("<br>elements are - "+arr1);
var result1=arr1.findIndex(v=>v==20);//if element present return index else -1
document.write("<br>index position "+result1);
arr1.splice(result1,1,25);
document.write("<br>elements are - "+arr1);
arr1.forEach(v=>document.write("<br>Value is "+v));
