<html>
    <head>
         <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    </head>
    <body>
        <p>ID: <input type="number" id="idnumber"/></p>
        <p>NAME: <input type="text" id="idtxt"/></p>
        <button onclick="add()">Click Me!</button>
        <hr>
        <table border="1">
            <tr style="background: cornflowerblue">
                <th>ID</th>
                <th>NAME</th>
            </tr>
            <tbody id="body1">

                <tr>
                    <td>1</td>  
                    <td>Itay</td>
                </tr>
                <tr>
                    <td>2</td>  
                    <td>Danna</td>
                </tr>                

            </tbody>
        </table>

<script>
function Person(_id, _name) {
    this.id = _id
    this.name = _name
}
    var id = $("#idnumber").val()
    var name = $("#idtxt").val()
function add() {
    var p = new Person(id, name)
    console.log(p)
    addRow(p)
}
function addRow(p) {
    $("#body1").append(`<tr><td>${p.id}</td><td>${p.name}</td></tr>`)
}
</script
    </body>
</html
