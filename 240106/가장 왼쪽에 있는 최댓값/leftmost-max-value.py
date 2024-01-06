import sys
num = int(input())
arr = list(map(int,input().split()))

max = -sys.maxsize

i = num-1
while i >= 0: 
    for j in range(i,-1,-1):
        if max<=arr[j]:
            max = arr[j]
            i = j-1
        else:
            continue
    print(i+2,end =" ")
    max =-sys.maxsize