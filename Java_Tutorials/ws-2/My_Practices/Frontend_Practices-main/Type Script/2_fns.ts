export{}
// function calc(sal, incentives)
// {
//     return sal * incentives;
// }
// console.log(calc('hello', 13));//Not a number issues with JavaScript

// function calc(salary:number,incentives:number)
// {
//     console.log(salary * incentives);
//     console.log(`${salary} ${incentives}`);// For taking dynamic values
//     return salary * incentives;
// }
// console.log(calc(65,22));

// function recruitment(candidatename:string, experience:number=9)
// {
//     if(experience>3)
//     {
//         console.log("Senior Software Engineer");
//     }
//     else
//     {
//         console.log("Junior Software Engineer");
//     }
// }
// //recruitment("fahim",2);
// recruitment("fahim");

//default parameters
// function recruitment(candidatename:string, experience:any='sharepoint 3 years experience')
// {
//     console.log(`${experience}`);
// }
// recruitment('ashok');
// recruitment('narasimha','java 5 yesrs experience');


//optional parameters "?"
// function  registration(fullname:string, maritalstatus:boolean)
// {
//     console.log(`Candidate name is ${fullname} and his status is ${maritalstatus}`);
// }
// registration('suneel',true);

// function  registration(candidate: {fullname:string, maritalstatus:boolean, age:number})
// {
//     console.log(`${candidate.fullname} ${candidate.maritalstatus} ${candidate.age}`);
// }
// let cinfo={
//     fullname : 'suneel',
//     maritalstatus : true,
//     age : 27
// }
// registration(cinfo);

//----------------------------------------------------------------------

// interface cdetails
// {
//     fullname : string,
//     maritalstatus : boolean,
//     age : number;
// }
// function  registration(info cdetails)
// {
//     console.log(`${info.fullname} ${info.maritalstatus} ${info.age}`);
// }
// let cinfo={
//     fullname : 'suneel',
//     maritalstatus : true,
//     age : 27
// }
// registration(cinfo);

}