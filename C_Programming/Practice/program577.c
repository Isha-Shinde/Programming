#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>   //only Linux based OS

int main()
{
    int fd = 0;
    int iRet = 0;

    fd = open("Marvellous.txt",O_RDWR);

    if(fd == -1)
    {
        printf("Enable to open file\n");
    }
    else
    {
        printf("Files gets successfully opened with fd : %d\n",fd);

        iRet = write(fd,"Jay Ganesh...",13);
        printf("%d Bytes gets successfully Written \n",iRet);
        
        close(fd);
    }

    return 0;
}