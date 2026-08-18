#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>
#include<sys/stat.h>                
 
#define BUFFER_SIZE 1024

void DisplayFileInformation(char FileName[])
{
    struct stat sobj;

    stat(FileName,&sobj);

    printf("File name : %s\n",FileName);
    printf("Inode Number : %llu\n",sobj.st_ino); 
    printf("File size is : %d\n",sobj.st_size);   // OR  printf("File size is : %lld\n",(long long)sobj.st_size);   

}

int main()
{
    
    char Fname[30] = {'\0'};

    printf("Entter the file name : \n");
    scanf("%[^'\n']s",Fname);

    DisplayFileInformation(Fname);

    return 0;
}