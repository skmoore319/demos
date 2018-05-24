// we can compare variables through == or ===
// with === we are checking memory reference, which would be both type and value in most cases
// == will attempt type coercion to compare values
function compare(one, two) {
  console.log(`
  param one = ${one} with type = ${typeof(one)}
  param two = ${two} with type = ${typeof(two)}
  == evaluates to ${one == two}
  === evaluates to ${one === two}`);
}

compare(1, '1');
compare(true, 'true');
compare('hello', "hello");
compare(null, undefined);
compare(NaN, NaN);
compare(null, NaN);
compare(Infinity, Infinity);