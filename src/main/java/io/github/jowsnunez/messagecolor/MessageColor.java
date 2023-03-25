package io.github.jowsnunez.messagecolor;

@Deprecated
public class MessageColor {
    private String message;
    private String name;

    public MessageColor(){
        this.message ="";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message +=" " + message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString(){
        return this.message;
    }



}




