var obj;
function loadObject(){
    obj=new XMLHttpRequest();//create the object reference
    //obj.open("GET","demo.txt");
    obj.open("GET","https://jsonplaceholder.typicode.com/todos");
    obj.onreadystatechange=callback;//it call again and againto check the request status
    obj.send();
}
/*
readyState=0:not initialize
readyState=1:request sent to server
readyState=2:processing
readyState=3:ready to give response
readyState=4:got the response
*/
function callback(){
    //alert(obj.readyStatus+" "+obj.status);
    if(obj.readyState==4 && obj.status==200){
        alert(obj.responseText);
    }
}