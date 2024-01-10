#n = int(input())

#rr_2d = [[0 for _ in range(n)]
#for _ in range(n)]
#num=1
#while num<n**2:
#    if num%n==1 and num!=1:
#        if num/n%2==0:
#            a=n-1
#            for i in range(a,-1,-1):
#                arr_2d[i][a]=num
#                num+=1
#        else :
#            a=0
#            for i in range(a,n):
#                arr_2d[i][a]=num
#                num+=1
#    else:
#        a=n-1
#        for i in range(a,-1,-1):
#            arr_2d[a][i]=num
#            num+=1

#for i in range(n):
#    for j in range(n):
#        print(arr_2d[i][j],end=" ")      
#    print()

n = int(input())
#a = [[i * n + j for j in range(1, n+1)] for i in range(n)]
if n %2==0:
    for i in range(n):
        for j in range(n):
            if j%2==0:
                print((n-j-1) * n + i+1, end=' ')
            else:
                print((n-j-1) * n + n-i, end=' ')
        print()
else:
    for i in range(n):
        for j in range(n):
            if j%2==0:
                print((n-j-1) * n + n-i, end=' ')
            else:
                print((n-j-1) * n + i+1, end=' ')
        print()