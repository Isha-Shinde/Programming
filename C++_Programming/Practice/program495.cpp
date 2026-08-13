//Doubly Circular LL

#include<iostream>
using namespace std;

#pragma pack(1)
template <class T>
struct node
{
    T data;
    struct node *next;
    struct node *prev;     //$
};

template <class T>
class DoublyLL
{
    private:
       struct node<T> *first;
       int iCount;
    
    public:
       DoublyLL();
       void Display();
       int Count();
       void InsertFirst(T iNo);
       void InsertLast(T iNo);
       void InsertAtPos(T iNo,T iPos);
       void DeleteFirst();
       void DeleteLast();
       void DeleteAtPos(T iPos);     
};

template <class T>
DoublyLL<T> :: DoublyLL()
{
    this->first = NULL;
    this->iCount = 0;
}

template <class T>
void DoublyLL<T> :: Display()
{
    struct node<T> *temp = NULL;

    temp = first;

    cout<<"\n"<<"NULL"<<" <=> ";

    while(temp != NULL)
    {
        cout<<"| "<<temp->data<<" | <=> ";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}

template <class T>
int DoublyLL<T> :: Count()
{
    return this->iCount;
}

template <class T>
void DoublyLL<T> :: InsertFirst(T iNo)
{
    struct node<T> *newn = NULL;

    newn = new struct node<T>;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else
    {
        newn->next = this->first;
        this->first->prev = newn;
        this->first = newn;
    }
    this->iCount++;
}

template <class T>
void DoublyLL<T> :: InsertLast(T iNo)
{
  
    struct node<T> *newn = NULL;
    struct node<T> *temp = NULL;

    newn = new struct node<T>;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else
    {
        temp = this->first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
        newn->prev = temp;
    }
    this->iCount++;
}

template <class T>
void DoublyLL<T> :: InsertAtPos(T iNo,T iPos)
{
    struct node<T> *newn = NULL;
    struct node<T> *temp = NULL;

    int i = 0;

    if((iPos < 1) || (iPos > iCount+1))
    {
        cout<<"Invalid position"<<endl;
        return;
    }

    if(iPos == 1)
    {
        this->InsertFirst(iNo);
    }
    else if(iPos == iCount+1)
    {
        this->InsertLast(iNo);
    }
    else 
    {
        newn = new struct node<T>;

        newn->data = iNo;
        newn->next = NULL;
        newn->prev = NULL;

        temp = this->first;

        for(i = 1; i < iPos-1; i++)
        {
            temp =temp->next;
        }
        newn->next = temp->next;
        temp->next->prev = newn;
        temp->next = newn;
        newn->prev = temp;

        this->iCount++;
    }
}

template <class T>
void DoublyLL<T> :: DeleteFirst()
{
    
    struct node<T> *temp = NULL;

    if(this->first == NULL)
    {
        return;
    }
    else if(this->first->next == NULL)
    {
        delete this->first;
        this->first = NULL;
    }
    else
    {
        temp = this->first;

        this->first = this->first->next;
        delete this->first->prev;
        this->first->prev =NULL;
    }
    this->iCount--;
}

template <class T>
void DoublyLL<T> :: DeleteLast()
{
    struct node<T> *temp = NULL;

    if(this->first == NULL)
    {
        return;
    }
    else if(this->first->next == NULL)
    {
        delete this->first;
        this->first = NULL;
    }
    else
    {
        temp = this->first;

        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }
        delete temp->next;
        temp->next = NULL;
    }
    this->iCount--;
}

template <class T>
void DoublyLL<T> :: DeleteAtPos(T iPos)
{

    struct node<T> *temp = NULL;

    int i = 0;

    if((iPos < 1) || (iPos > iCount))
    {
        cout<<"Invalid position"<<endl;
        return;
    }

    if(iPos == 1)
    {
        this->DeleteFirst();
    }
    else if(iPos == iCount)
    {
        this->DeleteLast();
    }
    else 
    {
        temp = this->first;

        for(i = 1; i < iPos-1; i++)
        {
            temp =temp->next;
        }
        temp->next = temp->next->next;
        delete temp->next->prev;
        temp->next->prev = temp;
    
        this->iCount--;
    }
}

int main()
{
    DoublyLL <int>sobj;
    int iRet = 0;

    sobj.InsertFirst(51);
    sobj.InsertFirst(21);
    sobj.InsertFirst(11);
    sobj.Display();

    iRet = sobj.Count();
    cout<<"numbes of nodes : "<<iRet<<endl;

    sobj.InsertLast(101);
    sobj.InsertLast(111);
    sobj.InsertLast(121);
    sobj.Display();

    iRet = sobj.Count();
    cout<<"numbes of nodes : "<<iRet<<endl;

    sobj.DeleteFirst();
    
    sobj.Display();

    iRet = sobj.Count();
    cout<<"numbes of nodes : "<<iRet<<endl;

    
    sobj.DeleteLast();
    
    sobj.Display();

    iRet = sobj.Count();
    cout<<"numbes of nodes : "<<iRet<<endl;

    
    sobj.InsertAtPos(105,4);
    
    sobj.Display();

    iRet = sobj.Count();
    cout<<"numbes of nodes : "<<iRet<<endl;

    sobj.DeleteAtPos(4);
    
    sobj.Display();

    iRet = sobj.Count();
    cout<<"numbes of nodes : "<<iRet<<endl;
    
    return 0;

}