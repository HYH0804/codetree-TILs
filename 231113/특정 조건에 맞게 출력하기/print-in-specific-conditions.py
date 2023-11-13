arr=list(map(int,input().split()))


for i in range(len(arr)):
    if arr[i] == 0:
        break
    elif arr[i]%2 !=0:
        print(arr[i]+3,end=" ")
    else:
        print(int(arr[i]/2),end=" ")