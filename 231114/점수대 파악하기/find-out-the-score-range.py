ar = list(map(int,input().split()))

arr = [0]*10

for i in ar:
    if i==0:
        break
    elif i//10==0:
        continue
    else:
        arr[i//10-1]+=1

for j in range(9,-1,-1):
    print(f"{(j+1)*10} - {arr[j]}")