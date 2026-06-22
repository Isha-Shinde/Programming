/*accept character from user and check wheather it is alphabet or not(A-Z a-z).

Input : F    Output : TRUE

Input : &    Output : FALSE

*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAlpha(char ch)
{
    int iCnt = 0;
    int bFlag = FALSE;

    for(iCnt = 'A';iCnt <= 'Z';iCnt++)
    {
        if(ch == iCnt)
        {
            bFlag = TRUE;
            break;
        }
    }

    if(bFlag == FALSE)
    {
        for(iCnt = 'a';iCnt <= 'z';iCnt++)
        {
            if(ch == iCnt)
            {
                bFlag = TRUE;
                break;
            }
        }
    }

    if(bFlag == TRUE)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character :");
    scanf("%c",&cValue);

    bRet = ChkAlpha(cValue);

    if(bRet == TRUE)
    {
        printf("it is  Character");
    }
    else
    {
        printf("it is not a Character");
    }

    return 0;
}