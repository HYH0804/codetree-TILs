import sys
arr = list(map(int,input().split()))
max = -sys.maxsize
min = sys.maxsize

for i in arr :
    if i!= 999:
        if max < i:
            max= i
        if min > i:
            min = i
print(max,min)