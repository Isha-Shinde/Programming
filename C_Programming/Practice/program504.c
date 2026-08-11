#include<stdio.h>

void Display()
{

    printf("Jay Ganesh\n");
     
    Display();                    //segmentation fault
}

int main()
{
    Display();

    return 0;
}