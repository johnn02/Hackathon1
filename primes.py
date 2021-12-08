my_primes=[]

def is_prime(number):
  i=2
  while i<=number**0.5:
    if number%i==0:
      print ("I am not prime")
      break
    i+=1
  else:
    print ("I am prime")
    my_primes.append(number)

for i in range(2,1000):
  is_prime(i)
print (my_primes)
