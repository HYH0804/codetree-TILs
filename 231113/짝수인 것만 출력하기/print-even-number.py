n=int(input())
arr =list(map(int,input().split()))
ar= list()
for i in range(n):
    if arr[i] %2 == 0:
        ar.append(arr[i])

for j in range(len(ar)):
    print(ar[j],end=" ")


#파이썬 배열 뒤 추가 append