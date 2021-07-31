package com.play.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @SequenceGenerator(
      name = "todo_sequence",
      sequenceName = "todo_sequence",
      allocationSize = 1
  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "todo_sequence"
  )
  @Column(name = "todo_id")
  private Long id;

  private String text;

  private String dateCreated;

  private final Date created = new Date();

  public Todo() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Date getCreated() {
    return created;
  }


}
