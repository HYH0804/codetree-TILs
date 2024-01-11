def print_square(n):
    cnt=1
    arr = [[0 for _ in range(n)]
    for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if cnt==10:
                cnt=1
                arr[i][j]=cnt
                cnt+=1
            else:
                arr[i][j]=cnt
                cnt+=1
    for i in range(n):
        for j in range(n):
            print(arr[i][j],end=" ")
        print()


n= int(input())

print_square(n)