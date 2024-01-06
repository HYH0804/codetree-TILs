import sys
num = int(input())
arr = list(map(int,input().split()))

max = -sys.maxsize
max_index = 0
for i,ele in enumerate(arr) :
    if max < ele :
        max = ele
        max_index = i
    else :
        continue

semax = -sys.maxsize
for i,ele in enumerate(arr):
    if i == max_index:
        continue
    else:
        if semax < ele: 
            semax = ele
print(max, semax)