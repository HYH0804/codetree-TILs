import sys
arr = list(map(int,input().split()))
max = -sys.maxsize
for i in arr:
    if max < i :
        max = i

print(max)