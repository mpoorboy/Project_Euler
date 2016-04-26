function sumPrimes(num) {
	var sum = 0;
  
	for(var i = 1 ; i <= num; i++) {
		if(isPrime(i)) sum += i;
	}

	return sum;
}

function isPrime(n) {  
	if(n < 2 || n != Math.round(n)) return false;

	for(var i = 2; i <= Math.sqrt(n); i++) {
		if(n % i === 0) return false;
	}
  
	return true;
}

sumPrimes(2000000);
//not working for big numbers yet
