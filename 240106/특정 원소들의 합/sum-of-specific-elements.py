arr_2 = list()
sm = 0 
for j in range(4):
    arr_1 = list(map(int,input().split()))
    arr_2.append(arr_1)

for k in range(0,4):
    for i in range(0,k+1):
        sm += arr_2[k][i]

print(sm)