//synchronous basically means that you can only execute one thing at a time
console.log('Venkatesh');
console.log('Mogili');
calculate();
console.log('JS Course');
console.log('Spring Boot');
console.log('Restful WebServices');
console.log('Hibernate');

function calculate(){
    let sum=0;
    for(let i=0; i<1000000000;i++){
        sum=sum+i;
    }
    console.log("Math result : ",sum);
}