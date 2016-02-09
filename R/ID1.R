#ID: 1
#If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. 
#Find the sum of all the multiples of 3 or 5 below 100.

sum.of.multiples.3.5.below <- function(max){
p <- seq(1, (max-1))
multiples.of.3 <- num[p %% 3 == 0]
multiples.of.5 <- num[p %% 5 == 0]
num.request <- union(multiples.of.3, multiples.of.5)
answer <- sum(num.request)
return(answer)
}
sum.of.multiples.3.5.below(1000)

#Answer: 233168
