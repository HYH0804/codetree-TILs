n= int(input())

arr=list(map(int,input().split()))

ar = [0]*9

for i in range(len(arr)):
    ar[arr[i]-1]+=1

for j in range(9):
    print(ar[j])