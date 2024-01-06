import sys
num = int(input())
arr = list(map(int,input().split()))


max = -sys.maxsize 
for i,ele in enumerate(arr):
    for j in range(i+1,len(arr)):
        tmp = -arr[i]+arr[j]
        if max<tmp and tmp >0:
            max = tmp
        else:
            continue
if 0<max:
    print(max)
else:
    print(0)