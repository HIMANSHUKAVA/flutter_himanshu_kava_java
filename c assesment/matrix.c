#include <stdio.h>

int main() {

    int matrix[2][2] = { {1, 2}, {4, 5} };
    int matrix2[2][2] = { {6, 7}, {7, 8} };
    int matrix3[2][2];

    for(int i = 0; i < 2; i++) {
        for(int j = 0; j < 2; j++) {

            matrix3[i][j] = 0;

            for(int k = 0; k < 2; k++) {
                matrix3[i][j] += matrix[i][k] * matrix2[k][j];
            }
        }
    }

    // Printing result matrix
    printf("Result Matrix:\n");
    for(int i = 0; i < 2; i++) {
        for(int j = 0; j < 2; j++) {
            printf("%d ", matrix3[i][j]);
        }
        printf("\n");
    }

    return 0;
}
