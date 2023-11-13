arr=list(map(int,input().split()))


for i in range(len(arr)-1):
    if arr[i]%2 ==0:
        print(int(arr[i]/2),end=" ")
    else:
        print(arr[i]+3,end=" ")