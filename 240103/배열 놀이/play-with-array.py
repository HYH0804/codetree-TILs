ele , qe = list(map(int,input().split()))
ele_list = list(map(int,input().split()))
for _ in  range(qe) :
    q_list = list(map(int,input().split()))
    if q_list[0] == 1:
        print(ele_list[q_list[1]-1])
    elif q_list[0]==2:
        if q_list[1] in ele_list:
            a =ele_list.index(q_list[1])
            print(a+1)
        else:
            print(0)
    else : 
        cnt = q_list[1]
        cnt_end = q_list[2]
        while cnt<=cnt_end:
            print(ele_list[cnt-1],end=" ")
            cnt+=1
        print()