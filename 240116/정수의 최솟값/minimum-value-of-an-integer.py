# 변수 선언 및 입력:
a, b, c = tuple(map(int, input().split()))


# 최솟값을 반환하는 함수를 작성합니다.
def get_min(a, b, c):
    min_val = a
    if min_val > b:
        min_val = b
    if min_val > c:
        min_val = c

    return min_val


print(get_min(a, b, c))