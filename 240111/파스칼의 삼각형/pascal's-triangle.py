n = int(input())

arr = [[1 for _ in range(n) ]
for _ in range(n)]

nu =2
for i in range(nu,n):
    for j in range(1,n):
        if i != j:
            arr[i][j] = arr[i-1][j-1]+ arr[i-1][j]
        else:
            break


for i in range(n):
    for j in range(n):
        if j<=i:
            print(arr[i][j],end=" ")
        else:
            print()
            break