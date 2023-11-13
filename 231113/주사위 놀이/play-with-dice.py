arr = list(map(int,input().split()))

ar = [0]*6

for i in arr:
    ar[i-1]+=1

for j in range(6):
    print(f"{j+1} - {ar[j]}")