#include <stdio.h>
#define MAX_SIZE 15

int main()
{
	static int square[MAX_SIZE][MAX_SIZE];
	int i, j, row, column;
	int size;
	int count;

	printf("사이즈 입력 : ");
	scanf("%d", &size);
	if (size < 1 || size> MAX_SIZE +1)
	{
		fprintf(stderr, "에러 ! 범위값 안에 있지 않다 !");
		exit(1);
	}

	if (!(size % 2))
	{
		fprintf(stderr, "에러 ! 사이즈가 홀수 여야 한다 !");
		exit(1);
	}

	for (i = 0; i < size; i++)
  {
