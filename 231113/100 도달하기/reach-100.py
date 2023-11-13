n= int(input())

arr = list()

cnt=0

arr.append(1)
arr.append(n)
cnt=cnt+2
while arr[cnt-1]<=100:
    a = arr[cnt-2]+arr[cnt-1]
    arr.append(a)
    cnt=cnt+1

for i in range(cnt):
    print(arr[i],end=" ")