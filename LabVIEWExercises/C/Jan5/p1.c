
#include<stdio.h>
void sort(int *a, int n){
    for(int i = 1;i<n;i++){
        for(int j = i; j>0 ; j--){
            if(a[j-1]>a[j]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1]= temp;
            }
        }
    }
}
void fill(int *array,int n){
    for(int i = 0;i<n;i++){
        printf("Enter the element %d: ", i+1);
        scanf("%d", &array[i]);
    }
}

void list(int *array,int n){
    for(int i = 0;i<n;i++){
        printf("Element %d: %d\n", i+1, array[i]);
    }
}
void main(){
    int n =0; int array[50];
    printf("Enter size of the array ");
    scanf("%d", &n);
    fill(array, n);
    printf("Array before sorting \n");
    list(array, n);
    sort(array, n);
    printf("Array after sorting \n");
    list(array, n);


}
