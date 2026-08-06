#include<stdio.h>  //1
#include<stdlib.h>
 
#pragma pack(1)
struct node //2
{
    int data;
    struct node *next;
    struct node *prev;           // $
};
// 3
typedef struct node NODE;        
typedef struct node* PNODE;
typedef struct node** PPNODE;

int main()
{
    printf("%d\n",sizeof(NODE));   // 20 bytes

    return 0;
}