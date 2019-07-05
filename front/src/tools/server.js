var http = require('http');

var nStatic = require('node-static');

var fileServer = new nStatic.Server('../../../front');

http.createServer(function (req, res) {
    
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Request-Method', '*');
    res.setHeader('Access-Control-Allow-Methods', 'OPTIONS, GET');
    res.setHeader('Access-Control-Allow-Headers', '*');

    fileServer.serve(req, res);


}).listen(3000);