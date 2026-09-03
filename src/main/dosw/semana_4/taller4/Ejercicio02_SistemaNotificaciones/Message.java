package main.dosw.semana_4.taller4.Ejercicio02_SistemaNotificaciones;

public class Message {
    private String content;
    private String recipient;
    private String channel;

    public Message(String content, String recipient, String channel){
        this.content = content;
        this.recipient = recipient;
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "[" + channel + "] Para: " + recipient + " | Mensaje: " + content;
    }
}
