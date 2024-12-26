var ss = new Set();
ss.add(10);
ss.add(20);
ss.add(30);
ss.add(40);
ss.add(50);
document.write(ss);
document.write("<br>Size is "+ss.size);
document.write("<br>Search  "+ss.has(10));
document.write("<br>Search "+ss.has(17));
ss.delete(20)//delete element using value
document.write("<br>Size is "+ss.size);
ss.forEach(n=>document.write("<br>Value is "+n));