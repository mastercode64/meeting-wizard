(function(){

    var nav = document.querySelector('aside nav')

    fetch('http://localhost:8080/rooms').then(response => {
        return response.json()
    }).then(data => {
        data.forEach(item => {
            console.log(item.roomName)
            nav.insertAdjacentHTML('beforeend', '<div class = "list-room"><div class = "nome">'+ item.roomName +'</div></div>')
        });
    })
})();