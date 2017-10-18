socket = require('socket')
port = 3030
server = socket.bind('*', port)
io.write("Listening to port " ..port.. "\n")
SV = server:accept()
io.write("Connection Establisehed !\n")

while true do
	msg = SV:receive()
	io.write(msg .."\n")
	io.write("Respond > ")
	SV:send(io.read() .. "\n")
end

io.read()

