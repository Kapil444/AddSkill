// Setup
function phoneticLookup(val) {
  var result = "";
  
  let Lookups = {
    alpha : "Adams",
    bravo : "Boston",
    charlie : "Chicago",
    delta : "Denver",
    echo : "Easy",
    foxtrot : "Frank",
   
  }; 
  result = Lookups[val];
  return result;
}

phoneticLookup("charlie");
