function Person(nameIn) {
  name = nameIn;
  this.getName = () => name;
  this.setName = (newName) => {
    name = newName;
  }
}

let tyler = new Person('Tyler');

console.log(tyler.name);
console.log(tyler.getName());
tyler.setName('Pierro');
console.log(tyler.name);
console.log(tyler.getName());