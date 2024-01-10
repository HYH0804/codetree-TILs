n = int(input())

arr_2 = [[ 0 for _ in range(n)]
for _ in range(n)]

num=1
for i in range(n):
    for j in range(n):
        arr_2[j][i]=num
        num+=1

for i in range(n):
    for j in range(n):
        print(arr_2[i][j],end=" ")
    print()