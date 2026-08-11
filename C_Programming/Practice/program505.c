#include<stdio.h>

void Display()
{

    auto int i = 1;                           //output will be jay ganesh....1 repetedly due to auto

    printf("Jay Ganesh...%d\n",i);
    i++;
     
    Display();                                //segmentation fault
}

int main()
{
    Display();

    return 0;
}