/*accept character from user and check wheather it is small case or not(a-z).

Input : g    Output : TRUE

Input : D    Output : FALSE

*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkSmall(char ch)
{
    int iCnt = 0;

    for(iCnt = 'a';iCnt <= 'z';iCnt++)
    {
        if(ch == iCnt)
        {
            break;
        }
    }
    if(iCnt > 'z')
    {
        return FALSE;
    }
    else
    {
        return TRUE;
    }

}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character :");
    scanf("%c",&cValue);

    bRet = ChkSmall(cValue);

    if(bRet == TRUE)
    {
        printf("it is Small Case Character");
    }
    else
    {
        printf("it is not a Small Case Character");
    }

    return 0;
}