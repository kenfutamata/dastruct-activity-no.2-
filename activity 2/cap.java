
import java.util.*; 
import java.util.Arrays; 
public class cap{

Scanner input = new Scanner(System.in); 

public cap(int size){
int arr[] = new int[size]; 
}

//1. populate array elements
public void populate(int size, int arr[]){
System.out.print("Enter "+size+" numbers: "); 
for(int i =0; i < size; i++){
arr[i]=input.nextInt();  
}
menu(size, arr);
}
// menu driven program 
public void menu(int size, int arr[]){
System.out.println("Choose the following array operations!"); 
System.out.println("1. Print");
System.out.println("2. Insert");
System.out.println("3. Delete");
System.out.println("4. Search");
System.out.println("5. Sort");
System.out.println("6. Exit");
System.out.print("Please choose a array operation: ");
int choose = input.nextInt(); 
select(choose, size, arr); 
}

// selection of the 7 array operations
public void select(int choose, int size, int arr[]){
if(choose ==1){
print(size, arr); 
}
else if(choose == 2){
insert(size, arr); 
}
else if(choose == 3){
delete(size, arr); 
}
else if(choose == 4){
search(size, arr); 
}
else if(choose == 5){
sort(size, arr);  
}
else if(choose == 6){
System.exit(0); 
}

}

//2. print array elements
public void print(int size, int arr[]){
System.out.print("The "+size+" elements of the array are: ");
for(int i = 0; i < size; i++){
System.out.print(arr[i]+" "); 
}

System.out.println(); 
System.out.println(); 
System.out.print("Do you wish to continue? y or n: "); 
String ch = input.next(); 

if(ch.equals("y")){
menu(size, arr); 
}
else if(ch.equals("n")){
System.exit(0); 
}
}


//3. insert new element
public void insert(int size, int arr[]){
int num1=0, i;  
int arr1[] = new int[arr.length+size+1];   
System.out.println(); 
print(size, arr); 
System.out.println(); 
System.out.print("The above mentioned array, please choose a number to insert: "); 
int num = input.nextInt(); 
System.out.print("Choose an index number to insert: "); 
int pos = input.nextInt(); 
  arr1[size] = pos; 
  
  for(i = 0; i <size; i++){
  System.out.print(arr1[i]+" "); 
  }
  System.out.print(arr[size]); 
}

//4. delete an element 
public void delete(int size, int arr[]){
int delete; 
System.out.print("The "+size+" elements of the array are: ");
for(int i = 0; i < size; i++){
System.out.print(arr[i]+" "); 
}
/////////
System.out.println(); 
System.out.print("From the above mentioned array, please choose an element to delete: "); 
delete = input.nextInt(); 

for(int i = 0; i < arr.length; i++){
if(arr[i] == delete){
for(int j = i; j < arr.length-1; j++){
arr[j]= arr[j+1];    

}
break; 
}
}
System.out.print("Deleted array after selecting element no."+delete+": "); 
for(int k = 0; k < arr.length-1; k++){
System.out.print(" "+arr[k]); 

}
System.out.println(); 
System.out.println(); 
System.out.print("Do you wish to continue? y or n: "); 
String ch = input.next(); 

if(ch.equals("y")){
menu(size, arr); 
}
else if(ch.equals("n")){
System.exit(0); 
}
}

// 5. search an element 
public void search(int size, int arr[]){
System.out.print("The "+size+" elements of the array are: ");
for(int i = 0; i < size; i++){
System.out.print(arr[i]+" "); 
}
/////////
System.out.println(); 
System.out.print("From the above mentioned array, please choose an element to search: "); 
int search = input.nextInt(); 
System.out.println(); 

for(int i = 0; i < arr.length; i++){
if(arr[i]==search){ 
System.out.print("Element "+search+" is located at "+(i+1)+" ");
System.out.println(); 
System.out.println(); 
System.out.println(); 
System.out.print("Do you wish to continue? y or n: "); 
String ch = input.next(); 

if(ch.equals("y")){
menu(size, arr); 
}
else if(ch.equals("n")){
System.exit(0); 
}

return;  
}
}
System.out.print("Element not found!"); 

System.out.println(); 
System.out.println(); 
System.out.print("Do you wish to continue? y or n: "); 
String ch = input.next(); 

if(ch.equals("y")){
menu(size, arr); 
}
else if(ch.equals("n")){
System.exit(0); 
}
}

//6.Sort array elements 
public void sort(int size, int arr[]){
int temp = 0; 
for(int i = 0; i < size; i++){
for(int j = i+1; j < size; j++){
if(arr[i]>arr[j]){
temp = arr[i];
arr[i] = arr[j]; 
arr[j] = temp; 
}
}
}
System.out.println(); 
System.out.print("Sorted array: ");
for(int j = 0; j < size-1;j++){
System.out.print(arr[j]+" ");
}
System.out.print(arr[size-1]); 

System.out.println(); 
System.out.println(); 
System.out.print("Do you wish to continue? y or n: "); 
String ch = input.next(); 

if(ch.equals("y")){
menu(size, arr); 
}
else if(ch.equals("n")){
System.exit(0); 
}
}

}// end of file

