package pl.allegier.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Pawel Szczepkowski | Satlan on 03.04.17.
 */

@Entity
@Table(name = "ACCOUNTS")
public class Account implements Serializable  {

    private static final long serialVersionUID = 1538176138199455942L;

    private Integer id;

    private String login;
    private String password;

    private Date created;
    private Date updated;

    public Account(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    public Account() {
        this.created = new Date();
        this.updated = new Date();
    }

    @Id
    @GeneratedValue
    @Column
    public Integer getId() {
        return id;
    }

    @Column
    public String getLogin() {
        return login;
    }

    @Column
    public String getPassword() {
        return password;
    }

    @Column
    public Date getCreated() {
        return created;
    }

    @Column
    public Date getUpdated() {
        return updated;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(getId(), account.getId()) &&
                Objects.equals(getLogin(), account.getLogin()) &&
                Objects.equals(getPassword(), account.getPassword() );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLogin(), getPassword(), getCreated(), getUpdated());
    }

    @Override
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
