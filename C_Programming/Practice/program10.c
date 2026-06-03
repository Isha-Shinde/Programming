//////////////////////////////////////////////////////////////////////
//
// Include required header files
//
//////////////////////////////////////////////////////////////////////

#include<stdio.h>

//////////////////////////////////////////////////////////////////////
//
//  Function name : AddTwoNumbers
//  input :         float, float
//  Output :        float
//  Description :   performs addition of two floats
//  Date :          08/05/2026
//  Author:         Isha Suresh Shinde
//
//////////////////////////////////////////////////////////////////////
float AddTwoNumbers(
                       float fNo1,                  // First input
                       float fNo2                   // Second input
                    )
{
   float fAns = 0.0f;                               //Variable to store result

   fAns = fNo1 + fNo2;                              //perform addition

   return fAns;
}
//////////////////////////////////////////////////////////////////////
//
//  Application to perform addition of two float values
//
//////////////////////////////////////////////////////////////////////
int main()
{
    float fValue1 = 0.0f;                          // To store first input
    float fValue2 = 0.0f;                          // to store second input
    float fResult = 0.0f;                          // to store the result

    printf("Enter First Number :\n");
    scanf("%f",&fValue1);

    printf("Enter Second Number :\n");
    scanf("%f",&fValue2);

    fResult = AddTwoNumbers(fValue1 , fValue2);           

    printf("Addition is : %f\n",fResult);   

    return 0;
}

//////////////////////////////////////////////////////////////////////
//
//  Input :  10.0  11.0
//  Output : 20.0
//
//
//////////////////////////////////////////////////////////////////////