/*accept character from user and check wheather it is digit or not(0-9).

Input : 7    Output : TRUE

Input : d    Output : FALSE

*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkDigit(char ch)
{
    int iCnt = 0;

    for(iCnt = 48;iCnt <= 57;iCnt++)
    {
        if(ch == iCnt)
        {
            break;
        }
    }
    if(iCnt >= 58)
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

    bRet = ChkDigit(cValue);

    if(bRet == TRUE)
    {
        printf("it is Digit");
    }
    else
    {
        printf("it is not a Digit");
    }

    return 0;
}