#ID: 3
#The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143?

is.prime <- function(x) { 
  if (x == 1) {
    flag <- FALSE
  } 
  if (x == 2 | x == 3) {
    flag <-  TRUE
  } 
  else {
    flag <- !any(x %% 2:(floor(sqrt(x))) == 0)
  }
  return(flag)
}

max.prime.factor.of <- function(num) {
n <- floor(sqrt(num))
flag <- logical(n)
for (i in 1:n) {
  flag[i] <- is.prime(i)
}
prime <- (1:n)[flag]
prime.fac <- prime[(num %% prime) == 0]
answer <- max(prime.fac)
return(answer)
}
max.prime.factor.of(600851475143)
#Answer:  6857
