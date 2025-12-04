<!DOCTYPE html>
<html>
<head>
    <title>WebSocket Test</title>
</head>
<body>
<h2>Tomcat 10 WebSocket Example</h2>

<input type="text" id="msg" />
<button onclick="sendMsg()">Send</button>

<p id="log"></p>

<script>
    const ws = new WebSocket("ws://" + window.location.host + "/websocket-demo/chat");

    ws.onmessage = function (event) {
        document.getElementById("log").innerHTML += "<br>" + event.data;
    };

    function sendMsg() {
        let msg = document.getElementById("msg").value;
        ws.send(msg);
    }
</script>
</body>
</html>
