
let keywords = []
let map = new Map();

function ReadFile(files){	
    let file = inputfile.files[0];	
    let reader = new FileReader();	
    reader.readAsText(file);	
    reader.onload = function(){	
        filecontent.value = reader.result; 
        callApi( reader.result)	
    }	
}	
async function callApi(content){
   let response = new Response();
    console.log(content);
   let result = await fetch("https://api.textgears.com/grammar?text="+content+"&language=en-US&key=1gVny1rfj02gy7kY",{
       method:"POST",      
     body : content
   });
    if(result.status = 200){
         response = await result.json()
        for (const error of await response.response.errors) {
            console.log('Error: %s. Suggestions: %s', error.bad, error.better.join(', '));
            keywords.push(error.bad);
            map.set(error.bad,error.better.join(','));
        }
        changeColor(keywords,map);
    }       
}
function changeColor(key,map){ 
    console.log(map);   
 let ul =    document.createElement("ul");
 map.forEach(element =>{
    let li =   document.createElement("li");
     li.innerText = element.val
 })
 
var newHTML = "";
let content = new String(document.getElementById('filecontent').value);
content.split(" ").forEach((val)=>{
  // If word is statement
  if (key.indexOf(val.trim()) > -1){
    newHTML +=  `<div class="dropdown">
      <button class="dropbtn">${val}</button>
      <div class="dropdown-content">
        <a href="#">${map.get(val)}</a>        
      </div>
    </div>`;
    // newHTML += "<span class='statement'>" + val + "&nbsp;</span>";
  }            
  else{
    newHTML += "<span class='other'>" + val + "&nbsp;</span>"; 
  }            
});
console.log(newHTML);
document.getElementById("editor").innerHTML = newHTML;

filecontent.focus(); 
    
}