document.write("<br>1st statement");
//document.write("<br>2nd statement");
setTimeout(()=>{
    //document.write("<br>2nd statement");
    document.getElementById("divBlock").innerHTML="<br>2nd statement";
},2000);
var i=0;
var obj=setInterval(()=>{
    var date = new Date();
    document.getElementById("divBlock").innerHTML="<br>4th statement "+i;
    document.getElementById("clock").innerHTML=date.getHours()+" : "+date.getMinutes()+" : "+date.getSeconds();
    if(i%2==0){
        document.getElementById("msg").style.color="red";
        document.getElementById("msg").style.backgroundColor="green";
    }else{
        document.getElementById("msg").style.color="white";
        document.getElementById("msg").style.backgroundColor="red";
    }
    i++;
},1000)
document.write("<br>3rd statement");

function stop(){
    clearInterval(obj);
}