input = input().split(' ')
x = int(input[0]) * 4
y = int(input[1]) * 3

if((x+y)%2==0):
  print('possible')
else:
  print('impossible')