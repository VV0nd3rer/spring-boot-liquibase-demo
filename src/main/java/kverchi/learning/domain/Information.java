package kverchi.learning.domain;

/**
 * Created by Liudmyla Melnychuk on 10.10.2017.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Information")
public class Information {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
