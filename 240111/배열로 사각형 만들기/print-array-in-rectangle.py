n=5
arr= [[1 for _ in range(n)]
for _ in range(5)]

for i in range(1,n):
    for j in range(1,n):
        arr[i][j] = arr[i-1][j] + arr[i][j-1]

for i in range(n):
    for j in range(n):
        print(arr[i][j],end=" ")
    print()