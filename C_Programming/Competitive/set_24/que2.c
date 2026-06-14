/*accept number of rows and columns from user and Display below pattern.

Input : iRow = 4    iCol = 3

Output : A   B   C   D
         a   b   c   d
         A   B   C   D
         a   b   c   d

*/
#include<stdio.h>

void Pattern(int iRow,int iCol)
{
    int i = 0, j = 0;
    char ch1 = '\0';
    char ch2 = '\0';
    
    for(i = 1; i <= iRow;i++) 
    {
        ch1 = 'a';
        ch2 = 'A';
        for(j = 1; j <= iCol; j++,ch1++,ch2++)
        {
            if(i % 2 == 0)
            {
                printf("%c ",ch1);
            }
            else
            {
                printf("%c ",ch2);
            }
        }
      printf("\n");
    }
}
int main()
{
    int iValue1 = 0,iValue2 = 0;

    printf("Enter Number of rows:");
    scanf("%d",&iValue1);

    
    printf("Enter Number of columns:");
    scanf("%d",&iValue2);

    Pattern(iValue1,iValue2);
    
    return 0;

}