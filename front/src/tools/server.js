var http = require('http');

var nStatic = require('node-static');

var fileServer = new nStatic.Server('../../../front');

http.createServer(function (req, res) {
    
    fileServer.serve(req, res);

}).listen(3000);