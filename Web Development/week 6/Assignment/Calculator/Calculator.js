function dis(event){
  document.getElementById("input").value +=event;
}
function result(event){
    let val = document.getElementById("input").value;
    val = eval(val);
    if(val!=undefined){
      document.getElementById("input").value = val;
    }   
}
function backspace(event){
  let val = document.getElementById("input").value;
  val = val.substring(0,val.length-1);
  document.getElementById("input").value = val;
}
function clr(){
    document.getElementById("input").value = ""
}
function sin(){
   let val = document.getElementById("input").value;
  val = Math.sin(val);
  if(val!=undefined){
    document.getElementById("input").value = val;
  }else{
    document.getElementById("input").value = "Error";
  }  
}
function cos(){
   let val = document.getElementById("input").value;
  val = Math.cos(val);
  if(val!=undefined){
    document.getElementById("input").value = val;
  }else{
    document.getElementById("input").value = "Error";
  }  
}
function tan(){
  let val = document.getElementById("input").value;
  val = Math.tan(val);
  if(val!=undefined){
    document.getElementById("input").value = val;
  }else{
    document.getElementById("input").value = "Error";
  }  
}
function squre(){
  let val = document.getElementById("input").value;
  val = val*val;
  if(val!=undefined){
    document.getElementById("input").value = val;
  }else{
    document.getElementById("input").value = "Error";
  }  
}
function log(){
  let val = document.getElementById("input").value;
  val = Math.log10(val);
  if(val!=undefined){
    document.getElementById("input").value = val;
  }else{
    document.getElementById("input").value = "Error";
  }  
}
function tanPow(){
  let val = document.getElementById("input").value;
  val = Math.pow(10,val);
  if(val!=undefined){
    document.getElementById("input").value = val;
  }else{
    document.getElementById("input").value = "Error";
  }  
}
function sqrt(){
  let val = document.getElementById("input").value;
  val = Math.sqrt(val);
  if(val!=undefined){
    document.getElementById("input").value = val;
  }else{
    document.getElementById("input").value = "Error";
  }  
}

function power(){
  let val = document.getElementById("input").value;
  val = Math.exp(val);
  if(val!=undefined){
    document.getElementById("input").value = val;
  }else{
    document.getElementById("input").value = "Error";
  } 
}
function fact(){
  let val = document.getElementById("input").value;
  let res = 1;
  for(let i =val;val>0;val--){
    res *=val;
  }
  if(val!=undefined){
    document.getElementById("input").value = res;
  }else{
    document.getElementById("input").value = "Error";
  } 
}
