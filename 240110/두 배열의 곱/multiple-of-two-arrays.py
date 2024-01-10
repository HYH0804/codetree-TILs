arr=[
	list(map(int,input().split()))
	for _ in range(3)
]

input()

arr_2 = [
	list(map(int, input().split()))
	for _ in range(3)
]


arr_3= []
for i in range(3):
	for j in range(3):
		arr_3[i][j] = arr[i][j] * arr_2[i][j]

for row in arr_3:
	for ele in row:
		print(elem,end=" ")
	print()