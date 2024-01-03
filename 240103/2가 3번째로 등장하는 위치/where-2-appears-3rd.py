cnt = 0
m = int(input())
arr =list(map(int,input().split()))

i=0
for i,ele in enumerate(arr):
    if cnt==3 :
        break
    else:
        if ele == 2:
            cnt+=1
            continue
        
print(i)