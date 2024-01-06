#string.upper() >> 문자열 대문자로 바꿔서 리턴. 기존 문자열은 변화 X 
#string.lower() >> 문자열 소문자로 바꿔서 리턴. 기존 문자열은 변화 X


arr_2 = list()
for _ in range(5):
    arr_1 = list(input().split())
    arr_2.append(arr_1)

for i in range(5):
    for j in range(3):
        arr_2[i][j]=arr_2[i][j].upper()

for i in range(5):
    for j in range(3):
        print(arr_2[i][j], end =" ")
    print()
