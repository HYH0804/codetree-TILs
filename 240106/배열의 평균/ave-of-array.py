avg=0
total=0
arr_2 = list()
for i in range(2):
    arr_1=list(map(int,input().split()))
    total = sum(arr_1)
    avg = sum(arr_1)/4.0
    print(avg, end=" ")
    arr_2.append(arr_1)
print()

sm = 0 
for i in range(4):
    for j in range(2):
        sm += arr_2[j][i]
    print(sm/2.0,end =" ")
    sm=0
print()

print(total_avg/8.0)