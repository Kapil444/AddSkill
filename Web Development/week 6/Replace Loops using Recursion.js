function sum(arr, n) {
  if(n==0){
    return 0;
  }
  
  // Only change code below this line
return sum(arr,n-1)+arr[n-1];
  // Only change code above this line
}
