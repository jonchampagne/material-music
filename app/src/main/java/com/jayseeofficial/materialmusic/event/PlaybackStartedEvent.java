package com.jayseeofficial.materialmusic.event;

/**
 * Created by jon on 30/05/15.
 */
public class PlaybackStartedEvent implements PlaybackEvent {

    public static final String EVENT_TYPE = "start";

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }
}
