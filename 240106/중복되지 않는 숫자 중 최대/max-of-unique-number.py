num = int(input())
arr = list(map(int, input().split()))

max_num = -1 

for curr_num in arr:
    if max_num < curr_num:
        cnt = 0 
        for i in arr:
            if i == curr_num:
                cnt +=1
        if cnt==1:
            max_num = curr_num
print(max_num)