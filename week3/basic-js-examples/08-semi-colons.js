console.log('hello')

function myFun() {
  // js will inject a semi colon after the return before the 5;
  return 
    5;
}
console.log(myFun())