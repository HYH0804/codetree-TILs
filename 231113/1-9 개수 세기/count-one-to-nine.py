n= int(input())

arr=list(map(int,input().split()))
cnt=0
for i in range(1,10):
    for j in range(n):
        if arr[j]==i:
            cnt+=1
    print(cnt)
    cnt=0