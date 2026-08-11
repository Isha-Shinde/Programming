#include<stdio.h>

void Display()
{

    static int i = 1;        

    printf("Jay Ganesh...%d\n",i);
    i++;
     
    Display();                    //segmentation fault
}

int main()
{
    Display();

    return 0;
}