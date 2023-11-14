arr = [0]*9
ar = list(map(int,input().split()))
for i in ar:
    if i == 0:
        break
    elif i//10==0 :
        continue
    else:
        arr[i//10-1]+=1

for j in range(9):
    print(f"{j+1} - {arr[j]}")