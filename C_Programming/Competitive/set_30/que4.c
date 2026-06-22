/*
   accept character from user and check wheather it is special symbol or not.
   (!,@,#,$,%,^,&,*)

    Input : %    Output : TRUE
    Input : d    Output : FALSE

*/

#include<stdio.h>
#include<stdbool.h>

bool chkSpecial(char ch)
{
      if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*')
      {
          return true;
      }
      else
      {
          return false;
      }

}

int main()
{
    char cValue = '\0';
    bool bRet = false;

    printf("Enter the character :");
    scanf("%c",&cValue);

    bRet = chkSpecial(cValue);

    if(bRet == true)
    {
        printf("it is special character");
    }
    else
    {
        printf("it is not a special character");

    }

    return 0;
}