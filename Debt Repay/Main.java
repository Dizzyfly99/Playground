#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p, r, y;
  cin >> p >> r >> y;
  float i, t, d, f;
  i = float(p * r * y)/100;
  t = i + p;
  d = 0.02 * i;
  f = t - d;
  printf("%.2f\n%.2f\n%.2f\n%.2f", i, t ,d ,f);
}