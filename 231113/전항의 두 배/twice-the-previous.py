arr=list(map(int,input().split()))

cnt=2

while cnt <10:
    arr.append(arr[cnt-1]+2*arr[cnt-2])
    cnt+=1

for i in range(len(arr)):
    print(arr[i],end=" ")