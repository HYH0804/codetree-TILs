n, m = map(int,input().split())
cnt=0
arr =map(int,input().split())
for a in arr:
    if a==m:
        cnt+=1
    else:
        continue
print(cnt)