#include <iostream>
using namespace std;
int main()
{
    int array[10], n, i, item;
    cout << "Enter the size of array: ";
    cin >> n;
    cout << "\nEnter Elements in array: ";
    for (int i = 0; i < n; i++)
    {
        cin >> array[i];
    }
    // cout << "\n enter the element at the beginning";
    // cin >> item;
    // n++;
    // for (int i = n; i > 1; i--)
    // {
    //     array[i - 1] = array[i - 2];
    // }
    // array[0] = item;
    // cout << "resultant array element";
    // for (int i = 0; i < n; i++)
    // {
    //     cout << array[i];
    // }
    // getch();
    return 0;
}