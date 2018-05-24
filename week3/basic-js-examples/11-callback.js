function caller(callback) {
  console.log(`about to invoke the function ${callback}`)
  callback(5,10);
}

caller((one, two) => {
  console.log(`one = ${one} and two = ${two}`);
});

let add = (one, two) => {
  console.log(one + two);
}

caller(add);

setTimeout(() => {console.log('time is done')}, 5000);
console.log('will keep executing');
while(true) {
  
}