/*
    Write a recursive program which accept string from user and count number of small characters.

    Input : HElloWOrlD        Output  :  5

*/

#include<stdio.h>
#include<string.h>

int Small(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCount++;
        }
        Small(str+1);
    }
    return iCount;
}
int main()
{
    int iRet = 0;
    char Arr[20];

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    iRet = Small(Arr);
    printf("%d\n",iRet);

    return 0;
}