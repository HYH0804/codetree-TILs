arr = list(map(int,input().split()))
under = 0
over = 1001
for i in arr:
    if i > 500 and over >i:
        over = i
    elif i<500 and under<i:
        under = i
print(under, over)