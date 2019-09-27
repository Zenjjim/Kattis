import math
nr = int(input())
for i in range(nr):
  scram = input()
  x = int(math.sqrt(len(scram)))
  word = ''
  for n in range(x, 0, -1):
    for m in range(0, x):
      word += scram[(n+m*x)-1]
  print(word)
