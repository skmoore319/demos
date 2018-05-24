function testType(input) {
  console.log(`input = ${input}
  type of input is: ${typeof(input)}`);
}

testType(5);
testType('h');
testType("hello");
testType(true);
testType(undefined);
testType(null);
testType(NaN); // can get from something like 5/'a'
testType([]);
testType({});
testType(testType);