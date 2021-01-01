let fs = require('fs');
const moment = require('moment');
const { EventEmitter } = require( 'events' );
var em = new EventEmitter();

em.addListener("createFolders",function(data){
   fs.mkdirSync('./development/src/',{ recursive: true }, (err) => {
    console.log(err);
  });
 
   fs.mkdirSync('./development/dest/',{ recursive: true }, (err) => {
    console.log(err);
  });
  console.log("Creating folder successfully");
});

em.addListener("createSourceFile",function(data){
var writeStream = fs.createWriteStream("./development/src/"+'testing.txt');
writeStream.write("yes I am to near with it is is working now properly .....");
writeStream.end();
console.log("creating source file successfully");
});
em.addListener("createDestFile",function(data){
  try {
    let readStream = fs.createReadStream("./development/src/"+'testing.txt');
    let Write = fs.createWriteStream("./development/dest/"+'testing.txt');
    readStream.on('open', function () {
      // This just pipes the read stream to the response object (which goes to the client)
      readStream.pipe(Write);
    });
    readStream.on('error', function(err) {
      res.end(err);
    });
    console.log("creating Destination file successfully");
  } catch (error) {
    console.log(error);
  }    
});

exports.emitter = em;