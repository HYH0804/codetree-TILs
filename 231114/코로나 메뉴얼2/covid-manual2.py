arr =list()
for i in range(3):
    arr.append(list(input().split()))
    arr[i][1]= int(arr[i][1])


cnt=[0]*5
for i in range(3):
    if arr[i][0]=='Y' and arr[i][1] >=37:
        cnt[0]+=1
        cnt[4]+=1
    elif arr[i][0]=='N' and arr[i][1] >=37:
        cnt[1]+=1
    elif arr[i][0]=='Y' and arr[i][1] <37:
        cnt[2]+=1
    else:
        cnt[3]+=1

for i in range(5):
    if i==4 and cnt[i]>=2:
        print("E")
    else:
        print(cnt[i],end=" ")