package me.nalam.logparser.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import me.nalam.logparser.constants.EventType;

@Entity
public class Event implements Serializable {
  @Id
  private String id;
  private Long duration;
  private EventType type;
  private String host;
  private boolean alert;

  public Event(String id, Long duration, EventType type, String host, boolean alert) {
    this.id = id;
    this.duration = duration;
    this.type = type;
    this.host = host;
    this.alert = alert;
  }

  public Event() {

  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public EventType getType() {
    return type;
  }

  public void setType(EventType type) {
    this.type = type;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public boolean isAlert() {
    return alert;
  }

  public void setAlert(boolean alert) {
    this.alert = alert;
  }

  @Override
  public String toString() {
    return "Event{" +
        "id='" + id + '\'' +
        ", duration='" + duration + '\'' +
        ", type=" + type +
        ", host='" + host + '\'' +
        ", alert=" + alert +
        '}';
  }
}
