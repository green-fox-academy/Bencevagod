#include <iostream>
using namespace std;

void game(){
    string tableRow1[] = {"-", " - ", "-"};
    string tableRow2[] = {"-", " - ", "-"};
    string tableRow3[] = {"-", " - ", "-"};
    int lepes;
    bool endOfGame = false;
    while(endOfGame == false){

        for (int i=0; i < 3; i++){
            cout << tableRow1[i] << endl;
        }
        for (int i=0; i < 3; i++){
            cout << tableRow2[i] << endl;
        }
        for (int i=0; i < 3; i++){
            cout << tableRow3[i] << endl;
        }
        
        cout << "Where do you want to step?" << endl;
        cin >> lepes;
        switch (lepes){
            case 1:
                tableRow1[0] = "x";
                break;
            case 2:
                tableRow1[1] = " x ";
                break;
            case 3:
                tableRow1[2] = "x";
                break;
            case 4:
                tableRow2[0] = "x";
                break;
            case 5:
                tableRow2[1] = " x ";
                break;
            case 6:
                tableRow2[2] = "x";
                break;
            case 7:
                tableRow3[0] = "x";
                break;
            case 8:
                tableRow3[1] = " x ";
                break;
            case 9:
                tableRow3[2] = "x";
                break;
        
            default:
                cout << "Not a valid step." << endl;
                break;
        }

    }
    
}

int main()
{
    game();

    return 0;
}