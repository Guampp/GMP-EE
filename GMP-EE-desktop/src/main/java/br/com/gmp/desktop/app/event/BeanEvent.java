    package br.com.gmp.desktop.app.event;

import java.awt.Frame;

/**
 *
 * @author kaciano
 */
public class BeanEvent {

    private Frame frame;
    private Object object;

    public BeanEvent(Frame frame, Object object) {
        this.frame = frame;
        this.object = object;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
