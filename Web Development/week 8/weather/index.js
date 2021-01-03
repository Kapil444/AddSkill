window.onload = async () => {
  let result = await fetch(
    "https://api.openweathermap.org/data/2.5/weather?lat=22.719568&lon=75.857727&appid=bd68fe743ad938a12d2d85637ef61c91",{
      method:"GET"
    }
  );
  result.json().then((res)=>{
    let article =  document.getElementById("article");
    article.innerHTML =  `
       <div id="degreeC" onclick="toggleIntoF(event)"><span>${(res.main.temp - 274)}&deg;C</span></div>
       <div id="degreeF" onclick="toggleIntoC(event)" style="display:none;"><span>${(res.main.temp - 256)}&deg;F</span></div>
       <div>    
         <div>${res.weather[0].main}</div>    
         <div>${res.name} ,${res.sys.country}</div>
       </div>
     <div>wind speed : ${res.wind.speed}m/s</div>
 `   ; 
  })
};

function toggleIntoF(event){
 let c = document.getElementById("degreeC");
 c.style.display = "none";
 let f = document.getElementById("degreeF");
 f.style.display = "";
}
function toggleIntoC(){
  let c = document.getElementById("degreeF");
 c.style.display = "none";
 let f = document.getElementById("degreeC");
 f.style.display = "";
 
}
