function fib(n) {
	var a = 0;
  var b = 1;
    
	for (var i = 0; i < n; i++) {
		var c = a;
		a = b;
		b = c + b;
  }
	return a;
}

function sumFibs(num) {
	var sum = 0;
	
	for (var i = 0; fib(i) <= num; i++) {
		if ((fib(i)) % 2 === 0)
		sum += (fib(i));
  }
  return sum;
}

sumFibs(4000000);
