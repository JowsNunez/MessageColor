package io.github.jowsnunez.messagecolor;

import io.github.jowsnunez.messagecolor.enums.Color;

@Deprecated
public interface IMessageColor {
    
    MessageColorBuilder messageColor(Color color, String message);
}
