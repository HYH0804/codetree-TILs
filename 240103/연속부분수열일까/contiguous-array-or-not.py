AC , BC= list(map(int,input().split()))
A = list(map(int,input().split()))
B=list(map(int,input().split()))
st = list()
cnt=0
for a in A:
    if a == B[0]:
        st.append(cnt)
    cnt+=1

flag=False
for i in st:
    if flag== True:
        break
    else:
        j = i
        cnt_b=0
        while cnt_b<len(B) and j<len(A) and A[j]==B[cnt_b] :
            j+=1
            cnt_b+=1
            continue
        if(cnt_b==len(B)):
            flag = True

if flag == True:
    print("Yes")
else:
    print("No")