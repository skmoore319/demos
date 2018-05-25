let a: string = 'hello';
let b = {}; // b will infer type based off assignment

console.log(a);

function myFun(input: number, input2: string): boolean {
  if(input > 10) {
    return false;
  }
  return true;
}

console.log(myFun(5, 'hello'));