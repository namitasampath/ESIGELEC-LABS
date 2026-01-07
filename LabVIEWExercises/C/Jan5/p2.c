#include<stdio.h>

typedef struct point {
    int x;
    int y;
    int z;
}point;

void fill (point *p, int s);
void list (point *p, int s);

int main()
{
    point points[3];int size = 3;
    fill(points, size);
    list(points, size);
    return 0;
}

void fill(point *p, int s){
    int i;
    for(i=0;i<s;i++){
        printf("Enter the value of 'x'_%d ", i+1); scanf("%d", &p[i].x);
        printf("Enter the value of 'y'_%d ", i+1); scanf("%d", &p[i].y);
        printf("Enter the value of 'z'_%d ", i+1); scanf("%d", &p[i].z);
    }
}
void list (point *p, int s){
    int i;
    for(i=0;i<s;i++){
        printf("x_%d: %d\t", i+1, p[i].x);
        printf("y_%d: %d\t", i+1, p[i].y);
        printf("z_%d: %d\t", i+1, p[i].z);
    putchar('\n');
    }
}
