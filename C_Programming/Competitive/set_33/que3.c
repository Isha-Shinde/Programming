/*
   write a program which accept string from user and accept one character. 
   return index of first occurence of that character.
   
   Input : "Marvellous Multi OS"   M   Output : 0

    Input : "Marvellous Multi OS"   w   Output : -1

    Input : "Marvellous Multi OS"   e   Output : 4


*/

#include<stdio.h>

int FirstChar(char *str,char ch)
{

    int iIndex = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            return iIndex;
        }
        iIndex++;
        str++;
    }

    return -1;
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

    iRet = FirstChar(arr,cValue);

    printf("character location is : %d",iRet);

    return 0;
}