# Programming101

## Recusive Mode for Factorial of number
#include<stdio.h>
#include<conio.h>
int Fact(int n)
{int res=1;
	if(n==0 || n==1)
	return 1;
	else
	{
		res=n*Fact(n-1);
	}
	return res;
}
int main()
{
int f=Fact(5);
printf("%d",f);
}

# Iterative Mode
#include<stdio.h>
#include<conio.h>
int main()
{
	int i=1;int n;int res=1;
	printf("enter your value");
	scanf("%d",&n)
	for(i;i<=n;i++)
	{
		res=res*i;
	}
	printf("%d",res);
}

