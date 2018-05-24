// we can create functions using the function keyword or with arrow notation

// using function keyword
function myFun(param1, param2) {
  console.log('called myFun with parameters');
  console.log('param1 = ' + param1);
  console.log('param2 =' + param2);
}

let arrowFun = (param1, param2) => {
  console.log('called arrowFun with parameters');
  console.log('param1 = ' + param1);
  console.log('param2 =' + param2);
}

myFun(1,2);
myFun();
myFun(3, 'hello', 'world');

arrowFun('a', 'b');