//Accept two numbers from the user and perform Bitwise AND, OR, and XOR operations on them.

#include<stdio.h>

int main()
{
    int No1 = 0, No2 = 0, Ans = 0;

    printf("Enter first number :\n");
    scanf("%d",&No1);
    
    printf("Enter second number :\n");
    scanf("%d",&No2);

    Ans = No1 & No2;                 

    printf("AND  : %d\n",Ans);       // 97,34 - 32

    Ans = No1 | No2;            

    printf("OR  : %d\n",Ans);       // 97,34 - 99

    Ans = No1 ^ No2;

    printf("XOR  : %d\n",Ans);      // 97,34 - 67

    return 0;
}