(function(){

    // GET LIST OF ROOMS

    var nav = document.querySelector('aside nav')

    fetch('http://localhost:8080/rooms').then(response => {
        return response.json()
    }).then(data => {
        data.forEach(item => {
            nav.insertAdjacentHTML('beforeend', '<div class = "list-room"><div class = "nome">'+ item.roomName +'</div></div>')
        });
    })
})();

(function(){


    listener('click', '#verifyRoomBtn', showRooms)

    var divRooms = document.querySelector('.freeRooms')

    // VERIFY AVAILABLES ROOM
    function showRooms() {
        event.stopPropagation()
        var start = document.querySelector('#start_date')
        var end = document.querySelector('#end_date')

        fetch('http://localhost:8080/rooms/available?start='+start.value+'&end='+ end.value).then(response => {
            return response.json()
        }).then(data => {
            data.forEach(item => {
                // console.log(item.roomName)
                divRooms.insertAdjacentHTML('beforeend', '<div class = "content">'+ item.roomName +'</div>')
            });
        })

        divRooms.classList.add('-active')

        
    }

     // Listener class
     function listener(event, element, callback) {
        document.querySelector(element)
            .addEventListener(event, callback, false)

    }

})();