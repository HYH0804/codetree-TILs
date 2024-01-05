import sys
count = int(input())
arr = list(map(int,input().split()))

min = sys.maxsize
for i in arr:
    if min > i:
        min =i

print(min,arr.count(min))