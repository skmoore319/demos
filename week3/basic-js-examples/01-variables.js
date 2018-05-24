var a = 5; // var is the traditional way of declaring variables, don't use it
let b = 9;
const c = 'constant';

console.log('a = ' + a);
console.log('b = ' + b);

// variables have no type but their contents do have a type
a = 'hello';
b = 'world';

console.log('new values of a and b are:');
console.log('a = ' + a);
console.log('b = ' + b);