n = int(input())

arr_2d = [[0 for _ in range(n)]
for _ in range(n)]
num=1
a=n-1
while num<=n**2:
    if num%n==1 and num!=1:
        if (num//n)%2==0:
            for i in range(n-1,-1,-1):
                arr_2d[i][a]=num
                num+=1
            a-=1
        else :
            for i in range(0,n):
                arr_2d[i][a]=num
                num+=1 
            a-=1
    else:
        for i in range(n-1,-1,-1):
            arr_2d[i][a]=num
            num+=1
        a-=1

for i in range(n):
    for j in range(n):
        print(arr_2d[i][j],end=" ")      
    print()