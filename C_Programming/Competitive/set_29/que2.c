/*accept character from user and check wheather it is capital or not(A-Z).

Input : F    Output : TRUE

Input : d    Output : FALSE

*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkCapital(char ch)
{
    int iCnt = 0;

    for(iCnt = 65;iCnt <= 90;iCnt++)
    {
        if(ch == iCnt)
        {
            break;
        }
    }
    if(iCnt >= 91)
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

    bRet = ChkCapital(cValue);

    if(bRet == TRUE)
    {
        printf("it is Capital Character");
    }
    else
    {
        printf("it is not a Capital Character");
    }

    return 0;
}