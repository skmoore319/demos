// there are 3 ways of creating strings in js
let a = 'hello';
console.log(a);
let b = "world";
console.log(b);

let myString = `
This is a template literal, it can handle multi line strings
It also allows for string interpolation
${a} ${b}
or just any javascript in the interplation
5 + 6 = ${5 + 6}
`;
console.log(myString);