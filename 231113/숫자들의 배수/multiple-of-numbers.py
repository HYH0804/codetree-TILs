n= int(input())

count=0
arr = list()
m = 1 
while count!=2:
    arr.append(n*m)
    if n*m%5 ==0:
        count=count+1
        m=m+1
    else:
        m=m+1
        continue

for i in range(len(arr)):
    print(arr[i],end=" ")