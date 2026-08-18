#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

void FileCopy(char FileNameSrc[], char FileNameDest[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fdSrc = 0, fdDest = 0;

    fdSrc = open(FileNameSrc,O_RDONLY);

    if(fdSrc == -1)
    {
        printf("Enable to open Source file\n");     
        return;      
    }

    fdDest = creat(FileNameDest,0777);
    if(fdDest == -1)
    {
        printf("Enable to open Destnttion file\n");     
        return;      
    }

    while((iRet = read(fdSrc,Buffer,sizeof(Buffer))) != 0)       
    {
        write(fdDest,Buffer,iRet);
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fdSrc);
    close(fdDest);

}

int main()
{
    
    char FnameSrc[30] = {'\0'};
    char FnameDest[30] = {'\0'};

    printf("Entter the Source file name : \n");
    scanf("%[^'\n']s",FnameSrc);
    
    printf("Entter the Destination file name : \n");
    scanf("%[^'\n']s",FnameDest);    // ISSUE

    FileCopy(FnameSrc,FnameDest);
    

    return 0;

}