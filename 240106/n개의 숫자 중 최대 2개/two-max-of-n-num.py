import sys
num = int(input())
arr = list(map(int,input().split()))

max = -sys.maxsize

for i in arr :
    if max < i :
        max = i
    else :
        continue

semax = -sys.maxsize
for i in arr:
    if i == max:
        continue
    else:
        if semax < i: 
            semax = i
print(max, semax)