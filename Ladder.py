import math

input = input()
x = input.split()
wallLength = int(x[0])
angle = int(x[1])
radian = math.pi * angle / 180;
if wallLength <= 10000 and wallLength >= 1 and angle <= 89 and angle >= 1:
    print(math.ceil(wallLength / math.sin(radian)))
