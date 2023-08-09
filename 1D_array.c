#include<stdio.h>
void main(){
    //1D array with pointers
    //int *p is a pointer variable to the integer data type and not called interger pointer
    //float *f is pointer variable to the float data type and not a floating pointer 
    //char *c is pointer variable to the char data type and not a charater pointer 
    //  * is a dereferencinf operator
    //%p is used to print the pointer value
    //although we use the %u and %x to print the pointer value , here we will not feel any major differences in these
    
    int b=10, a[]={6,2,1,5,3,10};
    int *p, *q;
    
    
   // p=b;      this is a wrong method becouse here variable b is not a array hence we must declare the &
   // printf("address is = %p", p);
   
   //OUT PUT is
   //main.c: In function ‘main’:
   //main.c:13:6: warning: assignment to ‘int *’ from ‘int’ makes pointer from integer without a cast [-Wint-conversion]
   //13 |     p=b;
   //   |      ^
   //address is = 0xa
   
    p=&b;  //this is the currect method to the 0D array
    printf("address of b is = %p\n", p);
    
    p=a; //Here this is a curect method becouse the variable a is 1D array in 1D array contain the base address of that array hence it is allowed
    p=&a; //this is also the the same nut it represent the complete array address
    printf("\naddress of a is = %p", p);
    printf("\naddress of a is = %p\n", p);
    
    //Arithmetic Operation on pointer
    printf("\n*(a+1) = %d", *(a+1));
    
    
    
    
   
   
    
}