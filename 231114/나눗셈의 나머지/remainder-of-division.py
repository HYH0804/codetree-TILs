arr= list(map(int,input().split()))

dividend =arr[0]
divisor= arr[1]
remain= [0]*9

while dividend>1:
    remain[dividend%divisor-1]+=1
    dividend = dividend//divisor
    
sum = 0
for i in remain:
    sum = i**2 + sum

print(sum)