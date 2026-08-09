#include<iostream>
using namespace std;

#pragram pack(1)
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

#pragram pack(1)
class DoublyCL
{
    private:
        PNODE first;
        PNODE last;
        int iCount;

    public:
        DoublyCL();

}

typedef struct node NODE;
typedef struct node* PNODE;

int main()
{

    DoublyCL dobj;

    cout<<sizeof(dobj)<<"\n";

    return 0;
}