let usingJsonNotation = {
  name: 'bill',
  age: 15
}

console.log(usingJsonNotation);
console.log(usingJsonNotation.name);
usingJsonNotation.name = 'bob';
usingJsonNotation.weight = 150;
console.log(usingJsonNotation);


function Person(name, age) {
  this.name = name;
  this.age = age;
  this.sayHello = (recipient) => {
    console.log(`hello ${recipient}, my name is ${this.name}`);
  };
}

Person.prototype.species = 'human';

let david = new Person('David', 27);
david.newFiel = 'test';
let e = new Person('E', 23);

console.log(david);
console.log(e.sayHello('Scott'));
console.log(e);

console.log(david.species);
console.log(e.species);