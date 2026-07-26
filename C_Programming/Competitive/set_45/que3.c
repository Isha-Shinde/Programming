/*
    Write a recursive program which accept string from user and count number of characters.

    Input : Hello         Output  :  5

*/

#include<stdio.h>
#include<string.h>

int Strlen(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        iCount++;
        str++;

        Strlen(str);
    }
    return iCount;
}
int main()
{
    int iRet = 0;
    char Arr[20];

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    iRet = Strlen(Arr);
    printf("%d\n",iRet);

    return 0;
}