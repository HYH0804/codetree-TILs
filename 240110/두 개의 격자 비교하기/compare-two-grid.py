n,m = list(map(int,input().split()))

arr = [ list(map(int,input().split()))
for _ in range(n) 
]

arr_2= [ list(map(int,input().split()))
for _ in range(n) 
]

arr_3 = [ [0 for _ in range(m)]
for _ in range(n)]

for row in range(n):
    for col in range(m):
        if arr[row][col] == arr_2[row][col]:
            arr_3[row][col] = 0
        else:
            arr_3[row][col]=1

for row in range(n):
    for col in range(m):
        print(arr_3[row][col],end=" ")

    print()