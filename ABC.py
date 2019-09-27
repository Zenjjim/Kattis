tall = input()
abc = input()
tall = tall.replace(" ", "")
list = []
list.extend([tall[0],tall[1],tall[2]])
list.sort()
output = ""
for x in abc:
    if x == "A":
        output += list[0] + " "
    if x == "B":
        output += list[1] + " "
    if x == "C":
        output += list[2] + " "

print(output.strip())
