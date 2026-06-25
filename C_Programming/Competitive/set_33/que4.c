/*
   write a program which accept string from user and accept one character. 
   return index last occurence of that character.
   
   Input : "Marvellous Multi OS"   M   Output : 11

    Input : "Marvellous Multi OS"   w   Output : -1

    Input : "Marvellous Multi OS"   e   Output : 4


*/

#include<stdio.h>

int LastChar(char *str,char ch)
{

    int iIndex = -1;
    int iCnt = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            iIndex = iCnt;
        }
        iCnt++;
        str++;
    }

    return iIndex;
}


int main()
{
    char arr[20];
    char cValue = 0;
    int iRet = 0;

    printf("Enter string :");
    scanf("%[^'\n]s",arr);

    printf("Enter the character :");
    scanf(" %c",&cValue);

    iRet = LastChar(arr,cValue);

    printf("character location is : %d",iRet);

    return 0;
}