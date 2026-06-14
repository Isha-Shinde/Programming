/*accept number from user and Display below pattern.

Input : 5

Output : 5 # 4 # 3 # 2 # 1 #

*/
#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    
    for(iCnt = iNo;iCnt >= 1;iCnt--) 
    {
        printf("%d %s",iCnt,"# ");
    }
}
int main()
{
    int iValue = 0;

    printf("Enter Number of elements:");
    scanf("%d",&iValue);

    Pattern(iValue);
    
    return 0;

}