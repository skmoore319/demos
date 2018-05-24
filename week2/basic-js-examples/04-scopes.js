// var gets hoised and has global and function scope
// let and const do not get hoisted and have global, function, and block scoping

function varFun() {
  console.log(a);
  a = 10;
  if(false) {
    var a = 5;
  }
  console.log(a);
}

function letFun() {
  console.log(a);
  a = 10;
  if(false) {
    let a = 5;
  }
  console.log(a);
}

varFun();
letFun();