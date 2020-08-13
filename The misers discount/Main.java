#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float a, b, c, disc;
  cin >> a >> b >> c;
  disc = (a+b)*(c/100);
  cout << a + b << endl << a + b - disc << endl << disc;
}