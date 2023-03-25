package io.github.jowsnunez.messagecolor;

import io.github.jowsnunez.messagecolor.enums.Color;

@Deprecated
public class MessageColorBuilder implements IMessageColor{

    private MessageColor colorString;

    public MessageColorBuilder(){

        this.colorString = new MessageColor();
    }


    public MessageColorBuilder nameColor(Color color, String name){

         this.colorString.setName(color.getValue() + name);
            return this;

    }


    @Override
    public MessageColorBuilder messageColor(Color color, String message){

        this.colorString.setMessage(color.getValue() + message);
        return this;

    }

    public MessageColor build() {
        return colorString;
    }


}
