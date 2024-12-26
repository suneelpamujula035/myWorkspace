let mm = new Map();
mm.set(1,"Suneel");
mm.set(2,"Bhargav");
mm.set(3,"Giri");
mm.set(4,"Naresh");
mm.set(5,"Nikhil");
mm.set(6,"Sushanth");
document.write(mm);
document.write("<br>Size is "+mm.size);
mm.set(1,"Prashanth");//when we add duplicate key it will replaces that value with new value
mm.set(8,"Nikhil");//we can add duplicate values
mm.forEach((x,y)=>document.write("<br>"+x+" - "+y));
document.write("<br>Size is "+mm.size);
document.write("<br>Using key we can get value - "+mm.get(2));