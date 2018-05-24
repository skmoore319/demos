function testTruthyFalsy(input) {
  console.log(`input is ${input}
  evaluates to ${(input) ? 'true' : 'false'}`);
}

testTruthyFalsy(1)
testTruthyFalsy(-1)
testTruthyFalsy(0)
testTruthyFalsy('h')
testTruthyFalsy('');
testTruthyFalsy(true);
testTruthyFalsy(undefined);
testTruthyFalsy(null)
testTruthyFalsy(NaN);
testTruthyFalsy([]);
testTruthyFalsy(testTruthyFalsy);
