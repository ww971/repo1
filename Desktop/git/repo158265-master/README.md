# repo158265


##G³ówne informacje
Implementacja klasy myexp()

##Projekt utworzony przy pomocy:
Notepad++, https://www.w3schools.com/java/default.asp


##Skrypt

```
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    double x;
    cout<<"Please enter the precision x"<<endl;
    cin>>x;
    double myexp(double,double=1e-4);
    cout<<myexp(0.5,x);
    return 0;
}

double myexp(double x,double precision)
{
    int i=1,num=1.0;
    double sum=1;
    do
    {
        num=num*i;
        sum+=pow(x,i)/num;
        i++;
    }while(fabs(pow(x,i)/num)>precision);
    return sum;
}

```