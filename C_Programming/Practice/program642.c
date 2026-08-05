#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>
#include<stdbool.h>
int main()
{ 
    //Conditional platform
    #ifdef _WIN32  //macro of window 
        printf("project is running on windows platform\n");
    #else 
        system("project is running on Linux/MacOS platform\n");
    #endif

    return 0;
}