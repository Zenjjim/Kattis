def calc(a):
    for z in range(4):
        for y in range(4):
            for x in range(4):
                    sum = 4
                    if(z == 3 or y == 3):
                        sum *= -1
                    if(x == 0):
                        sum *= 4
                    if(x == 1):
                        sum /= 4
                    if(y == 0):
                        sum *= 4
                    if(y == 1):
                        sum /= 4
                    if(z == 0):
                        sum *= 4
                    if(z == 1):
                        sum /= 4
                    if(x == 2):
                        sum += 4
                    if(y == 2):
                        sum += 4
                    if(z == 2):
                        sum += 4
                    if(z == 3 or y == 3 or x == 3):
                        sum *= -1
                    if(x == 3):
                        sum -= 4
                    if(y == 3):
                        sum -= 4
                    if(z == 3):
                        sum -= 4
                    if(sum == a):
                        return [x, y, z]

binOp = ['*', '/', '+', '-']
m = int(input())
for i in range(m):
  n = int(input())
  b = calc(n)
  if(b != None):
      print('4 ' + binOp[b[0]] + ' 4 ' + binOp[b[1]] + ' 4 ' + binOp[b[2]] + ' 4 = ' + str(n))
  else:
      print('no solution')
