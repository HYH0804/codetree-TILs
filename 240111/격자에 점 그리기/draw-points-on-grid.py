cnt=1
n , m = list(map(int,input().split()))
arr= [[0 for _ in range(n)]
for _ in range(n)]

for _ in range(m):
    a , b = list(map(int,input().split()))
    arr[a-1][b-1]=cnt
    cnt+=1
for i in range(n):
    for j in range(n):
        print(arr[i][j],end=" ")
    print()