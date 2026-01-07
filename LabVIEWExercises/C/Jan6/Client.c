#include<stdio.h>
#include<stdlib.h>

typedef struct client{char name[10]; char email[10]; char phone[10]; int balance;}client;

int allocator(client **c, int *s);
void fill(client *c, int s);
void list(client *c, int s);
void transfer(client *c, int s);
int search(client *c, int s);
int stringLength(char *n);

int main()
{
 client *clients; int size, i;
 while(allocator(&clients, &size));
 fill(clients, size);
 list(clients, size);
 transfer(clients, size);
 list(clients, size);
 free(clients);
 return 0;
}

int stringLength(char *n){
 int i = 0;
 while(n[i]){i++;}
 return i;
}

int search(client *c, int s){
 char nameToBeFound[10]; int i, j, nameLength;
 printf("Client's name: "); scanf("%s", nameToBeFound);
 nameLength = stringLength(nameToBeFound);
 for(i = 0; i < s; i++)
 {
  if(nameLength == stringLength(c[i].name))
  {
   j = 0;
   while(j < nameLength && nameToBeFound[j] == c[i].name[j]){ j++; }
   if(j == nameLength){ return i; }
  }
 }	
}

void transfer(client *c, int s){
 int sender, receiver, amount;
 sender = search(c, s);
 receiver = search(c, s);
 printf("Amount of money: "); scanf("%d", &amount);
 c[sender].balance -= amount;
 c[receiver].balance += amount;
}

int allocator(client **c, int *s){
 printf("Number of elements: "); scanf("%d", s);
 *c = (client *)malloc(*s * sizeof(client));
 if(*c == NULL){ printf("Error...\n"); return 1; }
 return 0;
}

void list(client *c, int s){
 int i;
 for(i = 0; i < s; i++){
	printf("Name %d: %s\t", i + 1, c[i].name); 
	printf("Email %d: %s\t", i + 1, c[i].email);
	printf("Phone %d: %s\t", i + 1, c[i].phone);
	printf("Balance %d: %d\n", i + 1, c[i].balance);
 }
}

void fill(client *c, int s){
 int i;
 for(i = 0; i < s; i++){
	printf("Name %d: ", i + 1); scanf("%s", c[i].name); 
	printf("Email %d: ", i + 1); scanf("%s", c[i].email);
	printf("Phone %d: ", i + 1); scanf("%s", c[i].phone);
	printf("Balance %d: ", i + 1); scanf("%d", &c[i].balance);
 }
}
