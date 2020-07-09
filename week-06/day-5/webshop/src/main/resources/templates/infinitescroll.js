window.onscroll = function (ev) {
    if ((window.innerHeight + document.documentElement.scrollTop) >= document.body.scrollHeight) {
        fetch('http://localhost:8080/')
            .then(response => response.json())
            .then(json => {
                let li;
                json.forEach(item => {
                    li += `<tr>
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.price}</td>
                    <td>${item.stock}</td>
                    </tr>`
                });
            document.getElementById("itemsTable").innerHTML += li;
            });
    }
}